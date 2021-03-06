package br.univates.poo_2021a.pratica02;

import java.util.Random;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class MegaSena {
    public static void main(String[] args) {

        /** MÓDULO+VETOR: Nossa turma adora jogar na Mega Sena,
         * principalmente quando o prêmio está acumulado. Faça um
         * programa que produz e exibe 10 jogos da Mega Sena.
         * O programa deve conter um módulo que para gerar os jogos
         * (preencher um vetor de 6 posições de forma aleatória). */

        int[] megaSena = new int[6];
        System.out.println("Números da Mega Sena: ");
        for(int i = 0; i < 10; i++){
            jogoMega(megaSena);
        }
        
    }

    public static void jogoMega(int[] megaSena){
        Random aleatorio = new Random();
        System.out.print("| ");
        for (int j = 0; j < megaSena.length; j++) {
            
            megaSena[j] = aleatorio.nextInt(60) + 1;

            // Não repetir números
            for(int k = 0; k < megaSena.length; k++){
                if(megaSena[j] == megaSena[k] && j != k){
                    megaSena[j] = aleatorio.nextInt(60) + 1; 
                }
            }

            if(megaSena[j] < 10){ // Alinhamento
               String aux = "0" + megaSena[j];
                System.out.print(aux + " | ");
            }else {
                System.out.print(megaSena[j] + " | ");
            }
        }
        System.out.println("\n-------------------------------");
    }
}