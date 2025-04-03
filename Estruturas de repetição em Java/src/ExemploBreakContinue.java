public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero==3)
            //por mais que a nossa condição determinasse de 1 a 5, quando chegamos no 3 ele detectou
            //o break, que interrompeu todo o nosso for
                break;
                //continue;
                //Já se colocarmos o continue ele apenas não irá executar o numero == 3,
                //mas não irá parar a aplicação do for, ja que após o 3 ele vai continuar
                //imprimindo as outras variáveis
            System.out.println(numero);
        }
    }
}
