package br.univates.poo_2021a.pratica19;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/13/2021
 */

public class PessoaJuridica extends Pessoa{

    /* 3) Crie uma classe para modelar uma Pessoa Jurídica, derivada de
    Pessoa, com os atributos típicos de uma pessoa jurídica (uma empresa)
    como, por exemplo, CNPJ, nome dos sócios, nome de fantasia, etc. */

    private String cnpj, nomeFantasia;
    private ArrayList<String> nomeSocios;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.nomeSocios = new ArrayList<>();
    }

    public void adicionarNomeSocios(String nome){
        nomeSocios.add(nome);
    }

    public void removerNomeSocios(String nome){
        nomeSocios.remove(nome);
    }
}
