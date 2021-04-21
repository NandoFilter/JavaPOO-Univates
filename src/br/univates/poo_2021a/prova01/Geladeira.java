package br.univates.poo_2021a.prova01;

/**
 * @author NandoFilter
 * @date 04/20/2021
 */

public class Geladeira {

    /* Devido a pandemia de Covid19 muitas famílias estão passando por necessidades. A ONG Minas do
    Pão de Queijo resolveu instalar em uma comunidade do bairro Sempre Alegre uma geladeira comunitária,
    onde aqueles que têm alimentos sobrando podem os deixar à disposição e as famílias que estão
    necessitando podem retirar aquilo que precisam. Faça um sistema que simula o funcionamento dessa
    geladeira comunitária. Os usuários da geladeira poderão: a) doar alimentos ou b) consumir alimentos.
    O administrador da ONG poderá: a) consultar quantos quilos de alimentos existem na geladeira ou
    b) limpar a geladeira. Ao doar ou consumir alimentos o usuário informa quantos quilogramas está doando
    ou consumindo. Há dois tipos de alimentos que precisam ser controlados de modo independente, os perecíveis
    e os não perecíveis.

    Criar a classe Geladeira com as funcionalidades (métodos) necessárias para as funções que serão
    acessadas pelos usuários e pelo administrador (3 pontos).

    Criar uma interface (uma classe para exibir um menu) para o usuário e o administrador acessarem as
    funcionalidades da Geladeira (2 pontos) */

    private int qntdP, qntdNP, capacidade;

    public Geladeira() {
        this.qntdP = 0;
        this.qntdNP = 0;
        this.capacidade = 200;
    }

    public void setQntdP(int qntd) {
        this.qntdP = qntd;
    }

    public int getQntdP() {
        return this.qntdP;
    }

    public void setQntdNP(int qntd) {
        this.qntdNP = qntd;
    }

    public int getQntdNP() {
        return this.qntdNP;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void limparGeladeira() {
        setQntdP(0);
        setQntdNP(0);
    }

    public boolean receberDoacao(int tipo, int qntdKg) {
        boolean result = false;

        if (tipo == 1) { // Perecíveis
            if (getQntdP() + getQntdNP() + qntdKg <= getCapacidade() && qntdKg > 0) {
                setQntdP(getQntdP() + qntdKg);
                result = true;
            }
        } else if (tipo == 2) { // Não Perecíveis
            if (getQntdNP() + getQntdP() + qntdKg <= getCapacidade() && qntdKg > 0) {
                setQntdNP(getQntdNP() + qntdKg);
                result = true;
            }
        }
        return result;
    }

    public boolean consumirAlimentos(int tipo, int qntdKg) {
        boolean result = false;

        if (tipo == 1) { // Perecíveis
            if (getQntdP() - qntdKg >= 0 && qntdKg > 0) {
                setQntdP(getQntdNP() - qntdKg);
                result = true;
            }
        } else if (tipo == 2) { // Não Perecíveis
            if (getQntdNP() - qntdKg >= 0 && qntdKg > 0) {
                setQntdNP(getQntdNP() - qntdKg);
                result = true;
            }
        }
        return result;
    }
}
