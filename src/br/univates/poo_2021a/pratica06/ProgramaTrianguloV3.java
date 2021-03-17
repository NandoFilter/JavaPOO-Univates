package br.univates.poo_2021a.pratica06;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/16/2021
 */

public class ProgramaTrianguloV3 {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo();
        Scanner scan = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = scan.nextDouble();
        t1.setLadoA(a);

        System.out.print("Lado B: ");
        double b = scan.nextDouble();
        t1.setLadoB(b);

        System.out.print("Lado C: ");
        double c = scan.nextDouble();
        t1.setLadoC(c);

        scan.close();

        System.out.println("Perímetro: " + t1.calculaPerimetro() + "m");
        System.out.println("Área: " + t1.calculaArea() + "m²");

    }
}
