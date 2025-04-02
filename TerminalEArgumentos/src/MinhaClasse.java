//!Objetivo: explorar opções de entrada  e saida simples de dados em uma aplicação java.
/*
!Terminal e Argumentos:
 ?Nem sempre executamos nosso programa java pela IDE, ja pensou nossos clientes tendo que instalar 
 ?o Eclipse ou Vscode para rodar o sistema em sua empresa?
 ?Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar
 ?o instalador para qualquer sistema operacional.
 ?no nosso caso iremos aprender como executar um programa java via terminal como MS-DOS ou terminal do Vscode.
 *Observe que nosso projeto java criado pela IDE terá uma pasta chamada bin.
 *  É nesta pasta que ficarão os arquivos .class, o nosso bytecode.
 !Argumentos:
 ?  Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array[] de
 ?  argumentos do tipo String. Logo, podemos após a definição da classe a ser executada informar estes parâmetros.
 ?  Exemplo: 
 ?      java MinhaClasse argumentoUm argumentoDois
 !Dentro da pasta vscode do nosso projeto java, temos settings.json e, caso nós abramos uma configuração
 !dentro de "executar", vai aparecer a launch.json;
 ?      isso serve para não ser necessário ir até o terminal do prompt para executar algo no terminal,
 ?      podendo executar aqui na IDE.
 ?      Lá, podemos alterar os argumentos da classe AboutMe nesse caso, e ele dará o resultado com base
 ?      nos argumentos que estão digitados lá!
 ?      portanto a IDE deixa um padrãozinho para voçê poder executar aqui da IDE ao invés de precisar ir até o prompt.
 !Scanner:
 ?  ela tem a proposta de ter uma melhor interação no que se refere aos imputs ou entrada de dados que 
 ?  os nossos usuários vão querer utilizar em nossos programas.
 ?  Porém, tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes.
 ?  Essa abordagem pode deixar margens de execução com erro ao nosso programa.
 ?  Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras agora vamos
 ?  receber estes dados via Scanner.
 *      Veja como vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usuários.
 */

//*Vamos criar uma classe chamada MinhaClasse.java:

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("update: Oi, fui executado pelo terminal!");
    }
}