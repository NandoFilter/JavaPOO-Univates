package br.univates.poo_2021a.pratica06;

/**
 * @author NandoFilter
 * @date 03/16/2021
 */

public class ProgramaTrianguloV3 {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();

        t1.setLadoA(10);
        t1.setLadoB(10);
        t1.setLadoC(10);
        t1.calculaPerimetro();
        t1.calculaArea();

    }
}
