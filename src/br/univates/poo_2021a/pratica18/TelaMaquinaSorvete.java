package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.Menu;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

public class TelaMaquinaSorvete {
    public static void main(String[] args) {
        MaquinaMenu mm = new MaquinaMenu();
        Menu menu = new Menu(mm);

        menu.gerarMenu();
    }
}
