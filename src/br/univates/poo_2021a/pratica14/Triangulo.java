package br.univates.poo_2021a.pratica14;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

@Getter
@Setter
public class Triangulo implements FormaGeometrica{

    private double ladoA, ladoB, ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double getArea() {
        double sp = getPerimetro() / 2;
        return Math.sqrt(sp * (sp - getLadoA()) * (sp - getLadoB()) * (sp - getLadoC()));
    }

    @Override
    public double getPerimetro() {
        return getLadoA() + getLadoB() + getLadoC();
    }

}
