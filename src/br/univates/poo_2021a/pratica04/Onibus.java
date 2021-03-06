package br.univates.poo_2021a.pratica04;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/04/2021
 */

@Getter
@Setter
public class Onibus {
    
    /** Um ônibus. O ônibus tem um limite de passageiros, eles podem
     * entrar ou sair do ônibus e, claro, pagam um valor de passagem. */ 

    int pas = 0;
    int totalPas = 0;
    int paradas = 0;
    int capacidade = 50;
    double valor = 5.5;
    double total = 0;

    public void addPassageiros(int passageiros){
        this.pas += passageiros;

        if(passageiros > 0){
           this.totalPas += passageiros;
        }

        paradas++;
    }

    public double valorTotal(){
       return this.total = this.getPas() * this.valor;
    }

}
