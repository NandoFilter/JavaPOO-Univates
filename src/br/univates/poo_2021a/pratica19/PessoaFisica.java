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
public class PessoaFisica extends Pessoa {

    /* 2) Crie uma classe para modelar uma Pessoa Física, derivada de Pessoa, com os atributos
    típicos de uma pessoa física como, por exemplo, salário, data de nascimento, nome do mãe, etc.  */

    private String nomeMae, nomePai, cpf, tipoSanguineo, nacionalidade, sexo;;
    private double salario;
    private Date dataNasc;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String tipoSanguineo, String nacionalidade, String sexo, Date dataNasc) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }

    public void definirSalario(double salario){
        setSalario(salario);
    }

}
