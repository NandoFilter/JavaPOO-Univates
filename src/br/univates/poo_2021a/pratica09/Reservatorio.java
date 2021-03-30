package br.univates.poo_2021a.pratica09;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/25/2021
 */

@Getter
@Setter
public class Reservatorio {

    /* Um alambique produz cachaça por meio da destilação de caldo de cana
    fermentado. A máquina tem um reservatório inicial para o caldo de cana e
    outro para a cachaça produzida. O depósito de caldo de cana (já fermentado
    por 24 horas) tem capacidade para 100 litros e o reservatório de cachaça
    produzida tem capacidade para 500 litros. Ao iniciar uma produção esta não
    poderá ser interrompida, ou seja, se o reservatório não estiver cheio será
    produzida cachaça com a quantidade de caldo existente. */

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
