package br.univates.poo_2021a.pratica18;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 05/06/2021
 */

@Getter
@Setter
public class MaquinaSorvete implements MaquinaInterface {

    /* Desenvolver um sistema que simule o funcionamento de uma máquina italiana de fazer sorvete.
    Essa máquina contém um estoque de leite, base emulsificante e essência de morango ou chocolate.
    Para fazer uma porção (uma bola) de sorvete são consumidos 35 ml de leite, 15 g de emulsificante
    e 7 ml de essência conforme o sabor escolhido pelo cliente. A máquina deve ter opções para o
    usuário comprar uma porção (de uma bola) de morango ou chocolate ou comprar um litro de sorvete.
    Um litro é equivalente a 16 bolas de sorvete. */

    private int qntdLeite, qntdEmul, qntdEsMor, qntdEsChoc, qntdBolasMor, qntdBolasChoc;
    private String sabor;

    public MaquinaSorvete() {
        this.qntdLeite = 5000;
        this.qntdEmul = 1000;
        this.qntdEsMor = 500;
        this.qntdEsChoc = 500;
        this.qntdBolasMor = 0;
        this.qntdBolasChoc = 0;
        this.sabor = "";
    }

    public MaquinaSorvete(int qntdLeite, int qntdEmul, int qntdEsMor, int qntdEsChoc){
        this.qntdLeite = qntdLeite;
        this.qntdEmul = qntdEmul;
        this.qntdEsMor = qntdEsMor;
        this.qntdEsChoc = qntdEsChoc;
        this.qntdBolasMor = 0;
        this.qntdBolasChoc = 0;
        this.sabor = "";
    }

    public boolean escolherSabor(int opcao) {
        boolean aux = false;

        if (opcao == 1) {
            setSabor("Morango");
            aux = true;
        } else if (opcao == 2) {
            setSabor("Chocolate");
            aux = true;
        }

        return aux;
    }

    public boolean comprarBola() {
        boolean aux = false;

        if (getQntdLeite() >= 35 && getQntdEmul() >= 15) {

            if (getSabor().toUpperCase().equals("MORANGO") && getQntdEsMor() >= 7) {
                setQntdEsMor(getQntdEsMor() - 7);

                setQntdBolasMor(getQntdBolasMor() + 1);   // Somar qntd Bolas

                setQntdLeite(getQntdLeite() - 35);
                setQntdEmul(getQntdEmul() - 15);
                aux = true;

            } else if (getSabor().toUpperCase().equals("CHOCOLATE") && getQntdEsChoc() >= 7) {
                setQntdEsChoc(getQntdEsChoc() - 7);

                setQntdBolasChoc(getQntdBolasChoc() + 1); // Somar qntd Bolas

                setQntdLeite(getQntdLeite() - 35);
                setQntdEmul(getQntdEmul() - 15);
                aux = true;
            }

        }
        return aux;
    }

    public boolean comprarLitro() {
        boolean aux = true;

        // Backups de valores
        int bckLeite = getQntdLeite();
        int bckEmul = getQntdEmul();
        int bckEsMor = getQntdEsMor();
        int bckEsChoc = getQntdEsChoc();
        int bckBolasMor = getQntdBolasMor();
        int bckBolasChoc = getQntdBolasChoc();

        int i = 0;

        while (i < 16) {
            if (comprarBola()) {
                i++;
            } else { // Retornar valores anteriores
                setQntdLeite(bckLeite);
                setQntdEmul(bckEmul);
                setQntdEsMor(bckEsMor);
                setQntdEsChoc(bckEsChoc);
                setQntdBolasMor(bckBolasMor);
                setQntdBolasChoc(bckBolasChoc);
                aux = false;

                break;
            }
        }
        return aux;
    }

    @Override
    public void recarregarLeite() {
        setQntdLeite(5000);
    }

    @Override
    public void recarregarEmul() {
        setQntdEmul(1000);
    }

    @Override
    public void recarregarEsMor() {
        setQntdEsMor(500);
    }

    @Override
    public void recarregarEsChoc() {
        setQntdEsChoc(500);
    }
}
