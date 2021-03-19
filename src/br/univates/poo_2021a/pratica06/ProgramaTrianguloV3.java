package br.univates.poo_2021a.pratica06;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/16/2021
 */

public class ProgramaTrianguloV3 {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(10, 10, 14);

        System.out.println("Perímetro: " + t1.calculaPerimetro() + "m");
        System.out.println("Área: " + t1.calculaArea() + "m²");
    }
}
