package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/25/2021
 */

public class CalculaVolumeCilindro {
    public static void main(String[] args) {

        /** Marcão é um empresário que acaba de comprar uma planta industrial para produzir óleo vegetal.
         * Ele está precisando de ajuda para calcular a capacidade de uma lata de azeite e o número de latas
         * que precisa produzir para atender cada um dos pedidos. As latas de azeite são cilíndricas, ou seja,
         * o fundo e a tampa redondas e de mesmo tamanho. Faça um programa que recebe do usuário o raio da
         * base (fundo ou tampa) e a altura da lata. Então calcule o volume da lata e mostre na tela para ajudar
         * o Marcão a saber quanto cabe em cada lata (o programa deve ter um módulo para calcular o volume da lata) */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do Raio da Base da lata: ");
        double raioBase = scan.nextDouble();
        System.out.print("Digite o valor da altura da lata: ");
        double altura = scan.nextDouble();
        scan.close();

        double volume = volumeCilindro(raioBase, altura);
        String volumeFormat = String.format("%.2f", volume);
        System.out.println("O volume de cada lata é de " + volumeFormat + "mL");

    }

    public static double volumeCilindro(double r, double h){
        return Math.PI * Math.pow(r,2) * h;

    }
}
