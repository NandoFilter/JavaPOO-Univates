package br.univates.poo_2021a.pratica03;

/**
 * @author NandoFilter
 * @date 03/02/2021*/

public class Pedagio {

    int qntdCarro, qntdMoto;

    public int carro(){
        return qntdCarro++;
    }

    public int moto(){
        return qntdMoto++;
    }

    public double valorTotal() {
        return ((qntdCarro) * 4.6) + ((qntdMoto) * 2.3);
    }

}
