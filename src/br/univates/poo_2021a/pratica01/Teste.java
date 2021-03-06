package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/18/2021
 */

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;
        double y, p;
        String a;

        /**
         * Random ran = new Random();
         * ran.nextInt(30); 
         */

        System.out.print("Digite um número: ");
        x = scan.nextInt();

        System.out.print("Digite um double: ");
        y = p = scan.nextDouble();

        System.out.print("Digite uma String: ");
        a = scan.next();

        scan.close();

        System.out.println("A resposta é: " + x);
    }
}
