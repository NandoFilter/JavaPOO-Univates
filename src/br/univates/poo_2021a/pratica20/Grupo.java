package br.univates.poo_2021a.pratica20;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/20/2021
 */

@Getter
@Setter
public class Grupo {

    private int qntdGrupos, alunosPorGrupo;
    private ArrayList<String> grupo;

    public Grupo(){
        this.qntdGrupos = 0;
        this.grupo = new ArrayList<>();
    }

    public ArrayList<Alunos> addAlunos(Arquivo arq, int qntdLinhas, ArrayList<Alunos> alunos) {
        arq.abrirLeitura();

        for (int i = 0; i < qntdLinhas; i++) {
            String[] aluno = arq.lerLinha().split(";");
            alunos.add(new Alunos(aluno[0], aluno[1]));
        }
        arq.fecharArquivo();

        return alunos;
    }
}
