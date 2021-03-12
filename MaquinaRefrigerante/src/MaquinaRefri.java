import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/11/2021
 */

@Getter
@Setter
public class MaquinaRefri {

    /* Construa uma classe para modelar o funcionamento de uma máquina de fazer refrigerantes,
    aquelas que existem nas hamburguerias expressas (com refil). A máquina pode servir 3 sabores
    diferentes, portanto ela tem estoque de 3 xaropes diferentes, água e gás. Se faltar um dos
    insumos não é possível servir. Para cada 100 ml de refrigerante são consumidos 95 ml de água,
    5 ml de xarope e uma dose de gás. Construa primeiramente a classe que representa o funcionamento
    dessa máquina e depois uma tela com menu (main) que vai interagir com a máquina, fazendo ela funcionar. */

    int qntdAgua, qntdGas, copo, sabor, tamCopo;
    int[] qntdXarope = new int[3];

    Scanner scanner = new Scanner(System.in);

    public MaquinaRefri(){

        for (int i = 0; i < 3; i++) {
            qntdXarope[i] = 0;
        }

        copo = 0;
        qntdAgua = 0;
        qntdGas = 0;
    }

    public void status(){
        System.out.println("------STATUS------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Xarope nº " + (i + 1) + ": " + this.qntdXarope[i] + " mL");
        }

        System.out.println("Água: " + getQntdAgua() + " mL");
        System.out.println("Gás: " + getQntdGas() + " mL");
    }

    public void encherCopo(){
        escolherSabor();
        int aux = getTamCopo() / 100;
        if(this.qntdXarope[sabor] >= (5 * aux) && getQntdAgua() >= (95 * aux) && getQntdGas() >= (5 * aux)) {
            if (getCopo() >= 0 && getCopo() < getTamCopo()) {

                setCopo(getTamCopo());
                System.out.println("------------------");
                System.out.println("Copo abastecido com sucesso");

            } else if (getCopo() >= 100) {

                System.out.println("------------------");
                System.out.println("Impossível encher, seu copo está cheio");

            }
        }else{
            System.out.println("------------------");
            System.out.println("Quantidade de Xarope Insuficiente");
        }
    }

    public void escolherCopo(){
        int aux = 0;
        while(aux == 0) {
            System.out.println("------------------");
            System.out.println("Escolha o Tamanho do Copo: ");
            System.out.println("[1] 400mL\n[2] 500mL\n[3] 600mL");
            System.out.print("Digite aqui: ");
            aux = scanner.nextInt();

            if (aux == 1) {
                setTamCopo(400);
            } else if (aux == 2) {
                setTamCopo(500);
            } else if (aux == 3) {
                setTamCopo(600);
            } else {
                System.out.println("------------------");
                System.out.println("Código inválido");
                aux = 0;
            }
        }
    }

    public void escolherSabor(){
        System.out.println("------------------");
        System.out.println("Escolha o Refrigerante: ");
        System.out.println("[1] Coca-Cola\n[2] Fanta\n[3] Sprite");
        System.out.print("Digite aqui: ");
        int aux = scanner.nextInt();

        setSabor(aux - 1);
    }


    public void reabastecer(){
        while(true) {
            System.out.println("------------------");
            System.out.println("O que você deseja Reabastecer?");
            System.out.println("[1] Xarope\n[2] Água\n[3] Gás\n[0] Cancelar");
            System.out.print("Digite aqui: ");
            int x = scanner.nextInt();

            if (x == 1) {
                escolherSabor();
                if (this.qntdXarope[getSabor()] == 1000) {
                    System.out.println("------------------");
                    System.out.println("A carga de Xarope está cheia (1L)");
                } else {
                    System.out.println("------------------");
                    System.out.print("Quanto você deseja adicionar? ");
                    int aux = scanner.nextInt();
                    this.qntdXarope[getSabor()] += aux;

                    if (this.qntdXarope[getSabor()] > 1000) {
                        this.qntdXarope[getSabor()] = 1000;
                    }
                    System.out.println("------------------");
                    System.out.println("Carga Adicionada");
                }
            } else if (x == 2) {
                if (getQntdAgua() == 1000) {
                    System.out.println("------------------");
                    System.out.println("A carga de Água está cheia (1L)");
                } else {
                    System.out.println("------------------");
                    System.out.print("Quanto você deseja adicionar? ");
                    int aux = scanner.nextInt();
                    setQntdAgua(getQntdAgua() + aux);

                    if (getQntdAgua() > 1000) {
                        setQntdAgua(1000);
                    }
                    System.out.println("------------------");
                    System.out.println("Carga Adicionada");
                }
            } else if (x == 3) {
                if (getQntdGas() == 1000) {
                    System.out.println("------------------");
                    System.out.println("A carga de Gás está cheia (1L)");
                } else {
                    System.out.println("------------------");
                    System.out.print("Quanto você deseja adicionar? ");
                    int aux = scanner.nextInt();
                    setQntdGas(getQntdGas() + aux);

                    if (getQntdGas() > 1000) {
                        setQntdGas(1000);
                    }
                    System.out.println("------------------");
                    System.out.println("Carga Adicionada");
                }
            } else {
                System.out.println("------------------");
                System.out.println("Cancelando...");
                break;
            }
        }
    }
}
