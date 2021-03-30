package br.univates.poo_2021a.pratica10;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/30/2021
 */

@Getter
@Setter
public class Alambique {

    /* Ampliamos a nossa produção de cachaça. Agora nosso empreendimento possui 3 alambiques
    (3 máquinas de fazer cachaça). A primeira é a mesma que já tínhamos, ou seja, com um
    reservatório de 100 litros de caldo de cana, 100 litros de capacidade do reservatório
    de resíduos e 500 litros no reservatório final de cachaça produzida. Mas as nossas novas
    duas máquinas são maiores. O reservatório de caldo de cana tem 500 litros, a capacidade do
    reservatório de resíduos é de 200 litros e o depósito final onde fica a cachaça produzida
    permite armazenar 1200 litros. Faça um sistema que contemple esse novo problema. Modifique a
    classe Alambique se necessário. Faça um menu inicial onde o operador possa escolher em qual
    máquina vai produzir cachaça e depois acesse os controles dessa máquina para fazer a produção. */

    private Reservatorio reservaCaldo; // Caldo de Cana
    private Reservatorio reservaCach;  // Cachaça
    private Reservatorio reservaIntrm; // Intermediário

    private int garrafasCheias, numBateladas;

    public Alambique(double limiteCana, double limiteCachaca, double limiteIntrm) {
        this.reservaCaldo = new Reservatorio(limiteCana);
        this.reservaCach = new Reservatorio(limiteCachaca);
        this.reservaIntrm = new Reservatorio(limiteIntrm);

        this.garrafasCheias = 0;
        this.numBateladas = 0;
    }

    public Alambique(){}

    public boolean startProd() {

        boolean aux = false;

        while (true) {

            if (!reservaCaldo.removeQuantidade(1000) || !reservaCach.addQuantidade(400) || !reservaIntrm.addQuantidade(200)) {
                break;
            }

            aux = true;
            setNumBateladas(getNumBateladas() + 1);
        }
        return aux;
    }

    public void encherGarrafa() {
        while (true) {

            if (reservaCach.getQuantidade() >= 750) {
                setGarrafasCheias(getGarrafasCheias() + 1);
                reservaCach.removeQuantidade(750);
            } else {
                break;
            }

        }
    }

    public boolean limparReservatorios(int x) {
        boolean aux = true;

        if (x == 1) {
            reservaCaldo.setQuantidade(0);
        } else if (x == 2) {
            reservaCach.setQuantidade(0);
        } else if (x == 3) {
            reservaIntrm.setQuantidade(0);
        } else {
            aux = false;
        }

        return aux;
    }

}
