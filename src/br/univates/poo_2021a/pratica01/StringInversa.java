package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class StringInversa {
    public static void main(String[] args) {

        /** MÓDULO+STRING: Crie um programa que recebe do usuário uma
         * palavra e informe se essa palavra é ou não é um palíndromo
         * (faça um módulo para realizar esse processamento). */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = scan.nextLine().toUpperCase();
        scan.close();

        Boolean p = false;

        String inverso = inverterString(word, word.length()).toUpperCase();
        System.out.println("O Inverso de " + word + " é " + inverso);

        if(word.equals(inverso)){
            p = true;
        }
        palindromo(p);
    }

    public static String inverterString(String word, int tamanho) {
        String inverso = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            inverso += word.charAt(i);
        }
        return inverso;
    }

    public static boolean palindromo(boolean p){
        if(p){
            System.out.println("\nA palavra É um Palíndromo");
        }else{
            System.out.println("\nA palavra NÃO É um Palíndromo");
        }
        return p;
    }
}

