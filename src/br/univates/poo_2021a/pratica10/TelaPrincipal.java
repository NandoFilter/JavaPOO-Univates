package br.univates.poo_2021a.pratica10;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/30/2021
 */

public class TelaPrincipal {

    Alambique a1 = new Alambique(100000, 500000, 100000);
    Alambique a2 = new Alambique(500000, 1200000, 200000);
    Alambique a3 = new Alambique(500000, 1200000, 200000);

    Scanner scan = new Scanner(System.in);

    // Selecionar Alambique
    public void showTelaP() {
        while (true) {
            System.out.println("[Alambique 1] Caldo de Cana: " + (a1.getReservaCaldo().getLimite() / 1000) + " litros | Cachaça: " + (a1.getReservaCach().getLimite() / 1000) + " litros");
            System.out.println("[Alambique 2] Caldo de Cana: " + (a2.getReservaCaldo().getLimite() / 1000) + " litros | Cachaça: " + (a2.getReservaCach().getLimite() / 1000) + " litros");
            System.out.println("[Alambique 3] Caldo de Cana: " + (a3.getReservaCaldo().getLimite() / 1000) + " litros | Cachaça: " + (a3.getReservaCach().getLimite() / 1000) + " litros");
            System.out.println("[Cancelar] Digite 0");
            System.out.print("Digite o comando desejado: ");

            int x = scan.nextInt();
            if (x == 1) {
                Tela tela = new Tela(a1);
                tela.showTela();
            } else if (x == 2) {
                Tela tela = new Tela(a2);
                tela.showTela();
            } else if (x == 3) {
                Tela tela = new Tela(a3);
                tela.showTela();
            } else if (x == 0) {
                System.out.println("---------------");
                System.out.println("Cancelando...");
                break;
            } else {
                System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
            }
        }
    }
}
