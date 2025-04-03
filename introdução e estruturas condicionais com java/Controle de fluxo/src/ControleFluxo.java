/*
 !Controle de fluxo:
 ?  É a habilidade de ajustar a maneira como um programa realiza suas tarefas.
 ?  Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser
 ?  executadas seletivamente, repetidamente ou excepcionalmente.
 *  Controle de fluxo é um método valioso não só para o java, mas para qualquer linguagem.
 !Classificação:
 !  Estruturas condicionais: if-else, switch-case
 !  Estruturas de repetição: for, while, do-while
 !  Estruturas de exceções: try-catch-finally, throw

 !ESTRUTURAS CONDICIONAIS:
 ?  ela possibilita a escolha de um grupo de ações e comportamnetos a serem executados quando
 ?  determinadas condições são ou não satisfeitas. Ela pode ser simples ou composta
 ?  CONDICIONAIS SIMPLES:
 ?      Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva,
 ?      consideramos como uma estrutura simples por exemplo:
 ?          <Inicio>  ->  <Sacar>  ->  <Contém saldo?>  -sim->  <Atualiza saldo>
 ?                                                      -não->  <fim>
 ?              Observa-se que essa é uma condição simples, onde só há dois fluxos, ou verdadeiro ou falso, ou positivo ou negativo.
 !              EXEMPLO DE ESTRUTURA CONDICIONAL SIMPLES EM "CaixaEletronico.java"
 ?  CONDICIONAL COMPOSTA:
 ?      As vezes o programa deve seguir mais de uma jornada de execução condicionado a uma regra de negócio,
 ?      este cenário é denominado 'Extrutura condicional composta'. Exemplo:
 ?          <inicio>  ->  <resultado escolar>  ->  <nota >= 7?>  -sim->  <Imprime aprovado>
 ?                                                               -não->  <imprime reprovado>
 !                  EXEMPLO DE CONDICIONAL COMPOSTA EM "ResultadoEscolar"
 ?  CONDICIONAL ENCADEADA:
 ?      nem sempre nos limitamos ao se (if) e senão (else), podemos ter uma terceira, quarta ou inúmeras (else if)
 ?      condições. Exemplo:
 ?          <inicio> ->  <Resultado escolar>  ->  <nota >= 7?>  -sim->  <print aprovado>
 ?                                                              -não->  <nota >=5?>  -sim->  <print recuperação>
 ?                                                                                   -não->  <print reprovado>
 ?  CONDIÇÃO TERNÁRIA:
 ?      podemos abreviar nosso algorítmo condicional refatorando com o conceiro de operador ternário.
 ?      Vamos refatorar os exemplos acima para ilustrar o poder deste recurso.
 !              EXEMPLO DE CONDIÇÃO TERNÁRIA EM "ResultadoEscolarTernario.java"
 ?  SWITCH CASE:
 ?      Ele compara o valor de casa caso com o da variável sequencialmente, e sempre que encontra um
 ?      valor correspondente, executa o código associado ao caso. Para evitar que as conparações
 ?      continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos 
 ?      o comando "break" no final de cada bloco de código. O comando break, quando executado,
 ?      encerra a execução da estrutura onde ele se encontra.
 !              Exemplo aplicado em "SistemaMedida.java"
 */