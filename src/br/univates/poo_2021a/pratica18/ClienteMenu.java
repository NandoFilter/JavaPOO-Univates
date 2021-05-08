package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.MenuConfig;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

public class ClienteMenu implements MenuConfig {
    private ArrayList<String> opcoes;
    private MaquinaSorvete ms;
    Scanner scanner = new Scanner(System.in);

    public ClienteMenu() {
        this.opcoes = new ArrayList<>();
        this.ms = new MaquinaSorvete();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        opcoes.add("[1] Escolher Sabor");
        opcoes.add("[2] Comprar Bola de Sorvete");
        opcoes.add("[3] Comprar Litro de Sorvete");
        opcoes.add("[0] Cancelar");

        ArrayList<String> escolha = new ArrayList<>(opcoes); // Passa Lista de Opções em um ArrayList
        return escolha;
    }

    @Override
    public void selecionarOpcao(int escolha) { // Execução após selecionar opção
        System.out.println("---------------");
        if (escolha == 1) {

            while(true) {
                System.out.println("[1] Morango");
                System.out.println("[2] Chocolate");
                System.out.print("Digite aqui: ");

                if (ms.escolherSabor(scanner.nextInt())) {
                    System.out.println("Sabor selecionado");
                    break;
                } else {
                    System.out.println("[!] Error ao selecionar sabor, digite novamente");
                }
            }

        } else if (escolha == 2) {

            if(ms.comprarBola()) {
                System.out.println("Bola de Sorvete comprado");
            } else {
                System.out.println("[!] Erro ao comprar bola de sorvete");
            }

        } else if (escolha == 3) {

            if(ms.comprarLitro()) {
                System.out.println("Litro de Sorvete comprado");
            } else {
                System.out.println("[!] Erro ao comprar litro de sorvete");
            }

        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }

}
