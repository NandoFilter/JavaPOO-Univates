package br.univates.poo_2021a.pratica18;

import br.univates.poo_2021a.pratica17.MenuConfig;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/08/2021
 */

/* Deve ter uma interface que permita ao dono do estabelecimento recarregar os ingredientes.
Ao final do expediente o proprietário quer saber quantas bolas de sorvete de cada tipo foram
vendidas e poderá também querer saber o saldo existente de cada ingrediente */

public class PropMenu implements MenuConfig {
    private ArrayList<String> opcoes;
    private MaquinaSorvete ms;

    public PropMenu(MaquinaSorvete maquinaSorvete){
        this.opcoes = new ArrayList<>();
        this.ms = maquinaSorvete;
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        opcoes.add("[1] Exibir Saldo Atual dos Ingredientes");
        opcoes.add("[2] Recarregar Ingredientes");
        opcoes.add("[3] Quantidade de Sorvete Vendido");
        opcoes.add("[0] Voltar");

        return new ArrayList<>(opcoes);
    }

    @Override
    public void selecionarOpcao(int escolha) {
        System.out.println("---------------");
        if (escolha == 1) {
            System.out.println("----- Saldo Atual -----");
            System.out.println("Leite: " + ms.getQntdLeite() + "mL");
            System.out.println("Emulsificante: " + ms.getQntdEmul() + "g");
            System.out.println("Essência de Morango: " + ms.getQntdEsMor() + "mL");
            System.out.println("Essência de Chocolate: " + ms.getQntdEsChoc() + "mL");
            System.out.println("-----------------------");
        } else if (escolha == 2) {
            ms.recarregarLeite();
            ms.recarregarEmul();
            ms.recarregarEsMor();
            ms.recarregarEsChoc();
            System.out.println("Ingrediente Recarregados com Sucesso!");
        } else if (escolha == 3) {
            System.out.println("----- Sorvetes Vendidos -----");
            System.out.println("Bolas de Morango: " + ms.getQntdBolasMor());
            System.out.println("Bolas de Chocolate: " + ms.getQntdBolasChoc());
            System.out.println("-----------------------");
        }
    }
}
