import java.util.Scanner;


public class TerminalBanco {

    public static void main(String[] args) throws Exception {
        int numero;
        String Agencia;
        String nomeCliente;
        float saldo;
        
        Scanner scanner = new Scanner(System .in);


        System.out.println("Digite o Numero da Conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Bem - Vindo a Conta " + numero);

        System.out.println("Digite o Nome do Titular da Conta: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite a Agencia da Conta: ");
        Agencia = scanner.nextLine();

        System.out.println("Digite o valor depositado: ");
        saldo = scanner.nextFloat();

        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua Agencia é " + Agencia + ", conta " + numero + " e seu saldo de " + saldo + " Já esta Disponivel para o Saque.");
        scanner.close();
    }
}
