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

    public Triangulo(){
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
    }

    /* Para construir um triângulo é necessário que a medida de
    qualquer um dos lados seja menor que a soma das medidas dos outros
    dois e maior que o valor absoluto da diferença entre essas medidas.*/

    public double calculaPerimetro(){
        double p = 0;

        while(p == 0) {
            if (getLadoA() >= (getLadoB() + getLadoC()) || getLadoA() <= (getLadoB() - getLadoC())) {
                System.out.println("Valores inválidos");
                break;
            }else if(getLadoB() >= (getLadoA() + getLadoC()) || getLadoB() <= (getLadoA() - getLadoC())){
                System.out.println("Valores inválidos");
                break;
            }else if(getLadoC() >= (getLadoA() + getLadoB()) || getLadoC() <= (getLadoA() - getLadoB())){
                System.out.println("Valores inválidos");
                break;
            }else{
                p = getLadoA() + getLadoB() + getLadoC();
            }
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
