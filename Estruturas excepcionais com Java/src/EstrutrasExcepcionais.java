/*
 !Exceções:
 ?  Ao executar o código java, erros podem acontecer: erros de codigicação feitos pelo programador,
 ?  erros devido a entrada errada ou de imprevistos.
 ?      Nada mais é do que um fluxo inesperado da aplicação.
 ?      No entanto a aplicação ainda consegue através de estruturas de prevenção
 ?      tentar redirecionar a aplicação para um caminho ainda estruturado 
 ?      mesmo quando acontece uma excessão, seja uma excessão de negócio, parametrizações,
 ?      inputs inválidos, ou tentativas de conexões que não são bem sucedidas.
 ?  Diferentemente de um erro que é algo irreparável, a aplicação trava ou é encerrada drasticamente,
 ?  As exceções seriam um fluxo inesperado da nossa apicação. Exemplo: querer abrir um arquivo
 ?  inexistente, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários
 ?  e os demais não são erros mas sim fluxos não previstos pela aplicação.
 
 ?  É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas
 ?  e realizar o que denominamos de Tratamento de Exceções.
 
 !Mão na massa:
 ?  Vamos trazer o cenário que estudamos na aula sobre terminal e Argumentos onde via terminal
 ?  informamos alguns dados pessoais.
 *          Exemplo em "AboutMe.java
 ?      Aparentemente é um programa simples, no entanto existem exceções que podem acontecer.
 ?      -Não informar o nome e sobrenome
 ?      -O valor da idade ter um caractere NÃO numérico
 ?      -O valor da altura ter uma vírgula ao invês de ser um ponto (conforme padrão americano)
 ?          Vamos prever esses possiveis erros que podem ocorrer devido ao usuário!
 !  Conhecendo as excessões ja mapeadas, a linguagem java dipõe uma vasta lista de classes que 
 !  representam exceções, as maix comuns são:
 ?      java.lang.NullPointerException  ->  Quando tentamos obter uma variavel nula.
 ?      java.lang.ArithmeticException   ->  Quando tentamos dividir por zero.
 ?      java.sql.SQLException   ->  Quando existe algum erro relacionado a interação c/ banco de dados.
 ?      java.io.FileNotFoundException   ->  quando tentamos ler/escrever um arquivo inexistente.
 !TRATAMENTO DE EXCEÇÕES:
 ?  A instrução try permite que voçê defina um bloco de código para ser testado quanto a erros
 ?  enquanto está sendo executado.
 ?  A instrução catch permite definir um bloco de código a ser executado, caso ocorra um erro
 ?  no bloco try.
 ?  A instrução finally permite definir um bloco de código a ser executado independente de 
 ?  ocorrer um erro ou não. As palavras-chave try e catch vêm em pares e a finally é opicional.
 ?      Estrutura de um bloco com try e catch:
 ?          try {
 ?              //bloco de código conforme esperado
 ?          }
 ?          catch(Exception e) {//precisamos saber qual exceção 
 ?              //bloco de código que captura as exceções que podem acontecer
 ?              //em caso de um fluxo não previsto
 ?          }
 !Hierarquia das exceções:
 ?  A linguagem dispõe de uma variedade de classes que representam exceções,
 ?  essas são organizadas em uma hierarquia denominadas de:
 ?      CHECKED AND UNCHECKED EXCEPTIONS
 ?      o que determina uma exceção como checada ou não checada é o risco dela
 ?      ser disparada e logo voçê precisar tratá-la.
 ?  O sistema indicará que tem algo de errado com o código e ele mesmo trará
 ?  a opção de ele tratar a exceção no seu código com try/catch.
 *          Exemplo de exceção em "ExemploExceção.java"
 *          Exemplo de exceção tratada em "FormatadorCep.java"
 */