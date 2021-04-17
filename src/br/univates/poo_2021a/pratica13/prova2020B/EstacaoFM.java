package br.univates.poo_2021a.pratica13.prova2020B;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/17/2021
 */

@Getter
@Setter
public class EstacaoFM {

    /* Implementar a classe EstacaoFM que representa uma estação de rádio FM.
    Uma estação é definida pela frequência que pode variar de 88.0 até 108.9
    e pelo modo de transmissão que pode ser “mono”, “stereo” ou “dolby”. Uma
    estação pode ter sua frequência aumentada ou reduzida de 0.1 em 0.1 ou
    definida diretamente para um determinado valor. O modo de transmissão pode
    ser mudado com apenas uma operação que irá mudar de “mono” para “stereo”;
    de “stereo” para “dolby”; de “dolby” para “mono”, ou seja, é como se fosse
    uma mudança em uma direção apenas… se está em “mono” para passar para “dolby”
    primeiramente precisamos mudar para “stereo” para depois mudar para “dolby”. */

    private double freq;
    private String modoTransm;

    public EstacaoFM(){
        this.freq = 88;
        this.modoTransm = "Mono";
    }

    public void aumentarFreq(){
        if(getFreq() >= 88 && getFreq() + 0.1 <= 108.9){
            setFreq(getFreq() + 0.1);
        }
    }

    public void diminuirFreq(){
        if(getFreq() - 0.1 >= 88 && getFreq() <= 108.9){
            setFreq(getFreq() - 0.1);
        }
    }

    public void definirFreq(double valor){
        if(valor >= 88 && valor <= 108.9){
            setFreq(valor);
        }
    }

    public void trocarModoTransm(){
        if(getModoTransm().equals("Mono")){
            setModoTransm("Stereo");
        }else if(getModoTransm().equals("Stereo")){
            setModoTransm("Dolby");
        }else{
            setModoTransm("Mono");
        }
    }
}
