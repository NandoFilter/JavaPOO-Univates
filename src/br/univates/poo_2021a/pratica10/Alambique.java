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

    // Comandos do Alambique

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
