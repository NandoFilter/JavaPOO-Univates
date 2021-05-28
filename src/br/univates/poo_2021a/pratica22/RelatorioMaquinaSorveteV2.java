package br.univates.poo_2021a.pratica22;

import br.univates.poo_2021a.pratica17.Menu;
import br.univates.poo_2021a.pratica18.MaquinaMenu;
import br.univates.poo_2021a.pratica18.MaquinaSorvete;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/25/2021
 */

public class RelatorioMaquinaSorveteV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MaquinaSorveteDao maquinaSorveteDao = new MaquinaSorveteDao();
        MaquinaSorvete ms = maquinaSorveteDao.ler();

        if(ms == null){
            ms = new MaquinaSorvete(0, 0, 0, 0);
        }

        System.out.print("Leite Atual: " + ms.getQntdLeite() + " | Novo Valor: ");
        int leite = scanner.nextInt();

        System.out.print("Emulsificante Atual: " + ms.getQntdEmul() + " | Novo Valor: ");
        int emul = scanner.nextInt();

        System.out.print("Extrato de Morango Atual: " + ms.getQntdEsMor() + " | Novo Valor: ");
        int esMor = scanner.nextInt();

        System.out.print("Extrato de Chocolate Atual: " + ms.getQntdEsChoc() + " | Novo Valor: ");
        int esChoc = scanner.nextInt();

        ms.setQntdLeite(leite);
        ms.setQntdEmul(emul);
        ms.setQntdEsMor(esMor);
        ms.setQntdEsChoc(esChoc);

        MaquinaMenu mm = new MaquinaMenu(ms);
        Menu menu = new Menu(mm);

        System.out.println();
        menu.gerarMenu();

        maquinaSorveteDao.salvar(ms);
        System.exit(0);
    }
}
