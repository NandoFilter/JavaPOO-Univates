package br.univates.poo_2021a.pratica01;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/19/2021
 */

public class Rodovia {
    public static void main(String[] args) {

        /** Uma rodovia tem limite de peso para tráfego de veículos pesados.
         * Crie um programa que solicita ao usuário o peso de um caminhão
         * carregado e se esse for superior a 40 mil kg, exiba uma mensagem
         * informando ao motorista que ele está multado e não deve prosseguir
         * viajando. Caso contrário, o sistema deve exibir “boa viagem”. */

        Scanner scan = new Scanner(System.in);
        Double carga;

        System.out.print("Digite o peso da carga do caminhão em kg: ");
        carga = scan.nextDouble();
        scan.close();
        if(carga > 40000){
            System.out.println("Você está multado e não pode continuar sua viagem!");
        }else{
            System.out.println("Boa viagem!");
        }

    }
}
