package br.univates.poo_2021a.exercicio03;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * @author NandoFilter
 * @date 03/18/2021
 */

@Getter
@Setter
public class Atleta {

    /* Jonas é preparador físico e está treinando atletas para as Olimpíadas 2021 no Japão.
    O grupo é formado por 15 atletas que estão se preparando para corrida de 100 metros rasos.
    Jonas anota os tempos de cada um em uma planilha e depois calcula a média dos tempos (geral),
    descobre o maior e menor tempo (melhor e pior atleta) e também lista os nomes daqueles que
    conseguem fazer em menos nos do que 10 segundos o percurso de 100 mts.*/

    private String nome;
    private double[] tempo;

    public Atleta() {
        this.nome = null;
        this.tempo = new double[0];
    }

    public void addTempo(double x) {
        tempo = Arrays.copyOf(getTempo(), getTempo().length + 1);
        tempo[tempo.length - 1] = x;
        setTempo(tempo);
    }

    public double getMediaAtleta(){
        double soma = 0;
        for (int i = 0; i < tempo.length; i++) {
            soma += tempo[i];
        }
        return soma / tempo.length;
    }
}
