package br.univates.poo_2021a.pratica01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/18/2021
 */

public class Matrizes {
    public static void main(String[] args) {
        
        /**Desenvolver um programa que receba e preencha uma matriz de 4 linhas e 5 colunas
         * com números inteiros. Depois solicite para o usuário o número de uma linha e
         * apresente a soma dos números que estão naquela linha. Depois solicite para o usuário
         * o número de uma coluna e apresente a média (aritmética simples) dos números que estão naquela coluna. */

        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][5];
        int l, c;
        int somaLinha = 0;
        int somaColuna = 0;
        double media;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nDigite o número de uma linha: ");
        l = scan.nextInt();

        for (int i = 0; i < 5; i++) {
            somaLinha += matriz[l - 1][i];
        }

        System.out.println("Os valores da linha " + l + " , quando somadas, é " + somaLinha);

        System.out.print("\nDigite o número de uma coluna: ");
        c = scan.nextInt();

        for (int i = 0; i < 4; i++) {
            somaColuna += matriz[i][c - 1];
        }

        scan.close();
        media = (double) somaColuna / 4;

        System.out.println("A média da coluna " + c + " é " + media);

    }
}
