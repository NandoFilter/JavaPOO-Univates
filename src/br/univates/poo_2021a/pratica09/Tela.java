package br.univates.poo_2021a.pratica09;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 25/03/2021
 */

public class Tela {
    public static void main(String[] args) {

        Alambique alambique = new Alambique();
        Scanner scan = new Scanner(System.in);

        /*
        Você também poderá produzir cachaça com o líquido (caldo de cana) existente no
        primeiro reservatório, mas para isso é preciso saber se há espaço para os resíduos
        e para o líquido que será produzido. A qualquer tempo é possível consultar o nível
        de cada reservatório; o número de garrafas produzidas no estoque da fábrica de cachaça
        e o número de vezes que a máquina foi usada (contador de bateladas).
        */

        String menu = """
                ------- TELA -------
                [1] Começar Produção
                [2] Status Alambique
                [3] Adicionar Caldo 
                [4] Encher Garrafas
                [5] Limpar Reservatórios 
                [0] Cancelar""";

        while (true) {
            System.out.println(menu);
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if (x == 1) {
                System.out.println("---------------");

                if (alambique.startProd()) {
                    System.out.println("Produção Concluída");
                } else {
                    System.out.println("Erro na Produção");
                }

            } else if (x == 2) {
                System.out.println("\n------- Quantidades -------");
                System.out.println("Caldo de Cana: " + (alambique.getReservaCaldo().getQuantidade() / 1000) + "L");
                System.out.println("Cachaça: " + (alambique.getReservaCach().getQuantidade() / 1000) + "L");
                System.out.println("Resíduo: " + (alambique.getReservaIntrm().getQuantidade() / 1000) + "L");

                System.out.println("---------------");
                System.out.println("A máquina foi utilizada " + alambique.getNumBateladas() + " vezes");

                System.out.println("---------------");
                System.out.println("No total foram produzidas " + alambique.getGarrafasCheias() + " garrafas\n");
            } else if(x == 3){
                System.out.println("---------------");
                System.out.print("Quantidade que deseja adicionar em Litros: ");
                double qntd = scan.nextDouble();

                alambique.getReservaCaldo().addQuantidade(qntd * 1000);
            } else if (x == 4) {
                System.out.println("---------------");
                alambique.encherGarrafa();
                System.out.println("Garrafas enchidas com sucesso");
            } else if (x == 5) {
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
