import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);

        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldoDaConta;

        System.out.println("Bem vindo novo clinte!");
        System.out.println("Vamos criar sua conta!");

        System.out.print("Por favor, digite seu nome:");
        nomeDoCliente = prompt.next();

        System.out.print("Por favor, digite o número da CONTA:");
        numeroDaConta = prompt.nextInt();

        System.out.print("Por favor, digite o número da Agência:");
        agencia = prompt.next();

        System.out.print("Informe o valor do seu saldo atual");
        saldoDaConta = prompt.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua AGÊNCIA é " + agencia + ", conta: " + numeroDaConta + " e seu saldo: " + saldoDaConta + "0 reais, já esta disponível para saque.");

    }
}
