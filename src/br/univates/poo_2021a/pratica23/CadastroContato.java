package br.univates.poo_2021a.pratica23;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class CadastroContato {

    public void salvarContatos(){
        Scanner scanner = new Scanner(System.in);
        ContatosDao contatosDao = new ContatosDao();

        System.out.print("Insira o nome do Contato: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o número de " + nome + ": ");
        String telefone = scanner.nextLine();

        System.out.print("Insira o e-mail de " + nome + ": ");
        String email = scanner.nextLine();

        contatosDao.salvar(new Contato(nome, telefone, email));
    }

}
