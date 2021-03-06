package br.univates.poo_2021a.pratica04;

/**
 * @author NandoFilter
 * @date 03/06/2021
 */

public class CaixaDAgua {

    /* Uma caixa d´água inteligente. Nessa caixa a água que sai é contabilizada
    em um contador de consumo. O contador de consumo pode ser zerado a qualquer momento.
    É uma caixa d'água de um prédio, portanto, que recebe água da rua, armazena água e
    fornece água para os apartamentos (saída de água).*/

    double consumo = 0;
    double limite = 20000;

    public void zeraContador(){
        consumo = 0;
    }

    public void somaConsumo(double x){
        consumo += x;
    }

}
