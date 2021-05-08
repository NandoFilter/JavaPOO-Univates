package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.Menu;
import br.univates.poo_2021a.pratica17.MenuConfig;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

public class MaquinaMenu implements MenuConfig {
    private ArrayList<String> opcoes;

    public MaquinaMenu() {
        this.opcoes = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        opcoes.add("[1] Cliente");
        opcoes.add("[2] Proprietário");
        opcoes.add("[0] Cancelar");

        ArrayList<String> escolha = new ArrayList<>(opcoes); // Passa Lista de Opções em um ArrayList
        return escolha;
    }

    @Override
    public void selecionarOpcao(int escolha) {
        System.out.println("---------------");
        if (escolha == 1) {
            System.out.println("CLIENTE\n");

            ClienteMenu cm = new ClienteMenu();

            Menu menuCliente = new Menu(cm);
            menuCliente.gerarMenu();

        } else if (escolha == 2) {
            System.out.println("Proprietário");
        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }
}
