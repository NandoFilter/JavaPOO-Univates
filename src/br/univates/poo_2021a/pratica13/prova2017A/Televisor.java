package br.univates.poo_2021a.pratica13.prova2017A;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 04/15/2021
 */

@Getter
@Setter
public class Televisor {

    /* Desenvolver uma classe denominada Televisor que modela o funcionamento
    de um equipamento de TV. No mínimo cada televisor tem como atributos o canal
    em que está sintonizado, a intensidade do volume, brilho e contraste, um
    estado que pode ser ligado ou desligado (true or false). Criar os getters e
    setters necessários, o método construtor e encapsular os atributos (private). */

    private int canal, volume, brilho, contraste, volumeAux;
    private boolean ligado;

    public Televisor(){
        this.canal = 0;
        this.volume = 25;
        this.brilho = 50;
        this.contraste = 50;
        this.volumeAux = 0;
        this.ligado = false;
    }

    // Ligar ou Desligar Televisor
    public void powerButton(){
        setLigado(!isLigado());
    }

    // Trocar canal
    public boolean changeChannel(int channel){
        boolean aux = false;
        if(isLigado()) {

            if (channel >= 0) {
                setCanal(channel);
                aux = true;
            }

        }
        return aux;
    }

    // Aumentar brilho
    public boolean turnUp_Brightness(){
        boolean aux = false;
        if(isLigado()){

            if(getBrilho() + 1 <= 100){
                setBrilho(getBrilho() + 1);
                aux = true;
            }

        }
        return aux;
    }

    // Diminuir brilho
    public boolean turnDown_Brightness(){
        boolean aux = false;
        if(isLigado()){

            if(getBrilho() - 1 >= 0){
                setBrilho(getBrilho() - 1);
                aux = true;
            }

        }
        return aux;
    }

    // Aumentar Contraste
    public boolean turnUp_Contrast(){
        boolean aux = false;
        if(isLigado()){

            if(getContraste() + 1 <= 100){
                setContraste(getContraste() + 1);
                aux = true;
            }

        }
        return aux;
    }

    // Diminuir Contraste
    public boolean turnDown_Contrast(){
        boolean aux = false;
        if(isLigado()){

            if(getContraste() - 1 >= 0){
                setContraste(getContraste() - 1);
                aux = true;
            }

        }
        return aux;
    }

    // Aumentar Volume
    public boolean turnUp_Volume(){
        boolean aux = false;
        if(isLigado()){

            if(getVolume() + 1 <= 100){
                setVolume(getVolume() + 1);
                setVolumeAux(getVolume());
                aux = true;
            }

        }
        return aux;
    }

    // Diminuir Volume
    public boolean turnDown_Volume(){
        boolean aux = false;
        if(isLigado()){

            if(getVolume() - 1 >= 0){
                setVolume(getVolume() - 1);
                setVolumeAux(getVolume());
                aux = true;
            }

        }
        return aux;
    }

    // Deixar a TV no Mudo ou tirar do Mudo e retornar ao volume anterior
    public boolean muteButton(){
        boolean aux = false;

        if(isLigado()){
            if(getVolume() > 0){
                setVolume(0);
            }else{
                setVolume(getVolumeAux());
            }
            aux = true;
        }
        return aux;
    }
}
