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

    private String nomeMae, nomePai, cpf, tipoSanguineo, nacionalidade, sexo;
    private double salario;
    private Date dataNasc;

    public PessoaFisica(String nome, String endereco, String telefone, Date dataNasc) {
        super(nome, endereco, telefone);
        this.dataNasc = dataNasc;
    }

    public void definirCPF(String cpf){
        setCpf(cpf);
    }

    public void definirTipoSang(String tipoSanguineo){
        setTipoSanguineo(tipoSanguineo);
    }

    public void definirNacionalidade(String nac){
        setNacionalidade(nac);
    }

    public void definirSalario(double salario){
        setSalario(salario);
    }

    public void definirSexo(String sexo){
        setSexo(sexo);
    }

}
