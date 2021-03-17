package br.univates.poo_2021a.pratica06;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/16/2021
 */

@Getter
@Setter
public class Triangulo {

    double ladoA, ladoB, ladoC;

    public Triangulo(){
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
    }

    public double calculaPerimetro(){
        return (getLadoA() + getLadoB() + getLadoC());
    }

    public String calculaArea(){
        double p = calculaPerimetro();
        double sp = p/2;
        double area = Math.sqrt(sp * (sp - getLadoA()) * (sp - getLadoB()) * (sp - getLadoC()));
        String areaFormat = String.format("%.2f", area);

        return areaFormat;
    }

}
