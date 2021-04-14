package br.univates.poo_2021a.pratica12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author NandoFilter
 * @date 04/11/2021
 */

public class TelaDelivery {

    /* Um restaurante trabalha exclusivamente com delivery e
    recebe os pedidos pelos site, aplicativo ou telefone. Faça
    um sistema que ajude o proprietário a registrar todos os
    pedidos que entram para serem atendidos. Cada pedido possui
    a identificação do cliente (nome, endereço, telefone) e a
    lista de todos os itens solicitados. Os pedidos ficam enfileirados
    e vão sendo atendidos pela ordem em que foram recebidos.
    Os pedidos já atendidos podem ser descartados. */

    Scanner scan = new Scanner(System.in);
    private ArrayList<Pedido> pedidos;

    String menuPratos = """
            ------- MENU -------
            [1] Pizza Grande
            [2] Xis Filé
            [3] Prato Executivo
            [4] A la Minuta
            """;

    String menuPedido = """
            ------ Tipo de Pedido -----
            [1] Site
            [2] Aplicativo
            [3] Telefone
            [0] Cancelar
            """;

    public TelaDelivery() {
        this.pedidos = new ArrayList<>();
    }

    public void showTela() {
        while (true) {
            Pedido prato = new Pedido();
            System.out.println("----- RESTAURANTE MAMMA JULIA -----");

            int tipoPedido = novoPedido();

            if (tipoPedido == 0) {
                System.out.print("Até mais! Volte sempre. :)");
                break;
            }

            System.out.print("Digite seu nome: ");
            String nome = scan.next();

            System.out.print("Digite o endereço de entrega: ");
            String end = scan.next();

            System.out.print("Digite seu nº de telefone: ");
            long telefone = scan.nextLong();
            scan.nextLine();

            prato.addCliente(nome, end, telefone, tipoPedido);

            System.out.println("\n--------------------");
            System.out.println("Bem-vindo(a) " + nome + ", o que deseja?\n");

            pedidos.add(adicionarPrato(prato));
            continuarPedido(prato);
        }
    }


    // Métodos -------------------------------------------------------------------

    public int novoPedido() {
        System.out.println(menuPedido);
        System.out.print("Digite aqui: ");
        int tipoPedido = scan.nextInt();

        while (tipoPedido < 0 || tipoPedido > 3) {
            System.out.print("[!] Valor inválido, tente novamente: ");
            tipoPedido = scan.nextInt();
        }
        return tipoPedido;
    }

    public void validarQuantidade(int quantidade) {
        while (true) {
            if (quantidade > 0) {
                break;
            } else {
                System.out.println("[!] Quantidade inválida\n");
                System.out.print("Digite a quantidade desejada: ");
                quantidade = scan.nextInt();
            }
        }
    }

    public Pedido adicionarPrato(Pedido prato) {

        while (true) {
            System.out.println(menuPratos);
            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao > 0 && opcao < 5) {
                System.out.print("Digite a quantidade desejada: ");
                int qntd = scan.nextInt();
                scan.nextLine();

                validarQuantidade(qntd);

                System.out.print("\nAlguma observação? ");
                String obs = scan.nextLine();

                prato.addPrato(opcao, qntd, obs);
                break;
            } else {
                System.out.println("[!] Valor inválido\n");
            }
        }
        return prato;
    }

    public void continuarPedido(Pedido prato) {
        while (true) {
            System.out.println("""
                    --------------------
                    Item adicionado com sucesso!
                    [1] Continuar pedindo
                    [2] Finalizar pedido
                    --------------------""");
            int z = 0;
            while(z == 0) {
                try {
                    System.out.print("Digite aqui: ");
                    z = scan.nextInt();
                    scan.nextLine();
                } catch (InputMismatchException e) {
                    scan.nextLine();
                }
            }

            if (z == 1) {
                pedidos.add(adicionarPrato(prato));
            } else if (z == 2) {
                removePedido(prato);
                System.out.println("--------------------");
                System.out.println("Pedido finalizado!\n");
                break;
            } else {
                System.out.println("[!] Valor inválido");
            }
        }
    }

    public String imprimirPedido(Pedido prato) {
        System.out.println("--------------------");
        String lista = ("Cliente: " + prato.getNomeCliente() +
                "\nEndereço: " + prato.getEndCliente() +
                "\nTelefone: " + prato.getTelCliente() + "\n");

        for (int i = 0; i < pedidos.size(); i++) {
            lista += ("\nPrato: " + pedidos.get(i).getPratos().get(i).getNomePrato() +
                    "\nQuantidade: " + pedidos.get(i).getPratos().get(i).getQntdPrato() +
                    "\nObservação: " + pedidos.get(i).getPratos().get(i).getObsPrato() + "\n");
        }
        return lista;
    }

    public void removePedido(Pedido prato) {
        System.out.println(imprimirPedido(prato));
        pedidos.remove(0);
    }

}