//?Operadores são simbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.
/**
 * !Operador de atribuição:
 * ?Usado para definir o valor inicial ou sobrescrever o valor de uma variável.
 * *deve-se levar em consideração que cada tipo de dado tem uma forma de ser declarado
 * *EX: texto deve ser declarado "entre aspas"; 
 * !Operadores Aritméticos:
 * ?é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
 * ? eles são: subtração (-); adição (+); multiplicação (*); divisão(/).
 * *OBS: o operador de adição (+), quando utilizado em variáveis do tipo texto, juntará as variáveis.
 * !Operadores Unários:
 * ?São aplicados juntamente com um outro operador aritmético.
 * ?Eles realizam alguns trabalhos básicos como: incrementar, decrementar, inverter valores numéricos e booleanos.
 * ?(+)Operador unário de valor positivo - considera todos os valores como positivos ou transforma um valor negativo em positivo.
 * ?(-)Operador unário de valor negativo - pega um valor positivo e o converte em negativo.
 * ?(++)Operador unário de incremento de valor - incrementa o valor em 1 unidade.
 * ?(--)Operador unário de decremento de valor - Decrementa o valor em 1 unidade.
 * ?(!)Operador unário lógico de negação - nega o valor de uma expressão booleana/inverte o valor da variável. (lógica(True/False)).
 * !Operador Ternário:
 * ?é uma forma resumida para definir uma condição e escolher por um dentre dois ou mais valores.
 * ?deve-se pensar numa condição ternária como se fosse uma condição "IF" normal, porém, de forma em que toda a sua estrutura estará escrita numa única linha.
 * ?O operador ternário é representado pelos símbolos "?:" utilizados na seguinte estrutura de sintaxe:
 * *<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
 * !Operadores Relacionais:
 * ?Tem a proposta de avaliar relações/condições entre algumas expressões.
 * ?Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, maior ou igual ao da direita, retornando um valor booleano.
 * ?(==) Quando desejamos verificar se uma variável é IGUAL a outra.
 * ?(!=) Quando desejamos verificar se uma variável é DIFERENTE da outra.
 * ?(>) Quando desejamos verificar se uma variável é MAIOR QUE a outra.
 * ?(>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
 * ?(<) Quando desejamos verificar se uma variável é MENOR QUE outra.
 * ?(<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
 * !Operadores Lógicos:
 *  ?Representam o recurso que nos permite criar epressões lógicas maiores a partir da junção de duas ou mais expressões.
 * ?(&&) Operador lógico "E";
 * ?(||) Operador lógico "OU".
 */
public class Operadores {
    /**
     * @param args
     */
    public static void main (String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
            System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;
            System.out.println(numero);
        numero = numero * -1;
            System.out.println(numero);
            
        //x repetição
        numero++;
        //!OBS: o operador "++" só tem efeito após a leitura dele mesmo. Exemplo prático:
            System.out.println(numero++);
            System.out.println(numero);
            System.out.println(++numero);
        
        boolean variavel = true;
        //!OBS: para dizer que nesse exato momento eu quero minha variável como falsa, utiliza-se:
            System.out.println(!variavel);
            //podemos ver que se eu imprimir a variavel ela continua sendo true
            System.out.println(variavel);
            //!Para alterar de forma definitiva a variavel para false, utiliza-se dessa forma:
            variavel = !variavel;
            //"mas eu nao poderia simplismente coloca-la como falsa?"
            //poderia, mas e se ela fosse falsa e eu quisesse converter como true? eu nao poderia.
            System.out.println(variavel);
        
        //!Aplicabilidade de operador ternário na linguagem:
        int a, b;
        a = 6;
        b = 7;
        String resultado = a == b ? "verdadeiro" : "falso";
            System.out.println(resultado);
        //observe que operador ternário não se limita a Strings, temos sempre duas opções de valores a serem atribuidos em uma variavel com seu tipo correspondente.
        //exemplo usando numeros inteiros como resposta da maquina:
        int resultadoNumerico = a == b ? 1 : 0;
            System.out.println(resultadoNumerico);

        //!Operadores relacionais:

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUM é diferente do numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        
        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        String nomeUm = "Kauã";
        String nomeDois = new String("Kauã");
            System.out.println(nomeUm.equals(nomeDois));
            //*o método equals compara conteúdos. eu tenho dois objetos e ele compara se o conteúdo dos dois objetos é igual */
            //*portanto, para objetos é interessante que se use o equals, já para números são os operadores relacionais. */
        
        //!Operadores lógicos:
        boolean condicao1=true;
        boolean condicao2=false;
        //se a condição 1 E a condição 2 for verdadeira.
        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }
        //O "ou" verifica se uma das condições é verdadeira
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}