package br.univates.poo_2021a.pratica16;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 04/27/2021
 */

@Getter
@Setter
public class Menu {

    /* Criar uma classe para gerar menus. Não se tratar de gerar uma
    tela (tela é tela, menu é menu). Trata-se de uma classe para gerar
    um menu, que depois poderá até ser posto em uma tela. A Ideia é
    exibir uma lista de opções e executar o código correspondente a
    opção selecionada pelo usuário. */

    private ArrayList<MenuConfig> itens;

    public Menu() {
        itens = new ArrayList<>();
    }

    public void addMenu(MenuConfig menu){
        itens.add(menu);
    }

    public void gerarMenu(){
        MenuConfig config = itens.remove(0); // Inicializar MenuConfig

        config.prepararMenu();
        ArrayList<String> list = config.getProximaOpcao();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Pedido p = new Pedido();
        Menu menu = new Menu();
        menu.addMenu(p);

        menu.gerarMenu();
    }
}
