public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS" }; //Atributo chamado length que significa tamanho

        for (int x=0; x< alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
