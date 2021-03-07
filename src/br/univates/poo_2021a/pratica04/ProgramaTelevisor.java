package br.univates.poo_2021a.pratica04;

import java.util.Scanner;

public class ProgramaTelevisor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Televisor tv1 = new Televisor();

        int canal;
        boolean mute = false;

        tv1.ligar();
        tv1.status();

        while(tv1.ligado){
            System.out.println("----------------");
            System.out.println("[1] Trocar Canal\n[2] Aumentar Volume\n[3] Diminuir Volume\n[4] Mutar\n[5] Ver Status\n[6] Desligar");
            System.out.print("Digite aqui: ");
            int x = scan.nextInt();

            if(x == 1){
                System.out.println("----------------");
                System.out.print("Digite o nº do canal: ");
                canal = scan.nextInt();

                tv1.trocarCanal(canal);
            }else if(x == 2){
                tv1.aumentarVolume();
            }else if(x == 3){
                tv1.diminuirVolume();
            }else if(x == 4){
                if(!mute){
                    tv1.ligarMudo();
                    mute = true;
                }else{
                    tv1.desligarMudo();
                }
            }else if(x == 5){
                tv1.status();
            }else{
                System.out.println("----------------");
                System.out.println("Desligando...");
                tv1.ligado = false;
            }
        }

    }
}
