package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica20.Arquivo;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 06/01/2021
 */

public class DaoEdit {

    public boolean validaOpcao(int opc) {
        boolean result = false;
        if (opc == 1 || opc == 2 || opc == 3) {
            result = true;
        }
        return result;
    }

    public int getContatosLength(){
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        int linhas = 0;
        if(arq.abrirLeitura()){
            while(arq.lerLinha() != null){
                linhas++;
            }
            arq.fecharArquivo();
        }
        return linhas;
    }

    public boolean deletarContatos(Arquivo arquivo){
        boolean result = false;

        if(arquivo.abrirEscrita()){
            for (int i = 0; i < getContatosLength(); i++) {
                arquivo.escreverLinha(null);
            }
            result = true;
        }
        arquivo.fecharArquivo();
        return result;
    }

}
