package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.Menu;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

public class TelaMaquinaSorvete {
    public static void main(String[] args) {
        MaquinaSorvete ms = new MaquinaSorvete();
        MaquinaMenu mm = new MaquinaMenu(ms);
        Menu menu = new Menu(mm);

        menu.gerarMenu();

        System.out.println("\n----- Sorvetes Vendidos -----");
        System.out.println("Bolas de Morango: " + ms.getQntdBolasMor());
        System.out.println("Bolas de Chocolate: " + ms.getQntdBolasChoc());
        System.out.println("-----------------------\n");
        System.out.println("----- Saldo Atual -----");
        System.out.println("Leite: " + ms.getQntdLeite() + "mL");
        System.out.println("Emulsificante: " + ms.getQntdEmul() + "g");
        System.out.println("Essência de Morango: " + ms.getQntdEsMor() + "mL");
        System.out.println("Essência de Chocolate: " + ms.getQntdEsChoc() + "mL");
        System.out.println("-----------------------");
    }
}
