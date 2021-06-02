package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica16.Printer;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class OpcoesContatos {
    ContatosDao contatosDao = new ContatosDao();
    Scanner scanner = new Scanner(System.in);

    public void imprimir(){
        Printer impressora = new Printer();

        for (Contato contato:contatosDao.ler()) {
            impressora.addDocumento(contato);
            impressora.imprimir();
        }
    }

    public void editar(){
        System.out.println("---- Editar Contato ----");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("""
                ---- OPCOES ----
                [1] Nome
                [2] Telefone
                [3] E-mail""");
        System.out.print("Digite aqui: ");
        int opc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nInformação para alterar: ");
        String info = scanner.nextLine();

        contatosDao.editar(id, opc, info);

    }

    public void excluir(){
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        contatosDao.deletar(id);
    }

}
