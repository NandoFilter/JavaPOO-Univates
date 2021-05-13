package br.univates.poo_2021a.pratica19;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 05/13/2021
 */

@Getter
@Setter
public class Pessoa {

    /* 1) Crie uma classe para representar uma Pessoa, contendo os atributos
    comuns a qualquer pessoa como, por exemplo, nome, endereço, telefone, etc. */

    private String nome, endereco, telefone;

    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void definirEndereco(String endereco){
        setEndereco(endereco);
    }

    public void definirTelefone(String endereco){
        setEndereco(endereco);
    }


}
