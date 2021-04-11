package br.univates.poo_2021a.pratica12;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 04/11/2021
 */

@Getter
@Setter
public class Pedido {
    /* Faça um sistema que ajude o proprietário a registrar
    todos os pedidos que entram para serem atendidos. Cada pedido possui
    a identificação do cliente (nome, endereço, telefone) e a lista de
    todos os itens solicitados. Os pedidos ficam enfileirados e vão sendo
    atendidos pela ordem em que foram recebidos. Os pedidos já atendidos
    podem ser descartados. */

    private int telCliente;
    private String nomeCliente, endCliente, tipoPedido;
    private ArrayList<Prato> pratos;

    public boolean addPrato(int pedido, int qntd, String obs) {
        boolean result = false;
        Prato prato = new Prato();

        if (pedido > 0 && pedido < 5) {
            selecionarPrato(pedido, prato);
            prato.setQntdPrato(qntd);
            prato.setObsPrato(obs);
            pratos.add(prato);
            result = true;
        }

        return result;
    }

    public void addCliente(String nome, String endereco, String tipoPedido, int telefone){
        setNomeCliente(nome);
        setEndCliente(endereco);
        setTelCliente(telefone);
        setTipoPedido(tipoPedido);
    }

    private void selecionarPrato(int pedido, Prato prato) {
        if (pedido == 1) {
            prato.setNomePrato("Pizza Grande");
        } else if (pedido == 2) {
            prato.setNomePrato("Xis Filé");
        } else if (pedido == 3) {
            prato.setNomePrato("Prato Executivo");
        } else {
            prato.setNomePrato("A la Minuta");
        }
    }
}
