package br.univates.poo_2021a.prova01;

/**
 * @author NandoFilter
 * @date 04/20/2021
 */

public class Dado {

    /* Um grupo de amigos costumava, antes da pandemia, se reunir aos sábados para jogar Poker.
    Nesse jogo a sorte é lançada ao se jogar os dados sobre a mesa. Na prática um dado é um cubo
    que ao ser lançado fica com uma de suas seis faces para cima, ou seja, é como se um número de
    1 a 6 estivesse sendo sorteado (gerado aleatoriamente).

    Construa uma classe para simular o funcionamento de um DADO. O artefato poderá ser lançado e
    sempre que isso ocorrer o usuário poderá observar o número que está estampado na face que ficou
    para cima. Um chip instalado no interior de cada DADO conta quantos lançamentos foram feitos e
    quantas vezes cada uma das faces ficou para cima. Essas informações poderão ser solicitadas aos
    objetos dessa classe a qualquer momento (2 pontos).

    Obs: não é necessário desenvolver nenhum sistema que utiliza o artefato, apenas modelar a classe.
    Opcionalmente você poderá desenvolver um módulo main para testar o funcionamento do objeto. */

    private int numeroDado, lancamentos;
    private int[] qntdVezesSorteado;

    public Dado() {
        this.numeroDado = 0;
        this.lancamentos = 0;
        this.qntdVezesSorteado = new int[6];
    }

    public void setNumeroDado(int n) {
        if (n >= 1 && n <= 6) {
            this.numeroDado = n;
        }
    }

    public int getNumeroDado() {
        return this.numeroDado;
    }

    public void setLancamentos(int qntd) {
        this.lancamentos = qntd;
    }

    public int getLancamentos() {
        return this.lancamentos;
    }

    public int[] getQntdVezesSorteado() {
        return qntdVezesSorteado;
    }

    public void girarDado() {
        setNumeroDado((int) (Math.random() * 6 + 1));
        setLancamentos(getLancamentos() + 1);

        for (int i = 0; i < getQntdVezesSorteado().length; i++) {
            if (getNumeroDado() == (i + 1)) {
                getQntdVezesSorteado()[i]++;
            }
        }
    }
}
