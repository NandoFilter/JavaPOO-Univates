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
public class Motorista extends Funcionario {

    /* 6) Crie uma classe Motorista que é herdeira de Funcionário e
    tem adicionalmente o número da CNH e data de vencimento da CNH. */

    private String cnh;
    private Date dataVencimentoCNH;

    public Motorista(String nome, String endereco, String telefone, Date dataNasc) {
        super(nome, endereco, telefone, dataNasc);
    }

    public void definirCNH(String cnh){
        setCnh(cnh);
    }

    public void definirDataVencCNH(Date dataVencCNH){
        setDataVencimentoCNH(dataVencCNH);
    }

}
