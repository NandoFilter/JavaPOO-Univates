package br.univates.poo_2021a.pratica25;

/**
 * @author NandoFilter
 * @date 06/17/2021
 */

public class mainTeste {
    public static void main(String[] args) {
        EditContato ed = new EditContato();
        ed.setContentPane(ed.getter());
        ed.pack();
        ed.setVisible(true);
    }
}
