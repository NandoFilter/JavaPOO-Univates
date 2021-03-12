import java.util.Scanner;

/**
 * @author NandoFilter
 * @date 03/11/2021
 */

public class ProgramaMaqRefri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MaquinaRefri copo1 = new MaquinaRefri();

        while(true) {
            System.out.println("------------------");
            System.out.println("Identifique-se: ");
            System.out.println("[1] Funcionário\n[2] Cliente\n[0] Cancelar");
            System.out.print("Digite aqui: ");
            int id = scanner.nextInt();

            if (id == 1) {
                copo1.reabastecer();
                copo1.status();
            }else if (id == 2) {
                copo1.escolherCopo();
                copo1.encherCopo();
                copo1.status();
            }else{
                System.out.println("------------------");
                System.out.println("Cancelando...");
                break;
            }
        }
    }
}