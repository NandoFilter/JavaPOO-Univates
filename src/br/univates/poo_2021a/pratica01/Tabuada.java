package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/19/2021
 */

public class Tabuada {
    public static void main(String[] args) {

        /** Crie um sistema que recebe do usuário UM número e depois exibe a tabuada desse número */

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        scan.close();
    }
}
