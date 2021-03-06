package br.univates.poo_2021a.pratica17;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

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

    public Menu(MenuConfig menu) {
        itens = new ArrayList<>();
        itens.add(menu); // Adicionando Menu no ArrayList
    }

    public void gerarMenu() {
        MenuConfig config = itens.remove(0); // Inicializar MenuConfig
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = config.getListaOpcao(); // Opções do Menu

        // Selecionar Opção do Menu
        while(true) {
            for (String listaOp : list) {
                System.out.println(listaOp);
            }

            System.out.print("Digite aqui: ");
            int x = scanner.nextInt();
            scanner.nextLine();

            if(x > 0) {
                config.selecionarOpcao(x);
                System.out.println();
            } else { // Cancelar Ação
                break;
            }
        }
    }
}
