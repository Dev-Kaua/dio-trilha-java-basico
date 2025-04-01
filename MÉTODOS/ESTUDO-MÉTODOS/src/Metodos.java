//?MÉTODOS: Uma classe é definida por atributos e métodos. Já vimos que atributos são, na maioria, variáveis de diferentes tipos e valores.
//?Os métodos por sua vez, correspondem a funções ou sub-rotinas disponpiveis dentro de nossas classes.
/**
 * ! Critério de nomeação de métodos:
 * *    obs:Não são obrigatórios,mas são seguidos pois facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa
 * *    Ao seguir essas convecções, tornamos o código mais legível para todos.
 * ?    -Deve ser nomeado como verbo;
 * ?    -Seguir o padrão camelCase(Todas as letras minúsculas com exceção da primeira letra da segunda palavra.);
 * ?    -seguindo as boas práticas um método deve ter uma única responsabilidade (ex: ou calcular ou imprimir, e não calcularImprimir);
 * ?        Exemplos:
 * ?        somar(int n1, int n2){}
 * ?        findById(int id){}
 * *    obs: Não existe em java o conceito de métodos globais. todos os métodos devem sempre ser definidos dentro de uma classe.
 * ! Critérios de definição de métodos:
 * ?    Para saber a melhor forma de definir os métodos das nossas classes, somos auxiliados por uma convecção estrutural... :
 * ?    -Qual a proposta principal do método? --> voçê deve se perguntar constantemente até compreender a real finalidade do mesmo;
 * ?    -Qual o tipo de retorno esperado após executar o método? ;
 * *        obs:Caso o método não retorne nenhum valor, ele será representado pela palavra-chave "void".
 * ?    -Quais os parâmetros serão necessários para a execução do método?  --> eles as vezes precisarão de argumentos como critério para a execução;
 * ?    -O método possui risco de apresentar alguma excessão? --> elas são comuns na execução de métodos, é necessãrio prever e tratar a possivel existência delas;
 * ?    -Qual a visibilidade do método? --> será necessário que ele seja visível a toda a aplicação, somente em pacotes, através de herança ou somente a nível da própria classe?
 * ?        Exemplos:
 * ?       - public class MyClass {
 * ?            public double somar(int num1, int num2){
 * ?                //Logica - finalidade do método
 * ?                return...}
 * ?
 * ?            public void imprimir(String texto){
 * ?                //Logica - finalidade do texto
 * ?                //Aqui não precisa do return, não será retornado nenhum resultado
 * ?                }
 * ?            }
 */
public class Metodos {
    public static void main(String[] args) throws Exception {
        
    }
}
