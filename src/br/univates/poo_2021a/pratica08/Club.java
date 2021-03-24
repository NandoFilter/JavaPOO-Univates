package br.univates.poo_2021a.pratica08;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/23/2021
 */

@Getter
@Setter
public class Club {

    /* Maria é administradora de uma casa de shows e, devido a pandemia,
    precisa controlar o número de pessoas no interior do estabelecimento.
    A casa tem duas portas e isso dificulta o controle, mas com um software
    é possível facilitar esse trabalho. A capacidade máxima da casa é de 200
    pessoas (já considerando a pandemia). Aproveitando a oportunidade, Maria
    deseja também controlar a receita com ingressos a cada noite. Elas pagam
    R$ 40,00 e eles pagam R$ 55,00. Construa um software que exibe um menu com
    as opções "entrar na casa (ele)", "entrar na casa (ela)", "sair da casa",
    "consultar valor em caixa", "consultar lotação atual", "encerrar expediente".
    A solução, claro, deve ser implementada sob o paradigma OO. */

    private int people, lot, total;

    public Club(int capacidade){
        this.lot = capacidade;
        this.total = 0;
        this.people = 0;
    }

    // Adicionar uma Quantidade de Homens no Club e Fazer a Cobrança
    public boolean addMan(int qntd){
        boolean valido;

        if(getPeople() + qntd <= getLot()) {
            setPeople(getPeople() + qntd);
            setTotal(getTotal() + (55 * qntd));
            valido = true;
        }else{
            valido = false;
        }
        return valido;
    }

    // Adicionar uma Quantidade de Mulheres no Club e Fazer a Cobrança
    public boolean addWoman(int qntd){
        boolean valido;

        if(getPeople() + qntd <= getLot()){
            setPeople(getPeople() + qntd);
            setTotal(getTotal() + (40 * qntd));
            valido = true;
        }else{
            valido = false;
        }
        return valido;
    }

    // Extrair uma Quantidade de Pessoas do Club
    public boolean leaveClub(int qntd){
        boolean valido;

        if(getPeople() - qntd >= 0){
            setPeople(getPeople() - qntd);
            valido = true;
        }else{
            valido = false;
        }
        return valido;
    }
}
