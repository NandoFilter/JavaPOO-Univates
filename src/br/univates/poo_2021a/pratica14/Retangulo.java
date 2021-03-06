package br.univates.poo_2021a.pratica14;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

@Getter
@Setter
public class Retangulo implements FormaGeometrica{

    private double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(){
        this.base = 0;
        this.altura = 0;
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public double getPerimetro() {
        return (getBase() * 2) + (getAltura() * 2);
    }

}
