package br.univates.poo_2021a.pratica22;

import br.univates.poo_2021a.pratica14.Retangulo;
import br.univates.poo_2021a.pratica18.MaquinaSorvete;
import br.univates.poo_2021a.pratica20.Arquivo;

/**
 * @author NandoFilter
 * @date 05/25/2021
 */

/* Modifique a sua máquina de sorvetes para incluir uma camada de persistência. */

public class MaquinaSorveteDao {

    public void salvar(MaquinaSorvete maquinaSorvete){
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica22\\maquinasorvete.txt");

        if(arq.abrirEscrita()){
            arq.escreverLinha(maquinaSorvete.getQntdLeite() + "");
            arq.escreverLinha(maquinaSorvete.getQntdEmul() + "");

            arq.escreverLinha(maquinaSorvete.getQntdEsMor() + "");
            arq.escreverLinha(maquinaSorvete.getQntdEsChoc() + "");

            arq.fecharArquivo();
        }
    }

    public MaquinaSorvete ler(){
        MaquinaSorvete maquinaSorvete = null;
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica22\\maquinasorvete.txt");

        if(arq.abrirLeitura()){

            int qntdLeite = Integer.parseInt(arq.lerLinha());
            int qntdEmul = Integer.parseInt(arq.lerLinha());
            int qntdEsMor = Integer.parseInt(arq.lerLinha());
            int qntdEsChoc = Integer.parseInt(arq.lerLinha());

            maquinaSorvete = new MaquinaSorvete(qntdLeite, qntdEmul, qntdEsMor, qntdEsChoc);
            arq.fecharArquivo();
        }
        return maquinaSorvete;
    }


}
