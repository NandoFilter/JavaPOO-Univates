package br.univates.poo_2021a.pratica11;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/08/2021
 */

@Getter
@Setter
public class Vagao {

    /* Um trem de carga contém até 25 vagões. Cada vagão é formatado para um certo
    tipo de carga (grãos, minério, manufaturados, etc.) e possui uma capacidade máxima
    (peso máximo em toneladas). Os vagões podem estar não estar cheios (carga atual),
    ou seja, o trem não é obrigado a levar os vagões com a carga máxima (podem estar
    com menos do que 100% de se sua capacidade). Cada vagão pode ser carregado ou
    descarregado. */

    private String type;
    private double cap, capMax;

    public Vagao(){
        this.capMax = 50; // Toneladas
        this.cap = 0;
    }

    public boolean definirTipo(int tipo){
        boolean result = false;

        if(tipo > 0 && tipo <= 3){

            if(tipo == 1){
                type = "Minérios";
            }else if(tipo == 2){
                type = "Grãos";
            }else if(tipo == 3){
                type = "Manufaturados";
            }

            result = true;
        }

        return result;
    }

    public void descarregar(){
        if(getCap() > 0){
            setCap(0);
        }
    }

    public boolean carregar(double qntd){
        boolean result = false;

        if(qntd > 0 && (getCap() + qntd) <= getCapMax()){
            setCap(getCap() + qntd);
            result = true;
        }

        return result;
    }
}