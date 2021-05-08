package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.MenuConfig;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

public class SaboresMenu implements MenuConfig {
    private ArrayList<String> opcoes;

    public SaboresMenu() {
        this.opcoes = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        opcoes.add("[1] Morango");
        opcoes.add("[2] Chocolate");
        opcoes.add("[0] Cancelar");

        ArrayList<String> escolha = new ArrayList<>(opcoes);
        return escolha;
    }

    @Override
    public void selecionarOpcao(int escolha) {
        if (escolha == 1) {

        } else if (escolha == 2) {

        } else {

        }
    }
}
