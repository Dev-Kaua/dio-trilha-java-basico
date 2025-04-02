/*
 !SCANNER:
 ?  nos exemplos anteriores percebemos que podemos receber dados digitados pelo usuário no nosso sistema,
 ?  porém tudo precisa estar em uma linha e também é necessário informar os valores nas posições 
 ?  correspondentes. Esta abordagem pode deixar margens de execução com erro do nosso programa.
 ?  Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras vamos receber 
 ?  estes dados via Scanner.
 *      A classe Scanner perimite que o usuário tenha uma interação mais assertiva com o nosso programa,
 *      veja como vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usuários:
 */
import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args){
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
    }
}
