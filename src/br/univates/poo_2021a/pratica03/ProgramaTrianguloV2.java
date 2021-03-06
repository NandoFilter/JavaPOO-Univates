package br.univates.poo_2021a.pratica03;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/02/2021
 */

public class ProgramaTrianguloV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lado A: ");
        double a = scan.nextDouble();

        System.out.print("Lado B: ");
        double b = scan.nextDouble();

        System.out.print("Lado C: ");
        double c = scan.nextDouble();

        scan.close();

        Triangulo t = new Triangulo();
        t.a = a;
        t.b = b;
        t.c = c;

        System.out.println("Perímetro: " + t.calculaPerimetro() + "m");
        System.out.println("Área: " + t.calculaArea() + "m²");
    }
}
