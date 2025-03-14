import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Numero da Conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o Nome do Titular da Conta: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o Valor do seu Deposito Inicial:" );
        double valorDepos = scanner.nextDouble();

        scanner.close();

        //exibir
        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + valorDepos + " já está disponível para saque.");

    }
}
