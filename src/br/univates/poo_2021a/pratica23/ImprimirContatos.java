package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica16.Printer;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class ImprimirContatos {

    public void imprimir(){
        Printer impressora = new Printer();
        ContatosDao contatosDao = new ContatosDao();

        for (Contato contato:contatosDao.ler()) {
            impressora.addDocumento(contato);
            impressora.imprimir();
        }
    }

}
