import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = input.nextInt();
        //Pegando o "/n que o nextInt deixou"
        input.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
    }
}
