package br.univates.poo_2021a.pratica21;

import br.univates.poo_2021a.pratica14.Retangulo;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 05/25/2021
 */

public class ProgramaRetanguloV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RetanguloDao dao = new RetanguloDao();
        Retangulo r = dao.ler();

        if(r == null){
            r = new Retangulo(0, 0);
        }

        System.out.print("Base: ");
        double base = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        r.setBase(base);
        r.setAltura(altura);

        double area = r.getArea();
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + r.getPerimetro());

        dao.salvar(r);
    }
}
