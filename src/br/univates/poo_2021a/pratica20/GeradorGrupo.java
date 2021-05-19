package br.univates.poo_2021a.pratica20;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/18/2021
 */

@Getter
@Setter
public class GeradorGrupo {

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
    private int qntdAlunosGrupo;

    public GeradorGrupo() {
        this.arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica20\\alunos-poo-2021a.csv");
        this.qntdAlunosGrupo = 0;
        this.alunos = new ArrayList<>();
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
        int x = qntdLinhas();
        arq.abrirLeitura();

        for (int i = 0; i < x; i++) {
            String[] aluno = arq.lerLinha().split(";");
            alunos.add(new Alunos(aluno[0], aluno[1]));

            System.out.println("Nome: " + aluno[0]);
            System.out.println("E-mail: " + aluno[1]);
            System.out.println("-------------------");
        }
        arq.fecharArquivo();
    }

    public static void main(String[] args) {
        GeradorGrupo gg = new GeradorGrupo();
        gg.adicionarAlunos();
    }
}
