package br.univates.poo_2021a.pratica20;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author NandoFilter
 * @date 05/18/2021
 */

@Getter
@Setter
public class GeradorGrupo extends Grupo {

    /* Desenvolver um programa que leia os nomes dos alunos da turma de POO 2021A e organize os alunos em grupos
    (o sistema gera os grupos) de forma aleatória. O programa deve solicitar o número de membros desejados em cada
    grupo e sugerir os grupos para o professor. Se o número de membros desejado (informado pelo professor) é três,
    por exemplo, os grupos poderão eventualmente ter 2 ou 4 (um a menos ou uma a mais), caso o número de alunos da
    turma não seja múltiplo de 3. Essa regra vale para qualquer tamanho de grupo, ou seja, pode ter um membro a
    menos ou um membro a mais.

        Requisitos necessários:
        - a entrada de dados não será digitada pelo usuário via teclado, será feita a partir de leitura de um arquivo texto;
        - utilizar a classe Arquivo;
        - gravar o resultado (os grupos gerados) em um arquivo texto;
        - desenvolver usando paradigma de programação OO. */

    private Arquivo arq;
    private ArrayList<Alunos> alunos;
    ArrayList<ArrayList<Alunos>> gruposAlunos;

    public GeradorGrupo(int alunosPorGrupo) {
        this.arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica20\\alunos-poo-2021a.csv");
        this.alunos = new ArrayList<>();
        this.gruposAlunos = new ArrayList<>();

        setAlunosPorGrupo(alunosPorGrupo);
        adicionarAlunos();
    }

    public int qntdLinhas() {
        int aux = 0;

        if (arq.abrirLeitura()) {

            for (int i = -1; i < aux; i++) {
                while (arq.lerLinha() != null) {
                    aux++;
                }
            }
            arq.fecharArquivo();
        } else {
            System.out.println("Error");
        }
        
        return aux;
    }

    public void adicionarAlunos() {
        addAlunos(getArq(), qntdLinhas(), getAlunos());
    }

    public void gerarQntdGrupos() {
        int alunosRest = getAlunos().size();

        while (alunosRest >= getAlunosPorGrupo() - 1) { // Validar o valor do menor grupo possível
            setQntdGrupos(getQntdGrupos() + 1);
            alunosRest -= getAlunosPorGrupo();
        }
    }

    public void sortearGrupo() {
        ArrayList<Alunos> alunosRestantes = getAlunos();

        Collections.shuffle(alunosRestantes);

        for (int i = 0; i < getQntdGrupos(); i++) {
            ArrayList<Alunos> grupoAlunos = new ArrayList<>();

            if(i != getQntdGrupos() - 1){
                for (int j = 0; j < getAlunosPorGrupo(); j++) {
                    if(!alunosRestantes.isEmpty()) {
                        grupoAlunos.add(alunosRestantes.get(0)); // Recebe o primeiro valor sorteado
                        alunosRestantes.remove(0);         // Remove o valor sorteado das opções
                    }
                }
            } else { // Rodará no último grupo e olhará se há um aluno restante
                for (int j = 0; j < getAlunosPorGrupo() + 1; j++) {
                    if(!alunosRestantes.isEmpty()) {
                        grupoAlunos.add(alunosRestantes.get(0)); // Recebe o primeiro valor sorteado
                        alunosRestantes.remove(0);         // Remove o valor sorteado das opções
                    }
                }
            }
            getGruposAlunos().add(grupoAlunos);
        }
    }

    public void imprimirGrupo() {
        for (int i = 0; i < getGruposAlunos().size(); i++) {            // Quantidade de Grupos
            System.out.println("\n---------------- Grupo " + (i + 1) + " ----------------");
            for (int j = 0; j < getGruposAlunos().get(i).size(); j++) { // Quantidade de Alunos por Grupos
                System.out.println("[" + (j+1) + "] Aluno: " + getGruposAlunos().get(i).get(j).getNome() + " | E-mail: " + getGruposAlunos().get(i).get(j).getEmail());
            }
            System.out.println("------------------------------------------");
        }
    }

    public void show(){
        gerarQntdGrupos();
        sortearGrupo();
        imprimirGrupo();
    }
}