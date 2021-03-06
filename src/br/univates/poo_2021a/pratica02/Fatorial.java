package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class Fatorial {

    /** MÓDULO+REPETIÇÃO: Crie um programa para receber
     * um número inteiro e exibir o seu fatorial.
     * Faça, claro, um módulo para calcular o valor fatorial. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        scan.close();

        System.out.println("O Fatorial de " + num + " é " + fatorial(num));
    }

    public static int fatorial(int num){
        int somaFat = 1;
        for (int i = num; i > 0; i--) {
            somaFat = somaFat * i;
        }
        return somaFat;
    }
}
