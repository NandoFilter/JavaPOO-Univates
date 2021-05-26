package br.univates.poo_2021a.pratica21;

import br.univates.poo_2021a.pratica14.Retangulo;
import br.univates.poo_2021a.pratica20.Arquivo;

/**
 * @author NandoFilter
 * @date 05/25/2021
 */

/* Faça uma classe que tem como objetivo salvar e recuperar um objeto conhecido. Primeiramente
escolha qual objeto você deseja salvar como, por exemplo, Triangulo, MaquinaSorvete, Alambique, etc.
Depois crie uma classe nova com os métodos com os métodos abaixo:

    public void salvar( EsseObjeto obj )
    public EsseObjeto recuperar() */

public class RetanguloDao {

    public void salvar(Retangulo retangulo) {
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica21\\retangulo.txt");

        if(arq.abrirEscrita()){
            arq.escreverLinha(retangulo.getAltura() + "");
            arq.escreverLinha(retangulo.getBase() + "");
            arq.fecharArquivo();
        }
    }

    public Retangulo ler(){
        Retangulo retangulo = null;
        Arquivo arq = new Arquivo("C:\\Programação\\Workspaces\\Univates\\JavaPOO-Univates\\src\\br\\univates\\poo_2021a\\pratica21\\retangulo.txt");

        if(arq.abrirLeitura()){

            double altura = Double.parseDouble(arq.lerLinha());
            double base = Double.parseDouble(arq.lerLinha());

            retangulo = new Retangulo(base, altura);
            arq.fecharArquivo();
        }
        return retangulo;
    }

}
