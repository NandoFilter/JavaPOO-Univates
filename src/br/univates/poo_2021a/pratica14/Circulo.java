package br.univates.poo_2021a.pratica14;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

@Getter
@Setter
public class Circulo implements FormaGeometrica{

    private double raio;

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(getRaio(), 2));
    }

    @Override
    public double getPerimetro() {
        return 2 * (Math.PI) * getRaio();
    }

}
