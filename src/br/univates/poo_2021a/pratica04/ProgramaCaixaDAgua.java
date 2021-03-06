package br.univates.poo_2021a.pratica04;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/06/2021
 */

public class ProgramaCaixaDAgua {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CaixaDAgua c1 = new CaixaDAgua();

        while(true) {
            System.out.println("------------------------");
            System.out.println("Caixa D'água (20000L)");
            System.out.println("[1] Adicionar Valor\n[2] Zerar Valor\n[3] Cancelar");
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if(x == 1){
                System.out.print("Digite o seu valor de consumo: ");
                double v = scan.nextDouble();
                c1.somaConsumo(v);

                if(c1.consumo > c1.limite){
                    System.out.println("------------------------");
                    System.out.println("[Error] O valor ultrapassa o limite da Caixa D'água");
                }else{
                    c1.somaConsumo(v);
                    System.out.println("------------------------");
                    System.out.println("[Valor Adicionado]");
                }
            }else if(x == 2){
                c1.zeraContador();
                System.out.println("------------------------");
                System.out.println("[Valor Zerado]");
            }else{
                break;
            }
        }
    }
}
