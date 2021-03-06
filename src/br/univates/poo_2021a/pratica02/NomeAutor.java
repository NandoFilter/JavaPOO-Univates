package br.univates.poo_2021a.pratica02;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 02/23/2021
 */

public class NomeAutor {
    public static void main(String[] args) {

        /** MÓDULO+STRING: Você está com necessidade de fazer uma grana extra
         * e resolveu escrever trabalhos nas normas da ABNT para os colegas.
         * Segundo a norma a bibliografia deve iniciar pelo nome do autor,
         * porém em um formato especial ou seja, primeiro o sobrenome,
         * uma vírgula e então as iniciais do nome seguidas de um ponto.
         * Exemplo: Se o autor se chamar José Augusto Silva o sistema deve
         * exibir SILVA, J. A. Faça um programa que recebe o nome do autor
         * e depois exibe o nome no formato ABNT. Esse programa deve conter
         * um módulo que receba o nome e devolva o nome formatado. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do Autor: ");
        String nomeC = scan.nextLine();
        scan.close();

        formatarNome(nomeC);

    }

    public static void formatarNome(String nomeCompleto){
        String[] nomeSeparado = nomeCompleto.split(" "); // Separando String
        System.out.print(nomeSeparado[nomeSeparado.length - 1].toUpperCase() + ", "); // Sobrenome

        for (int i = 0; i < nomeSeparado.length - 1; i++) {
            System.out.print(nomeSeparado[i].toUpperCase().charAt(0) + ". "); // Iniciais
        }
    }
}
