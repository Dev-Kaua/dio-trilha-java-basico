//!o que são tipos de dados? 
//?Os oito tipos primitivos em java são: int, byte, long, float, double, boolean e char.
//esses tipos não sao considerados objetos, representam valores brutos.
//eles sao armazenados diretamente na pilha de memória.
//!Na maioria dos seus cenários, sempre utilizar a opção int.
//?Os tipos primitivos que podem conter partes fracionárias são: float e double.
//float = 4 bytes;  double = 8 bytes;
//!o mais comum de se encontrar é o tipo double, por uma questao de garantia das precisoes através dos algoritmos realizados
//*O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. */

//*Toda variável é composta por: tipo de dados + identificação + valor atribuído. */
//!estrutura padrão: <tipo> <nomeVariavel> <atribuicaoDeValorOpicional>

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{
        //ex:
        double salarioMinimo = 2500.33;
        int cep = 21070333; //se começar com 0, teria que ser um string
        long cpf = 98765432109L; //se começar com 0, talvez tenha que ser outro tipo
        //tipo long também tem que terminar com L para representar que o valor da variável nao será inteiro e será de um tipo long.
        float pi = 3.14F; //tipo float tem essa peculiaridade, tendo que colocar um f no final, senão ele vai dar um erro achando que aqui teria que ser uma variavel do tipo double. 
        //?Exemplo de constante:
        final double VALOR_DE_PI = 3.14;

        //exemplo de declaração de texto:
        String meuNome = "Kauã Reis";
        
    }
}

//!Constantes: valores armazenados em memória que não podem ser modificados depois de declarados.
//!Em java, esses valores são representados pela palavra reservada "final", seguida do tipo.
//*Por convecção, constantes são sempre escritas em CAIXA ALTA. */
//todo valor de uma variável que a gnt quer que seja final deve estar escrito em caixa alta.
//?estudo adicional: estudar a classe String que representa texto na aplicação.