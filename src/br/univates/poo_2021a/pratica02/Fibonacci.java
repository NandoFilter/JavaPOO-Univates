package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class Fibonacci {
    public static void main(String[] args) {

        /** DESAFIO: Programe um módulo que retorne um
         * determinado termo da série de Fibonacci.
         * Depois escreva um programa que
         * exibe os 10 primeiros termos
         * (é bem fácil de fazer usando recursividade). */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o termo de Fibonacci que desejar: ");
        int termo = scan.nextInt();
        scan.close();

        System.out.println("O valor do " + termo + "º termo é: " + termoFibonacci(termo));

        System.out.println("\nOs 10 Primeiros termos de Fibonacci: ");
        fibonacci();
    }

    public static int termoFibonacci(int termo){
        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i <= (termo/2) - 2; i++) {
            n1 += n2;
            n2 += n1;
        }
        return n2;
    }

    public static void fibonacci(){
        int n1 = 1;
        int n2 = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.print(n1 + " " + n2 + " ");
            n1 += n2;
            n2 += n1;
        }

    }
}
