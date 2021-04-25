package br.univates.poo_2021a.pratica14;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/22/2021
 */

@Getter
@Setter
public class Losango implements FormaGeometrica{

    private double diagonalMaior, diagonalMenor, lado;

    public Losango(double diagonalMaior, double diagonalMenor, double lado){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        double area = 0;
        if(getDiagonalMaior() > getDiagonalMenor()) {
            area = (getDiagonalMaior() * getDiagonalMenor()) / 2;
        }
        return area;
    }

    @Override
    public double getPerimetro() {
        return getLado() * 4;
    }

}
