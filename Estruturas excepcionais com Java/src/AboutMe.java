import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        try{
         //criando o objeto scanner
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Digite seu nome: ");
         String nome = scanner.next();
         
         System.out.println("Digite seu sobrenome: ");
         String sobrenome = scanner.next();
         
         System.out.println("Digite sua idade: ");
         int idade = scanner.nextInt();
 
         System.out.println("Digite sua altura: ");
         double altura = scanner.nextDouble();
 
         //Imprimindo os dados obtidos pelo usuário
         System.out.println("Olá, me chamo " + nome + " " + sobrenome);
         System.out.println("tenho " + idade + " anos");
         System.err.println("Minha altura é " + altura + "cm");
         scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("O campos idade e altura precisam ser numéricos!!!");
        }
    }
}
