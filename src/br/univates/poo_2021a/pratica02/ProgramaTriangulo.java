package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class ProgramaTriangulo {
    public static void main(String[] args) {

        /** MÓDULO: Desenvolva um programa que tem como entradas
         * os lados de um triângulo e como saída a área e o perímetro
         * desse triângulo, mas faça um módulo para calcular o perímetro
         * do triângulo e um módulo para calcular a área do triângulo
         * (e outros módulos que julgar necessários).*/
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double x = scan.nextDouble();

        System.out.print("Digite o lado B: ");
        double y = scan.nextDouble();

        System.out.print("Digite o lado C: ");
        double z = scan.nextDouble();

        scan.close();
        double perimetro = calcularPerimetro(x, y, z);
        double semiP = perimetro / 2;
        double a = calcularArea(x, y, z, semiP);

        String area = String.format("%.2f", a);

        System.out.println("O valor do Perímetro é: " + perimetro + "m");
        System.out.println("O valor da Área é: " + area + "m²");
    }

    public static double calcularPerimetro(double a, double b, double c){
        return a + b + c;
    }

    public static double calcularArea(double a, double b, double c, double semiP){
        return Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c)); // Fórmula de Heron
    }
}
