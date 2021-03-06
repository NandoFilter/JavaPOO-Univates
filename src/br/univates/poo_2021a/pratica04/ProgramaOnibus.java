package br.univates.poo_2021a.pratica04;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/04/2021
 */

public class ProgramaOnibus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Onibus onibus = new Onibus();

        System.out.println("Informe a quantidade de pessoas na parada [0 para Cancelar]: ");
        int pas = scan.nextInt();
        onibus.setPas(pas);

        if(pas != 0){
            System.out.println(onibus.getPas());
        }else{

        }
    }
}
