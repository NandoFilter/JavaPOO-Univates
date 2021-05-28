package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica17.Menu;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class Main {
    public static void main(String[] args) {
        MenuContatos mc = new MenuContatos();
        Menu menu = new Menu(mc);

        menu.gerarMenu();
    }
}
