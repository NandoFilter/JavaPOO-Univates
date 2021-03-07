package br.univates.poo_2021a.pratica04;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NandoFilter
 * @date 03/06/2021
 */

@Getter
@Setter
public class Televisor {

    // Um televisor. Um televisor tem volume, canal, etc.... pode estar ligado ou desligado.

    int volume, canal;
    boolean ligado, tocando;

    public Televisor(){
        this.setLigado(false);
        this.setVolume(50);
        this.setCanal(1);
    }

    public void status(){
        System.out.println("-----STATUS-----");
        System.out.println("Canal: " + this.canal);
        System.out.println("Volume: " + this.volume);
    }

    public void ligar(){
        setLigado(true);
    }

    public void aumentarVolume(){
        if(this.getVolume() >= 0 && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 1);
        }
    }

    public void diminuirVolume(){
        if(this.getVolume() > 0 && this.getVolume() <= 100){
            this.setVolume(this.getVolume() - 1);
        }
    }

    public void ligarMudo(){
        this.setVolume(0);
    }

    public void desligarMudo(){
        this.setVolume(50);
    }

    public void trocarCanal(int x){
        if(x > 0 && x <= 500) {
            this.setCanal(x);
        }else{
            System.out.println("----------------");
            System.out.println("Canal inexistente");
        }
    }


}
