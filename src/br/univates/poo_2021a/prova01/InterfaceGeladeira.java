package br.univates.poo_2021a.prova01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 04/20/2021
 */

public class InterfaceGeladeira {

    private Geladeira geladeira;
    Scanner scan = new Scanner(System.in);

    public InterfaceGeladeira() {
        this.geladeira = new Geladeira();
    }

    public void interfaceMenu() {

        String menuPrincipal = """
                -------------------
                [1] Administrador
                [2] Usuário
                [0] Cancelar""";

        while (true) {
            System.out.println(menuPrincipal);

            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                menuADM();
            } else if (opcao == 2) {
                menuUsu();
            } else {
                break;
            }
        }
    }

    public void menuADM() {
        while (true) {

            System.out.println("""
                    \n[1] Consultar Geladeira
                    [2] Limpar Geladeira
                    [0] Voltar""");

            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {

                System.out.println("\n--------------------");
                System.out.println("Quantidade de Alimentos Perecíveis: " + geladeira.getQntdP() + "kg");
                System.out.println("Quantidade de Alimentos Não Perecíveis: " + geladeira.getQntdNP() + "kg");
                System.out.println("Quantidade Total de Alimentos: " + (geladeira.getQntdP() + geladeira.getQntdNP()) + "kg");
                System.out.println("--------------------");

            } else if (opcao == 2) {

                geladeira.limparGeladeira();
                System.out.println("\n--------------------");
                System.out.println("Geladeira limpa com sucesso!");
                System.out.println("--------------------");

            } else if (opcao == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("[!] Error");
            }
        }
    }

    public void menuUsu() {
        String menuTipo = """
                \n----- Tipo de Alimento -----
                [1] Perecível
                [2] Não Perecível""";

        while (true) {

            System.out.println("""
                    \n[1] Doar Alimentos
                    [2] Consumir Alimentos
                    [0] Voltar""");

            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {

                System.out.println(menuTipo);
                System.out.print("Digite o tipo: ");
                int tipoAlimento = scan.nextInt();
                scan.nextLine();

                System.out.print("Quantidade que deseja doar: ");
                int qntdDoacao = scan.nextInt();
                scan.nextLine();

                if (geladeira.receberDoacao(tipoAlimento, qntdDoacao)) {
                    System.out.println("Doação Realizada com Sucesso!");
                } else {
                    System.out.println("[!] Erro ao Doar");
                }

            } else if (opcao == 2) {

                System.out.println(menuTipo);
                System.out.print("Digite o tipo: ");
                int tipoAlimento = scan.nextInt();
                scan.nextLine();

                System.out.print("Quantidade que deseja consumir: ");
                int qntdCons = scan.nextInt();
                scan.nextLine();

                if (geladeira.consumirAlimentos(tipoAlimento, qntdCons)) {
                    System.out.println("Alimento Consumido com Sucesso!");
                } else {
                    System.out.println("[!] Erro ao Consumir");
                }

            } else if (opcao == 0) {
                System.out.println();
                break;
            } else {
                System.out.println("[!] Error");
            }
        }
    }
}
