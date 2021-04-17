package br.univates.poo_2021a.pratica13.prova2020B;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 04/17/2021
 */

public class TelaRadio {

    /* Criar uma tela (com um pequeno menu) que permita interagir com o rádio.
    O menu deve permitir ligar ou desligar o rádio, trocar de estação ou mudar
    o modo de transmissão da estação sintonizada. Aumentar e reduzir o volume. */

    Radio radio = new Radio();
    Scanner scan = new Scanner(System.in);

    String menu = """
            ------- Menu Rádio -------
            [1] Ligar / Desligar
            [2] Trocar de Estação
            [3] Mudar Transmissão
            [4] Aumentar Volume
            [5] Diminuir Volume""";

    String menuEst = """
            ------- Estação -------
            [1] Aumentar
            [2] Diminuir
            [3] Definir
            [4] Sair""";

    public void showTela(){
        while (true){
            System.out.println(menu);
            System.out.print("Digite aqui: ");
            int opcao = scan.nextInt();

            if(opcao == 1){
                if(radio.powerButton()){
                    System.out.println("Ligando...");
                }else{
                    System.out.println("Desligando...");
                    break;
                }
            }else if(opcao == 2){
                menuEstacao();
                System.out.println("Estação: " + radio.getEstacaoFM().getFreq());
            }else if(opcao == 3){
                radio.mudarModoTransm();
                System.out.println("Transmissão: " + radio.getEstacaoFM().getModoTransm());
            }else if(opcao == 4){
                radio.aumentarVolume();
                System.out.println("Volume: " + radio.getVolume());
            }else if(opcao == 5){
                radio.diminuirVolume();
                System.out.println("Volume: " + radio.getVolume());
            }else{
                System.out.println("[!] Valor inválido");
            }
        }
    }

    public void menuEstacao(){
        while(true){
            System.out.println(menuEst);
            System.out.print("Digite aqui: ");
            int aux = scan.nextInt();

            if(aux == 1){
                radio.aumentarEst();
            }else if(aux == 2){
                radio.diminuirEst();
            }else if(aux == 3){
                System.out.print("\nDigite a estação: ");
                double valor = scan.nextDouble();
                radio.trocarEst(valor);
            }else{
                break;
            }
        }
    }

}
