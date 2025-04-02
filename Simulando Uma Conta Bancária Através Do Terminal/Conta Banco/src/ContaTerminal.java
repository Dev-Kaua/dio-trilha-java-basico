import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, sou o assistente virtual do banco!\n Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Me diga qual o seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Agora o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Qual o saldo presente em sua conta? R$");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco,\n sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");
     }
}