package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica17.Menu;
import br.univates.poo_2021a.pratica17.MenuConfig;
import br.univates.poo_2021a.pratica18.ClienteMenu;
import br.univates.poo_2021a.pratica18.PropMenu;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class MenuContatos implements MenuConfig {
    private ArrayList<String> opcoes;
    private CadastroContato cs;
    private ImprimirContatos ic;

    public MenuContatos(){
        this.opcoes = new ArrayList<>();
        this.cs = new CadastroContato();
        this.ic = new ImprimirContatos();
    }

    @Override
    public ArrayList<String> getListaOpcao() {
        // Aqui se escreve as opções do Menu
        opcoes.add("[1] Adicionar Contato");
        opcoes.add("[2] Listar Contatos");
        opcoes.add("[0] Cancelar");

        return new ArrayList<>(opcoes);
    }

    @Override
    public void selecionarOpcao(int escolha) {
        System.out.println("---------------");
        if (escolha == 1) {
            cs.salvarContatos();
            System.out.println("---------------");
        } else if (escolha == 2) {
            System.out.println();
            ic.imprimir();
            System.out.println("---------------");
        } else {
            System.out.println("[!] Erro ao pedir");
        }
    }
}
