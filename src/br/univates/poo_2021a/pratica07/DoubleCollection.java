package br.univates.poo_2021a.pratica07;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * @author NandoFilter
 * @date 03/18/2021
 */

@Getter
@Setter
public class DoubleCollection {

    /* Que tal agora fazermos uma classe para simular o funcionamento
       de um vetor de números (double), mas que não seja apenas um vetor
       "burro". Que tal se pudéssemos solicitar ao vetor a média dos números,
       a soma dos números, um subvetor só com os números Acima De ou Abaixo De. */

    private double numbers[];

    public DoubleCollection(int x){
        numbers = new double[x];

        for (int i = 0; i < getLength(); i++) {
            numbers[i] = 0;
        }
    }

    public int getLength(){
        return getNumbers().length;
    }

    public double getSum(){
        double result = 0;
        for (int i = 0; i < getLength(); i++) {
            result += getNumbers()[i];
        }
        return result;
    }

    public double getAverage(){
        return getSum() / getLength();
    }

    public double getMax(){
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] > result){
                result = getNumbers()[i];
            }
        }
        return result;
    }

    public double getMin(){
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] < result){
                result = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] getEvenNumbers(){
        double even[] = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] % 2 == 0){
                even = Arrays.copyOf(even, even.length + 1);
                even[even.length - 1] = getNumbers()[i];
            }
        }
        return even;
    }

    public double[] getOddNumbers(){
        double odd[] = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] % 2 != 0){
                odd = Arrays.copyOf(odd, odd.length + 1);
                odd[odd.length - 1] = getNumbers()[i];
            }
        }
        return odd;
    }

    public double[] getGreaterThan(int x){
        double result[] = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] > x){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] getSmallerThan(int x){
        double result[] = new double [0];
        for (int i = 0; i < getLength(); i++) {
            if(getNumbers()[i] < x){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public void setNumberAt(int x, double y){
        double result[] = Arrays.copyOf(getNumbers(), getLength());
        result[x] = y;
        setNumbers(result);
    }
}
