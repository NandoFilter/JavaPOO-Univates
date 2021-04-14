package br.univates.poo_2021a.pratica12;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 04/11/2021
 */

@Getter
@Setter
public class Pedido {

    /* Cliente indicam o prato desejado (pizza grande, xis filé,
    prato executivo, ala minuta), a quantidade (1, 2, 3 ou mais)
    que desejam e podem fazer observações (sem cebola, sem salsa,
    bem passado).  */

    private int tipoPedido;
    private long telCliente;
    private String nomeCliente, endCliente;
    private ArrayList<Prato> pratos;

    public Pedido(){
        this.pratos = new ArrayList<>();
    }

    public void addPrato(int pedido, int qntd, String obs) {
        Prato prato = new Prato();

        selecionarPrato(pedido, prato);
        prato.setQntdPrato(qntd);
        prato.setObsPrato(obs);
        pratos.add(prato);
    }

    public void addCliente(String nome, String endereco, long telefone, int tipoPedido) {
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
