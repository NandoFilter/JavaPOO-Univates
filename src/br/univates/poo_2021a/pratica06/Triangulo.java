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

    private double ladoA, ladoB, ladoC;

    public Triangulo(double x, double y, double z){
        this.ladoA = x;
        this.ladoB = y;
        this.ladoC = z;
    }

    /* Para construir um triângulo é necessário que a medida de
    qualquer um dos lados seja menor que a soma das medidas dos outros
    dois e maior que o valor absoluto da diferença entre essas medidas.*/


    public double getDiff(double n1, double n2){
        return Math.max(n1, n2) - (Math.min(n1, n2));
    }

    public boolean validaTriangulo(){
        boolean result = false;
        if(getLadoA() > 0 && getLadoB() > 0 && getLadoC() > 0) {
            if (getLadoA() < (getLadoB() + getLadoC())) {
                if (getLadoB() < (getLadoA() + getLadoC())) {
                    if (getLadoC() < (getLadoA() + getLadoB())) {
                        if(getDiff(getLadoA(), getLadoC()) <= getDiff(getLadoA(), getLadoB()) + getDiff(getLadoB(), getLadoC())) {
                            result = true;
                        }
                    }
                }
            }
        }
        return result;
    }

    public double calculaPerimetro(){
        double p = 0;

        if(validaTriangulo()){
            p = getLadoA() + getLadoB() + getLadoC();
        }

        return p;
    }

    public String calculaArea(){
        double p = calculaPerimetro();
        double sp = p/2;
        double area = Math.sqrt(sp * (sp - getLadoA()) * (sp - getLadoB()) * (sp - getLadoC()));
        String areaFormat = String.format("%.2f", area);

        return areaFormat;
    }

}
