package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/19/2021
 */

public class Soma {
    public static void main(String[] args) {

        /** Crie um programa que recebe do usuário vários
         * números, até que o número zero seja digitado para
         * finalizar o processo. Ao finalizar, o sistema deve
         * exibir a soma de todos os números.*/

        Scanner scan = new Scanner(System.in);
        int n = 1;
        int soma = 0;

        while(n != 0){
            System.out.println("Digite 0 para cancelar");
            System.out.print("Digite um número: ");
            n = scan.nextInt();
            soma += n;
        }

        scan.close();
        System.out.println("A soma dos números digitados é: " + soma);

    }
}
