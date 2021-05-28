package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica20.Arquivo;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class ContatosDao {

    public void salvar(Contato contato) {
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        ArrayList<Contato> contatosCad = new ArrayList<>();

        if (arq.abrirLeitura()) {
            String contatoSalvo = arq.lerLinha();

            while (contatoSalvo != null) {
                String[] vetorContato = contatoSalvo.split(";");
                contatosCad.add(new Contato(vetorContato[0], vetorContato[1], vetorContato[2]));
                contatoSalvo = arq.lerLinha();
            }
            contatosCad.add(contato);
            arq.fecharArquivo();

            if (arq.abrirEscrita()) {
                for (Contato c : contatosCad) {
                    arq.escreverLinha(c.toString());
                }
            }
            arq.fecharArquivo();
        }
    }

    public ArrayList<Contato> ler() {
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        ArrayList<Contato> contatosCad = new ArrayList<>();

        if (arq.abrirLeitura()) {
            String contatoSalvo = arq.lerLinha();

            while (contatoSalvo != null) {
                String[] vetorContato = contatoSalvo.split(";");
                contatosCad.add(new Contato(vetorContato[0], vetorContato[1], vetorContato[2]));
                contatoSalvo = arq.lerLinha();
            }
        }
        return contatosCad;
    }

}

