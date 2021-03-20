package br.univates.poo_2021a.exercicio03;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/18/2021
 */

public class PlanilhaJonas {
    public static void main(String[] args) {

        Planilha planilha = new Planilha();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < planilha.getAtleta().length; i++) {
            planilha.getAtleta()[i] = new Atleta();

            System.out.println("--------------- Atleta nº " + (i + 1) + " ---------------");

            System.out.print("Informe o nome: ");
            planilha.getAtleta()[i].setNome(scan.nextLine());

            System.out.print("Informe o tempo da Primeira Volta: ");
            planilha.getAtleta()[i].addTempo(scan.nextInt());

            scan.nextLine();
            System.out.println();
        }

        int num = 0;
        while (num == 0) {

            num = menu();

            // Adicionar Tempo
            if (num == 1) {
                System.out.println("-----------------");
                System.out.println("Escolha um Atleta: ");

                for (int i = 0; i < planilha.getAtleta().length; i++) {
                    System.out.println("[" + (i + 1) + "] " + planilha.getAtleta()[i].getNome());
                }

                System.out.println("[4] Cancelar");
                System.out.print("Digite aqui: ");
                int x = scan.nextInt();

                if (x < 0 || x > planilha.getAtleta().length) {
                    System.out.println("Error");
                } else if (x == 4) {
                    num = 0;
                } else {
                    System.out.print("Informe o tempo que deseja adicionar: ");
                    double t = scan.nextDouble();

                    if (t > 0) {
                        planilha.getAtleta()[x - 1].addTempo(t);
                        System.out.println("Tempo adicionado");
                        num = 0;
                    } else if (t == 0) {
                        num = 0;
                    } else {
                        System.out.println("Error");
                    }

                }

            // Resumo do Atleta
            } else if (num == 2) {

                System.out.println("-----------------");
                System.out.println("Escolha um Atleta: ");

                for (int i = 0; i < planilha.getAtleta().length; i++) {
                    System.out.println("[" + (i + 1) + "] " + planilha.getAtleta()[i].getNome());
                }

                System.out.println("[4] Cancelar");
                System.out.print("Digite aqui: ");
                int x = scan.nextInt();

                if (x < 0 || x > planilha.getAtleta().length) {
                    System.out.println("Error");
                } else if (x == 4) {
                    num = 0;
                } else {
                    System.out.println("------ Atleta " + (x) +" ------");
                    System.out.println("Nome: " + planilha.getAtleta()[x - 1].getNome().toUpperCase());
                    for (int i = 0; i < planilha.getAtleta()[x - 1].getTempo().length; i++) {
                        System.out.printf("Tempo na Volta " + (i + 1) + ": %.2fs\n", planilha.getAtleta()[x - 1].getTempo()[i]);
                    }
                    System.out.printf("Média do Atleta: %.2fs\n", planilha.getAtleta()[x - 1].getMediaAtleta());
                    num = 0;
                }

            // Resumo Total
            } else if (num == 3) {
                System.out.println("\n------ RESUMO TOTAL ------");

                // Média Total, Atletas < 10s, Volta mais Rápida e Volta mais Lenta

                System.out.printf("Média dos Tempos: %.2fs\n", planilha.getMediaTempo());

                System.out.printf("Volta mais Rápida: %.2fs\n", planilha.voltaMaisRapida());

                System.out.printf("Volta mais Lenta: %.2fs\n", planilha.voltaMaisLenta());

                System.out.println("\nAtletas com o tempo abaixo de 10s: ");
                for (int i = 0; i < planilha.getAtleta().length; i++) {

                    for (int j = 0; j < planilha.getAtleta()[i].getTempo().length; j++) {

                        if(planilha.getAtleta()[i].getTempo()[j] < 10){
                            System.out.println(planilha.getAtleta()[i].getNome() + " | Tempo: " + planilha.getAtleta()[i].getTempo()[j]);
                        }

                    }

                }
                num = 0;

            } else if (num == 4) {
                System.out.println("Cancelando...");
                break;
            }
        }

    }

    public static int menu() {
        int result = 0;
        Scanner scan = new Scanner(System.in);

        while (result <= 0 || result > 4) {
            System.out.println("------ MENU ------");
            System.out.println("[1] Adicionar tempo");
            System.out.println("[2] Resumo de Atleta");
            System.out.println("[3] Resumo Total");
            System.out.println("[4] Cancelar");
            System.out.print("Digite aqui: ");
            result = scan.nextInt();

            scan.nextLine();
            System.out.println();
        }
        return result;
    }
}
