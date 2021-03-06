package br.univates.poo_2021a.pratica03;

import java.util.Scanner;

public class ProgramaPedagioV2 {
    public static void main(String[] args) {

        int qntdCarro = 0;
        int qntdMoto = 0;
        int opr = 0;

        Scanner scan = new Scanner(System.in);

        Pedagio p = new Pedagio();

        p.qntdCarro = qntdCarro;
        p.qntdMoto = qntdMoto;

        while(opr != 3) {
            System.out.println("-----------------------");
            System.out.println("[1] Automóvel \n[2] Moto \n[3] Finalizar");
            System.out.print("Digite aqui o comando: ");
            opr = scan.nextInt();

            if (opr == 1) {
                p.carro();
            } else if (opr == 2) {
                p.moto();
            } else if (opr < 1 || opr > 3) {
                System.out.println("Comando Inválido!");
            }

        }
        scan.close();

        System.out.println("-----------------------");
        System.out.println("Quantidade de Carros ultrapassados: " + p.carro());
        System.out.println("Quantidade de Motos ultrapassadas: " + p.moto());
        System.out.printf("Dinheiro arrecadado: R$%.2f", p.valorTotal());

    }
}
