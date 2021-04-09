package br.univates.poo_2021a.pratica11;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 04/08/2021
 */

public class TelaTrem {

    /* O painel do operador mostra o total de quilômetros que
    o trem já percorreu (em sua história - odômetro), o combustível
    que há no tanque, o número de vagões e o peso total que está
    sendo transportado (que está carregado). */

    Scanner scan = new Scanner(System.in);
    Trem trem = new Trem();

    public void showTelaTrem() {

        String menuTrem = """
                \n------- MENU -------
                [1] Carregar Vagões
                [2] Descarregar Vagões
                [3] Iniciar Viagem
                [4] Abastecer Combustível
                [5] Relatório
                [0] Cancelar
                """;

        String menuVagao = """
                [1] Minérios
                [2] Grãos
                [3] Manufaturados
                """;

        while (true) {
            while (trem.getNumVagao() <= 0 || trem.getNumVagao() > 25) {
                System.out.print("Quantidade de Vagões no Trem: ");
                trem.setNumVagao(scan.nextInt());
            }

            System.out.println(menuTrem);
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if (x == 1) {

                for (int i = 0; i < trem.getNumVagao(); i++) {
                    trem.getVagao()[i] = new Vagao();

                    System.out.println("\n------- VAGÃO " + (i + 1) + " -------");
                    System.out.println(menuVagao);
                    System.out.print("Digite aqui: ");

                    if (trem.getVagao()[i].definirTipo(scan.nextInt())) {
                        System.out.println("Tipo de Carga Definida");
                        System.out.print("\nDigite a quantidade, em toneladas, que deseja carregar (Máx de 50t): ");

                        if (trem.getVagao()[i].carregar(scan.nextDouble())) {
                            System.out.println("Carga adicionada\n");
                        } else {
                            System.out.println("[!] Não foi possível Carregar o Vagão\n");
                            i--;
                        }

                    } else {
                        System.out.println("Erro ao Definir Tipo de Carga");
                        i--;
                    }
                }

            } else if (x == 2) {
                System.out.print("Número do Vagão que deseja Descarregar: ");
                int a = scan.nextInt();

                if (a >= 0 && a <= trem.getNumVagao()) {
                    trem.getVagao()[a].descarregar();
                    System.out.println("O vagão foi descarregado");
                } else {
                    System.out.println("[!] Erro ao descarregar vagão");
                }

            } else if (x == 3) {
                System.out.print("Quantidade de km que deseja viajar: ");

                if (trem.viajar(scan.nextInt())) {
                    System.out.println("O Trem iniciou sua jornada");
                } else {
                    System.out.println("[!] Distância inválida");
                }

            } else if (x == 4) {
                System.out.print("Quantidade que deseja Abastecer (Máx de 300L): ");

                if (trem.abastecerTrem(scan.nextInt())) {
                    System.out.println("Trem abastecido");
                } else {
                    System.out.println("[!] Quantidade inválida");
                }
            } else if (x == 5) {
                System.out.println("\n------- RELATÓRIO -------");
                System.out.println("Quantidade de Vagões: " + trem.getNumVagao());
                System.out.println("Combustível Máximo: " + trem.getCombMax() + "L");
                System.out.println("Combustível Atual: " + trem.getComb() + "L");
                System.out.println("Odômetro: " + trem.getOdometro() + "km");
                System.out.println("--------------");

                for (int i = 0; i < trem.getNumVagao(); i++) {
                    System.out.println("Vagão " + (i + 1));
                    System.out.println("Tipo: " + trem.getVagao()[i].getType());
                    System.out.println("Capacidade Máx: " + trem.getVagao()[i].getCapMax() + "t");
                    System.out.println("Capacidade Atual: " + trem.getVagao()[i].getCap() + "t");
                    System.out.println("--------------");
                }

            } else {
                System.out.println("Cancelando...");
                break;
            }
        }
    }
}