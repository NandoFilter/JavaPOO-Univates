package br.univates.poo_2021a.pratica10;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/30/2021
 */

public class Tela {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Alambique alambique1 = new Alambique(100000, 500000, 100000);
        Alambique alambique2 = new Alambique(500000, 1200000, 200000);
        Alambique alambique3 = new Alambique(500000, 1200000, 200000);

        Alambique alambique = new Alambique();

        String menu = """
                ------- TELA -------
                [1] Selecionar Alambique
                [2] Começar Produção
                [3] Status Alambique
                [4] Adicionar Caldo 
                [5] Encher Garrafas
                [6] Limpar Reservatórios 
                [0] Cancelar""";

        System.out.println("[Alambique 1] Comporta " + (alambique1.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique1.getReservaCaldo().getLimite() / 1000) + " litros de cana");
        System.out.println("[Alambique 2] Comporta " + (alambique2.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique2.getReservaCaldo().getLimite() / 1000) + " litros de cana");
        System.out.println("[Alambique 3] Comporta " + (alambique3.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique3.getReservaCaldo().getLimite() / 1000) + " litros de cana");
        System.out.print("Digite o alambique desejado: ");

        while (true) {
            int x = scan.nextInt();
            if (x == 1) {
                alambique = alambique1;
                break;
            } else if (x == 2) {
                alambique = alambique2;
                break;
            } else if (x == 3) {
                alambique = alambique3;
                break;
            } else {
                System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
            }
        }

        while (true) {
            System.out.println(menu);
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if (x == 1) {
                boolean acao = true;
                while (acao) {
                    System.out.println("\n---------------");
                    System.out.println("[Alambique 1] Comporta " + (alambique1.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique1.getReservaCaldo().getLimite() / 1000) + " litros de cana");
                    System.out.println("[Alambique 2] Comporta " + (alambique2.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique2.getReservaCaldo().getLimite() / 1000) + " litros de cana");
                    System.out.println("[Alambique 3] Comporta " + (alambique3.getReservaCach().getLimite() / 1000) + " litros de cachaça e " + (alambique3.getReservaCaldo().getLimite() / 1000) + " litros de cana");
                    System.out.println("[0] Voltar");
                    System.out.print("Digite o alambique desejado: ");

                    x = scan.nextInt();
                    if (x == 1) {
                        alambique = alambique1;
                        acao = false;
                    } else if (x == 2) {
                        alambique = alambique2;
                        acao = false;
                    } else if (x == 3) {
                        alambique = alambique3;
                        acao = false;
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
                    }
                }
            } else if (x == 2) {
                System.out.println("---------------");

                if (alambique.startProd()) {
                    System.out.println("Produção Concluída");
                } else {
                    System.out.println("Erro na Produção");
                }

            } else if (x == 3) {
                System.out.println("\n------- Quantidades -------");
                System.out.println("Caldo de Cana: " + (alambique.getReservaCaldo().getQuantidade() / 1000) + "L");
                System.out.println("Cachaça: " + (alambique.getReservaCach().getQuantidade() / 1000) + "L");
                System.out.println("Resíduo: " + (alambique.getReservaIntrm().getQuantidade() / 1000) + "L");

                System.out.println("---------------");
                System.out.println("A máquina foi utilizada " + alambique.getNumBateladas() + " vezes");

                System.out.println("---------------");
                System.out.println("No total foram produzidas " + alambique.getGarrafasCheias() + " garrafas\n");
            } else if (x == 4) {
                System.out.println("---------------");
                System.out.print("Quantidade que deseja adicionar em Litros: ");
                double qntd = scan.nextDouble();

                alambique.getReservaCaldo().addQuantidade(qntd * 1000);
            } else if (x == 5) {
                System.out.println("---------------");
                alambique.encherGarrafa();
                System.out.println("Garrafas enchidas com sucesso");
            } else if (x == 6) {
                System.out.println("""
                        ------- LIMPAR -------
                        [1] Caldo de Cana
                        [2] Cachaça
                        [3] Resíduos
                        [0] Voltar""");

                boolean acao = true;
                while (acao) {
                    System.out.print("Digite aqui: ");
                    x = scan.nextInt();

                    scan.nextLine();

                    if (x >= 1 && x <= 3) {
                        alambique.limparReservatorios(x);
                        System.out.println("---------------");
                        System.out.println("O Reservatório está limpo");
                        acao = false;
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
                    }
                }

            } else if (x == 0) {
                System.out.println("---------------");
                System.out.println("Cancelando...");
                break;
            }
        }
    }
}
