package br.univates.poo_2021a.pratica10;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/30/2021
 */

@Getter
@Setter
public class Reservatorio {

    private double quantidade, limite;

    public Reservatorio(double reserva){
        this.limite = reserva;
        this.quantidade = 0;
    }

    public boolean addQuantidade(double qntd){
        boolean aux = false;

        if(getQuantidade() + qntd <= getLimite() && qntd > 0) {
            setQuantidade(getQuantidade() + qntd);
            aux = true;
        }

        return aux;
    }

    public boolean removeQuantidade(double qntd){
        boolean aux = false;

        if(getQuantidade() - qntd >= 0 && qntd > 0){
            setQuantidade(getQuantidade() - qntd);
            aux = true;
        }

        return aux;
    }

}
