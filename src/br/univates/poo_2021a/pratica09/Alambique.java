package br.univates.poo_2021a.pratica09;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/25/2021
 */

@Getter
@Setter
public class Alambique {

    private Reservatorio reservaCaldo; // Caldo de Cana
    private Reservatorio reservaCach;  // Cachaça
    private Reservatorio reservaIntrm; // Intermediário

    private int garrafasCheias, numBateladas;

    public Alambique() {
        this.reservaCaldo = new Reservatorio(100000); // 100L
        this.reservaCach = new Reservatorio(500000);  // 500L
        this.reservaIntrm = new Reservatorio(100000); // 100L

        this.garrafasCheias = 0;
        this.numBateladas = 0;
    }

    public boolean startProd() {

        /* Com cada litro de caldo de cana é possível fazer 0,40 litros de cachaça
        e isso deixará no primeiro reservatório um resíduo de 0,20 litros que é drenado,
        no final da produção, para um outro reservatório intermediário com capacidade
        para 100 litros.*/

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

    /* A cachaça pronta pode ser retirada do reservatório final
    para garrafas com capacidade para 750 ml cada uma. */

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
