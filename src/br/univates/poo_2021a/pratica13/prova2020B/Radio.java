package br.univates.poo_2021a.pratica13.prova2020B;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/17/2021
 */

@Getter
@Setter
public class Radio {

    /* Implementar a classe Radio que representa um equipamento de recepção de ondas
    sonoras emitida em frequência modulada (FM), ou seja, um rádio FM. O rádio vai
    poder estar ligado ou desligado, terá uma controle de volume que varia de 0 até
    100 e vai conter uma estação sintonizada, que deverá ser um atributo do tipo EstacaoFM.
    O operador (usuário) do rádio vai poder mudar a estação (para cima ou para baixo ou
    para uma estação específica) e mudar o modo de transmissão diretamente no rádio.
    Ligar e desligar o rádio. Mudar o volume do rádio. */

    private EstacaoFM estacaoFM;
    private int volume;
    boolean ligado;

    public Radio() {
        this.ligado = false;
        this.volume = 0;
        this.estacaoFM = new EstacaoFM();
    }

    public boolean powerButton() {
        setLigado(!isLigado());
        return isLigado();
    }

    public void aumentarVolume() {
        if (isLigado()) {
            if (getVolume() >= 0 && getVolume() + 1 <= 100) {
                setVolume(getVolume() + 1);
            }
        }
    }

    public void diminuirVolume() {
        if (isLigado()) {
            if (getVolume() - 1 >= 0 && getVolume() <= 100) {
                setVolume(getVolume() - 1);
            }
        }
    }

    public void aumentarEst(){
        if(isLigado()){
            getEstacaoFM().aumentarFreq();
        }
    }

    public void diminuirEst(){
        if(isLigado()){
            getEstacaoFM().diminuirFreq();
        }
    }

    public void trocarEst(double valor) {
        if (isLigado()) {
            getEstacaoFM().definirFreq(valor);
        }
    }

    public void mudarModoTransm(){
        if(isLigado()){
            getEstacaoFM().trocarModoTransm();
        }
    }
}