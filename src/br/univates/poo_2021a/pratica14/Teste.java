package br.univates.poo_2021a.pratica14;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

public class Teste {
    public static void main(String[] args) {

        Retangulo r = new Retangulo();
        Triangulo t = new Triangulo();
        Circulo c = new Circulo();
        Losango l = new Losango();

        r.setAltura(10);
        r.setBase(10);
        System.out.println("Área Retângulo: " + r.getArea());

        t.setLadoA(20);
        t.setLadoB(20);
        t.setLadoC(20);
        System.out.println("Área Triângulo: " + t.getArea());

        c.setRaio(20);
        System.out.println("Área Circulo: " + c.getArea());

        l.setDiagonalMaior(25);
        l.setDiagonalMenor(15);
        System.out.println("Área Losango: " + l.getArea());

        System.out.println("\nÁrea entre duas formas geométricas: " + somarAreas(r, t, c, l));

    }

    public static double somarAreas(FormaGeometrica g1, FormaGeometrica g2, FormaGeometrica g3, FormaGeometrica g4){
        double w = g1.getArea();
        double x = g2.getArea();
        double y = g3.getArea();
        double z = g4.getArea();

        return w + x + y + z;
    }
}
