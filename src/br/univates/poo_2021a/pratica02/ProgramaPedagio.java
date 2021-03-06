package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/19/2021
 */

public class ProgramaPedagio {
    public static void main(String[] args) {

        /** Novos pedágios foram inaugurados na BR 386. Crie um sistema
         * para computar o tráfego. Quando um veículo chega na cancela
         * o operador vai digitar 1 para automóveis, 2 para motos, 3 para
         * finalizar o expediente. Ao final do expediente o sistema deve
         * exibir quantos carros passaram, quantas motos passaram e quanto
         * dinheiro foi arrecadado. R$ 4,60 carro. R$ 2,30 moto. */

        int qntdCarro = 0;
        int qntdMoto = 0;
        int opr = 0;
        double total = 0;

        Scanner scan = new Scanner(System.in);

        while(opr != 3) {
            System.out.println("-----------------------");
            System.out.println("[1] Automóvel \n[2] Moto \n[3] Finalizar");
            System.out.print("Digite aqui o comando: ");
            opr = scan.nextInt();

            if (opr == 1) {
                qntdCarro++;
            } else if (opr == 2) {
                qntdMoto++;
            } else if (opr < 1 || opr > 3){
                System.out.println("Comando Inválido!");
            }

        }
        scan.close();
        total = (qntdCarro * 4.6) + (qntdMoto * 2.3);

        System.out.println("-----------------------");
        System.out.println("Quantidade de Carros ultrapassados: " + qntdCarro);
        System.out.println("Quantidade de Motos ultrapassadas: " + qntdMoto);
        System.out.printf("Dinheiro arrecadado: R$%.2f", total);
    }
}
