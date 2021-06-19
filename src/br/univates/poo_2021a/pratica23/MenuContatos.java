package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica17.MenuConfig;
import br.univates.poo_2021a.pratica25.AddContato;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class MenuContatos implements MenuConfig {
    private ArrayList<String> opcoes;
    private CadastroContato cc;
    private OpcoesContatos oc;

    public MenuContatos() {
        this.opcoes = new ArrayList<>();
        this.cc = new CadastroContato();
        this.oc = new OpcoesContatos();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        opcoes.add("[1] Adicionar Contato");
        opcoes.add("[2] Listar Contatos");
        opcoes.add("[3] Editar Contatos");
        opcoes.add("[4] Excluir Contato");
        opcoes.add("[0] Cancelar");

        return new ArrayList<>(opcoes);
    }

    @Override
    public void selecionarOpcao(int escolha) {
        System.out.println("---------------");
        if (escolha == 1) {
            cc.salvarContatos();
            System.out.println("---------------");
        } else if (escolha == 2) {
            System.out.println();
            oc.imprimir();
            System.out.println("---------------");
        } else if (escolha == 3) {
            System.out.println();
            oc.editar();
            System.out.println("---------------");
        } else if (escolha == 4) {
            oc.excluir();
            System.out.println("---------------");
        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }
}
