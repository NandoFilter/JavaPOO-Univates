package br.univates.poo_2021a.pratica04;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/06/2021
 */

public class ProgramaOnibus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Onibus onibus = new Onibus();

        while(true) {
            System.out.print("Informe a movimentação de pessoas na parada [Cancelar -> 0]: ");
            int pas = scan.nextInt();
            onibus.addPassageiros(pas);

            if (pas != 0) {
                if (onibus.getPas() > onibus.getCapacidade()) {
                    System.out.println("Limite máximo de " + onibus.getCapacidade() + " pessoas.");
                    onibus.setPas(onibus.getCapacidade());
                } else if (onibus.getPas() < 0) {
                    System.out.println("[Error] Não há essa quantidade de passageiros dentro do Ônibus para sair");
                    onibus.setPas(0);
                }
                System.out.println("Passageiros: " + onibus.getPas());
                System.out.println("Total de Passageiros: " + onibus.getTotalPas());
                System.out.println("Lugares Vagos: " + (onibus.getCapacidade() - onibus.getTotalPas()));
            } else {
                System.out.println("Valor Total: R$");
                System.out.printf("%.2f", onibus.valorTotal());
                System.out.println("Foram feitas " + onibus.getParadas() + " paradas com o total de " + onibus.getTotalPas() + " passageiros no dia.");
                break;
            }
        }
    }
}
