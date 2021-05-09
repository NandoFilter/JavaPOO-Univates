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
    private MaquinaSorvete ms;

    public MaquinaMenu(MaquinaSorvete maquinaSorvete) {
        this.opcoes = new ArrayList<>();
        this.ms = maquinaSorvete;
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        opcoes.add("[1] Cliente");
        opcoes.add("[2] Proprietário");
        opcoes.add("[0] Cancelar");

        return new ArrayList<>(opcoes);
    }

    @Override
    public void selecionarOpcao(int escolha) {
        System.out.println("---------------");
        if (escolha == 1) {
            System.out.println("CLIENTE\n");
            ClienteMenu cm = new ClienteMenu(ms);

            Menu menuCliente = new Menu(cm);
            menuCliente.gerarMenu();
        } else if (escolha == 2) {
            System.out.println("PROPRIETÁRIO\n");
            PropMenu pm = new PropMenu(ms);

            Menu menuProp = new Menu(pm);
            menuProp.gerarMenu();
        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }
}
