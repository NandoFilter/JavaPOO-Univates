package br.univates.poo_2021a.exercicio03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Planilha {

    private Atleta[] atleta;

    public Planilha(){
        this.atleta = new Atleta[15];
        for (int i = 0; i < atleta.length; i++) {
            atleta[i] = new Atleta();
        }
    }

    public double getMediaTempo() {
        double soma = 0;
        for (int i = 0; i < atleta.length; i++) {

            for (int j = 0; j < atleta[i].getTempo().length; j++) {
                soma += atleta[i].getTempo()[j];
            }

        }
        return soma / atleta.length;
    }

    public double voltaMaisRapida() {
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < atleta.length; i++) {

            for (int j = 0; j < atleta[i].getTempo().length; j++) {

                if (atleta[i].getTempo()[j] < result) {
                    result = atleta[i].getTempo()[j];
                }

            }

        }
        return result;
    }

    public double voltaMaisLenta() {
        double result = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < atleta.length; i++) {

            for (int j = 0; j < atleta[i].getTempo().length; j++) {

                if (atleta[i].getTempo()[j] > result) {
                    result = atleta[i].getTempo()[j];
                }

            }

        }
        return result;
    }

}
