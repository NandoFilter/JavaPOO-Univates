package br.univates.poo_2021a.pratica08;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/23/2021
 */

public class ProgramaClub {
    public static void main(String[] args) {

        Club cb = new Club(200);
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = menuClub();

            if (x == 1) {
                System.out.println("\n--------------------");
                System.out.println("[1] Homem");
                System.out.println("[2] Mulher");
                System.out.print("Digite aqui: ");
                int aux = scan.nextInt();

                System.out.print("\nAgora digite a quantidade: ");
                int qntd = scan.nextInt();

                if (aux == 1) {

                    if (cb.addMan(qntd)) {
                        System.out.println("\n[Pessoas Adicionadas]");
                    } else {
                        System.out.println("\n[Valor inválido]");
                    }

                } else if (aux == 2) {

                    if (cb.addWoman(qntd)) {
                        System.out.println("\n[Pessoas Adicionadas]");
                    } else {
                        System.out.println("\n[Valor inválido]");
                    }
                }

            } else if (x == 2) {
                System.out.println("\n--------------------");
                System.out.print("Digite a quantidade: ");
                int aux = scan.nextInt();

                if (cb.leaveClub(aux)) {
                    System.out.println("\n[Pessoas Removidas]");
                } else {
                    System.out.println("\n[Valor inválido]");
                }

            } else if (x == 3) {
                System.out.println("\n--------------------");
                System.out.println("Valor Total em Caixa: R$" + cb.getTotal());
            } else if (x == 4) {
                System.out.println("\n--------------------");
                System.out.println("Lotação Atual: " + (cb.getPeople()));
            } else if (x == 0) {
                System.out.println("\n--------------------");
                System.out.println("Cancelando...");
                break;
            }
        }
    }

    public static int menuClub() {
        Scanner scan = new Scanner(System.in);
        int result;

        System.out.println("------- MENU -------");
        System.out.println("[1] Entrar pessoas");
        System.out.println("[2] Sair pessoas");
        System.out.println("[3] Consultar Valor em caixa");
        System.out.println("[4] Consultar Lotação Atual");
        System.out.println("[0] Cancelar");
        System.out.print("Digite aqui: ");
        result = scan.nextInt();

        return result;
    }
}
