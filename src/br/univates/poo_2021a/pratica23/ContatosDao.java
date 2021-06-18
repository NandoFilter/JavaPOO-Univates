package br.univates.poo_2021a.pratica23;

import br.univates.poo_2021a.pratica20.Arquivo;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 05/27/2021
 */

public class ContatosDao extends DaoEdit {

    public boolean salvar(Contato contato) {
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        ArrayList<Contato> contatosCad = ler();
        contatosCad.add(contato);
        boolean result = false;

        if (arq.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arq.escreverLinha(c.toString());
            }
            result = true;
        }
        arq.fecharArquivo();
        return result;
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
        arq.fecharArquivo();
        return contatosCad;
    }

    public boolean editar(int id, String infoNome, String infoTel, String infoEmail) {
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        ArrayList<Contato> contatosCad = ler();
        boolean result = false;
        id--;

        if (arq.abrirLeitura()) {

            /* if (validaOpcao(opc)) {
                if (opc == 1) { // Editar Nome
                    contatosCad.get(id).setNome(info);
                } else if (opc == 2) { // Editar Telefone
                    contatosCad.get(id).setTelefone(info);
                } else if (opc == 3) { // Editar E-mail
                    contatosCad.get(id).setEmail(info);
                }
            } */

            contatosCad.get(id).setNome(infoNome);
            contatosCad.get(id).setTelefone(infoTel);
            contatosCad.get(id).setEmail(infoEmail);
        }
        arq.fecharArquivo();

        if (arq.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arq.escreverLinha(c.toString());
            }
            result = true;
        }
        arq.fecharArquivo();
        return result;
    }

    public boolean deletar(int id) {
        boolean result = false;
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica23\\contatos.txt");
        ArrayList<Contato> contatosCad = ler();
        id--;

        if (id >= 0 && id < getContatosLength()) {
            contatosCad.remove(id);
        }

        if (deletarContatos(arq) && arq.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arq.escreverLinha(c.toString());
            }
            result = true;
        }
        arq.fecharArquivo();
        return result;
    }
}