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
public class Funcionario extends PessoaFisica {

    /* 4) Crie uma classe Funcionário que é herdeira de Pessoa Física e tem (a mais)
    o número da CTPS, data de admissão, salário e outros atributos típicos de funcionários. */

    private String ctps;
    private Date dataAdmissao;

    public Funcionario(String nome, String endereco, String telefone, Date dataNasc) {
        super(nome, endereco, telefone, dataNasc);
    }

    public void definirCTPS(String ctps){
        setCtps(ctps);
    }

    public void definirDataAdmissao(Date data){
        setDataAdmissao(data);
    }
}
