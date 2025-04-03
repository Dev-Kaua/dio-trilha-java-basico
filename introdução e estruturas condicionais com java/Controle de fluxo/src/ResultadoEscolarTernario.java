public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        //*Else é representado pelo ":" já o "?" apresenta o que vai acontecer caso a condição seja verdadeira.
        //*Por fim, o programa conclui qual é o resultado e, nesse caso, imprime ele.
    }
}
