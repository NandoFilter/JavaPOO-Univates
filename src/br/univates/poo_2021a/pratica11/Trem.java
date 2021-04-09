package br.univates.poo_2021a.pratica11;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/08/2021
 */

@Getter
@Setter
public class Trem {

    /* A locomotiva contém um reservatório de combustível que consome
    1,2 litros de combustível por km rodado, mais 0,4 litros por vagão
    que a locomotiva está puxando. Ao transportar (movimentar o trem)
    o trem sempre puxa todos os vagões conectados à locomotiva e
    desloca-se um certa quantidade de quilômetros (km). */

    private Vagao vagao[];
    private double comb, combMax, odometro;
    private int numVagao;

    public Trem(){
        this.comb = 0;
        this.odometro = 0;
        this.combMax = 300;
        this.numVagao = 0;
        this.vagao = new Vagao[25];
    }

    public boolean viajar(double qntdKm){ // Definir a Quantidade de Km na Viagem.
        boolean result = false;
        double consumo = 1.2 + (0.4 * getNumVagao());

        if(getComb() > 0 && getComb() <= getCombMax()) {

            if (qntdKm > 0 && (qntdKm * consumo) <= getComb()) {
                setComb(getComb() - (qntdKm * consumo));
                setOdometro(getOdometro() + qntdKm);
                result = true;
            }

        }else if(getComb() <= 0){
            setComb(0);
        }

        return result;
    }

    public boolean abastecerTrem(double qntd_comb){
        boolean result = false;

        if(qntd_comb > 0 && (qntd_comb + getComb() <= getCombMax())){
            setComb(getComb() + qntd_comb);
            result = true;
        }

        return result;
    }

}