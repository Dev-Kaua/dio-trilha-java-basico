//!ESCOPO:
//!     escopo pode ser entendido como o ambiente onde uma variável pode ser acessada.
//!     Em java,o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.
//?Através do conceito de ESCOPO que conseguimos ter uma estrutura mais adequada das nossas imprementações.
/**
 * *O objetivo é identificar a localização mais conveniente para a escrita de algoritmos
 * *necessários para o nosso programa.
 * !Tipos de escopo:
 * ?    -Escopo de classes;
 * ?    -Escopo de método;
 * ?    -Escopo de fluxo;
 */
//!Exemplo prático:


public class Escopo {

    public class conta{
        //!primeiro cenário:
        //variável da classe conta:
        double saldo=10.0;

        public void sacar(Double valor){
            //variavel local do metodo:
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo(){
            //disponível em toda classe
            System.out.println(saldo);
            //somente o método sacar conheçe essa variável:
            System.out.println("novoSaldo"); //se remover as aspas, verá que vai dar erro...
        }

        //!Segundo cenário:
        public double calcularDividaExponencial(){
            //variavel local de método:
            double valorParcela=50.0;
            //outra variável de método:
            double valorMontante=0.0;
            for(int x=1; x<=5; x++){ //"x" e "valorCalculado" é uma variável de bloco/de escopo.
                //as variáveis feitas dentro desse bloco "for" só podem ser utilizadas aqui dentro, ou seja, dentro desse escopo. 
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            //nesse caso, a unica variável que ainda pode ser vizualizada dentro do método é o "valorMontante".
            //x e valorCalculado nunca estarão disponíveis fora do "for".
            return valorMontante;
        }   
        
    }
}
