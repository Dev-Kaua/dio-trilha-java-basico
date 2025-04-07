
import java.text.NumberFormat;

public class ExemploExceçao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
        //!
        Number valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println("Valor");
    }
}
