package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/19/2021
 */

public class MediaPositivos {
    public static void main(String[] args) {

        /** Crie um programa que recebe do usuário
         * vários números, até que o número zero seja digitado
         * para finalizar o processo. Ao finalizar o processo o
         * sistema deve exibir a média de todos os números positivos. */

        Scanner scan = new Scanner(System.in);
        int n = 1;
        int somaPar = 0;
        int qntdNum = 0;
        double media = 0;

        while (n != 0) {
            System.out.println("Digite 0 para cancelar");
            System.out.print("Digite um número: ");
            n = scan.nextInt();

            if (n % 2 == 0 && n != 0) {
                somaPar += n;
                qntdNum++;
            }
        }

        scan.close();
        media = (double) somaPar/ qntdNum;
        System.out.println("A média de todos os números pares é: " + media);


    }
}
