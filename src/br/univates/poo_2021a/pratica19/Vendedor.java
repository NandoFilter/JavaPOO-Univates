package br.univates.poo_2021a.pratica19;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author NandoFilter
 * @date 05/13/2021
 */

@Getter
@Setter
public class Vendedor extends Funcionario {

    /* 5) Crie uma classe Vendedor que é herdeira de Funcionário e tem
    adicionalmente o percentual de comissão que recebe sobre as vendas. */

    private double percComissao;

    public Vendedor(String nome, String endereco, String telefone, Date dataNasc) {
        super(nome, endereco, telefone, dataNasc);
    }

    public void definirPerComissao(double perc){
        setPercComissao(perc / 100);
    }

}
