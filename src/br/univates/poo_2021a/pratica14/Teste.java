package br.univates.poo_2021a.pratica14;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

public class Teste {
    public static void main(String[] args) {

        Retangulo r = new Retangulo(10, 10);
        Triangulo t = new Triangulo(20, 20, 20);
        Circulo c = new Circulo(20);
        Losango l = new Losango(25, 15, 10);

        System.out.println("Área Retângulo: " + r.getArea());
        System.out.println("Área Triângulo: " + t.getArea());
        System.out.println("Área Circulo: " + c.getArea());
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
