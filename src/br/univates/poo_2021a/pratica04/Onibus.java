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

    int pas, totalPas, paradas;
    int capacidade = 50;
    double total;


}
