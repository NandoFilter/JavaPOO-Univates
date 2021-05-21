package br.univates.poo_2021a.pratica20;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/20/2021
 */

public class TelaGrupo {
    public static void main(String[] args) {
        System.out.print("Quantidade de Alunos por Grupo: ");
        GeradorGrupo geradorGrupo = new GeradorGrupo(new Scanner(System.in).nextInt());

        geradorGrupo.show();
    }
}
