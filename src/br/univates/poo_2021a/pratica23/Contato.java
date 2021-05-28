package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica16.Documento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

@Getter
@Setter
public class Contato implements Documento {

    private String nome, telefone, email;
    private ArrayList<String> linhas;

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.linhas = new ArrayList<>();
    }

    public String toString(){
        return getNome() + ";" + getTelefone() + ";" + getEmail();
    }

    @Override
    public String getProximaLinha() {
        String linha = null;
        if(linhas.size() > 0){
            linha = linhas.remove(0);
        }
        return linha;
    }

    @Override
    public void prepararDocumento() {
        linhas.clear();
        linhas.add("----------------");
        linhas.add("Nome: " + getNome());
        linhas.add("Telefone: " + getTelefone());
        linhas.add("E-mail: " + getEmail());
    }
}
