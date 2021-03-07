package br.univates.poo_2021a.pratica04;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/07/2021
 */

public class ProgramaData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.println("-----DATA-----");
            System.out.println("[1] Digitar data");
            System.out.println("[2] Data Atual");
            System.out.println("[3] Cancelar");
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if (x == 1) {
                System.out.println("--------------");
                System.out.print("Dia: ");
                int dia = scan.nextInt();
                System.out.print("Mês: ");
                int mes = scan.nextInt();
                System.out.print("Ano: ");
                int ano = scan.nextInt();
                System.out.println(data.getCustomData(dia, mes - 1, ano));
            } else if (x == 2) {
                System.out.println("--------------");
                System.out.println("[1] Apenas Data");
                System.out.println("[2] Data e Hora");
                System.out.print("Digite aqui: ");
                int y = scan.nextInt();

                System.out.println("--------------");
                if(y == 1){
                    System.out.println(data.getDataAtual());
                }else if(y == 2){
                    System.out.println(data.getDataAtualHora());
                }
            } else {
                break;
            }
        }
    }
}
