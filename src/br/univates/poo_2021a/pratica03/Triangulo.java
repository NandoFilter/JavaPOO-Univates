package br.univates.poo_2021a.pratica03;

/**
 * @author NandoFilter
 * @date 03/02/2021
 */

public class Triangulo {

    double a, b, c;

    public double calculaPerimetro(){
        return a + b + c;
    }

    public String calculaArea(){
        double p = calculaPerimetro();
        double sp = p/2;
        double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        String areaFormat = String.format("%.2f", area);

        return areaFormat;
    }
}
