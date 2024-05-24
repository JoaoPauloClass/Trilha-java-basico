import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoTerminal {
    
    private static Scanner scanner  = new Scanner(System.in);

    

    public static void executar(){
        int numero;
        String agencia;
        String nome;
        float saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        System.out.print(">> ");
        while (true) {
            try {
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("X - Valor inválido, digite novamente...");
                System.out.print(">>");
            } finally {
                scanner.nextLine(); // limpar buffer
            }
        }
        

        System.out.println("Por favor, digite o nome da Agência: ");
        System.out.print(">> ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        System.out.print(">> ");
        nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo do cliente: ");
        System.out.print(">> ");
        while (true) {
            try {
                saldo = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("X - Valor inválido, digite novamente...");
                System.out.print(">>");
            } finally {
                scanner.nextLine(); // limpar buffer
            }
        }
        
        
        BancoConta conta1 = new BancoConta(numero, agencia, nome, saldo);

        System.out.println("Olá " + conta1.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgencia() + ", conta "+ conta1.getNumero() +" e seu saldo R$"+ conta1.getSaldo() +" já está disponível para saque");

    }

}
