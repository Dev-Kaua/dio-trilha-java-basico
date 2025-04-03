import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
        //Garantiu que, quando a condição se tornou verdadeira, no caso, atendeu o telefone,
        //fosse mostrada como execução final do programa.
        //diferentemente de um While que identificaria a condição verdadeira e nao a executaria.
        System.out.println("Alô!!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
