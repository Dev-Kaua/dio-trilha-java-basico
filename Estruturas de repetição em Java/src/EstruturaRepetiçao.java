/*
 !ESTRUTURAS DE REPETIÇÂO:
 ?  Laços de repetição ou loops, são comandos que permitem iteraração(Repetição) de código, ou seja, que
 ?  comandos presentes no bloco sejam repetidos diversas vezes até que uma condição determine
 ?  a parada do loop.
 ! são representados pelas seguintes estruturas:
 ?      -For
 ?      -While
 ?      -Do While
 !  For:
 ?      Permite que uma variável contadora seja testada e incrementada a cada iteração, sendo
 ?      essas informações definidas na chamada do comando. O comando for recebe como entrada uma
 ?      variável contadora, a condição e o valor de incrementação.
 ?      Estrutura do for:
 ?          for (bloco de inicialização; expressão booleana de validação; bloco de atualização){
 ?              //comando que será executado até que a expressão de validação torne-se falsa.
 ?          } 
 *                  Exemplo de for em "Carneirinhos.java"
 ?      Também usamos o controle de fluxo for para iteragir sobre arrays e coleções
 *              Exemplo de for em arrays em "ExemploForArray.java"
 ?      For Each:
 ?          O uso dele esta fortemente relacionado com um cenario onde contenha um array ou 
 ?          coleção, e assim, a iteração é baseada aos elementos da coleção.
 *              exemplo em "ExemploForEach.java"
 ?      Break e Continue:
 ?          Break significa quebrar/interromper.E é isso que se faz quando o java encontra esse
 ?          comando pela frente. Continue, como o nome ja diz, "continua" o laço.
 ?          O comando break interrompe o laço, já o continue interrompe somente a iteração atual.
 *              Exemplo em "ExemploBreakContinue.java"
 !  While:
 ?      Determina que enquanto uma condição for válida, o bloco de código será executado.
 ?      O laço whie testa a condição antes de executar o código, logo, caso a condição
 ?      seja inválida no primeiro teste o bloco nem será executado.
 ?      A estrutura de sintaxe while:
 ?          while (expressão booleana de validaçao) {
 ?              //comando que será executado até que a
 ?              //expressão de validação torne-se falsa
 ?          }
 *              Exemplo de estrutura while em "ExemploWhile.java"
 !  Do While:
 ?      Assim como o laço while, considera que enquanto uma determinada condição for válida o 
 ?      bloco de código será executado. Entretando, do while testa a condição após executar o 
 ?      código, sendo assim, mesmo que a condição seja considerada inválida no primeiro teste
 ?      o bloco será executado pelo menos uma vez.
 ?      Estrutura de sintaxe "Do While":
 ?          do{
 ?              //comando que será executado até que a 
 ?              //expressão de validação torne-se falsa
 ?          }
 ?          while(expressão booleana de validação);
 *              Exemplo de estrutura Do While em "ExemploDoWhile.java"
 */

public class EstruturaRepetiçao {
}