package br.univates.poo_2021a.pratica16;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 04/27/2021
 */

@Getter
@Setter
public class Pedido implements MenuConfig {
    private ArrayList<String> pedidos;

    public Pedido() {
        this.pedidos = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        pedidos.add("[1] Salada");
        pedidos.add("[2] Costela");
        pedidos.add("[3] Macarrão");
        pedidos.add("[0] Cancelar");

        ArrayList<String> opcao = new ArrayList<>(pedidos); // Passa Lista de Opções em um ArrayList
        return opcao;
    }

    @Override
    public void selecionarOpcao(int opcao) { // Execução após selecionar opção
        System.out.println("---------------");
        if (opcao == 1) {
            System.out.println("Salada comprada");
        } else if (opcao == 2) {
            System.out.println("Costela comprada");
        } else if (opcao == 3) {
            System.out.println("Macarrão comprado");
        } else if (opcao == 0) {
            System.out.println("Finalizando...");
            System.exit(1);
        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }
}
