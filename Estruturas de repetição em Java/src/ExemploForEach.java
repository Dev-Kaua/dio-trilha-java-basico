public class ExemploForEach {
    public static void main(String[] args) {
        //em arrays o indice inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };
        
        /*
        !Observe que temos a mesma coleção de alunos do "ExemploForArray.java", mas nós iremos
        !agora abreviar a obtenção de cada um desses indices.
        
        */
        
        for(String aluno : alunos){
            //?A cada execução essa variável aluno vai obter um novo valor de alunos
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
