public class SistemaMedida {
    public static void main(String[] args) {
        /*String sigla = "M";

        if(sigla == "P"){
            System.out.println("PEQUENO");
        }
        else if(sigla == "M"){
            System.out.println("MEDIO");
        }
        else if(sigla == "G"){
            System.out.println("GRANDE");
        }
        else{
            System.out.println("INDEFINIDO");
        } */ //!Essa seria a forma de escrever esse código usando if else
         //?Vamos ver agora a forma utilizando switch case
        String sigla = "A";

        switch(sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Indefinido");
            }  /*
                 !Essa forma, no entanto não demonstra uma boa aplicabilidade, já que tivemos que digitar
                 !práticamente a mesma quantidade de código do que um if else, que portanto também seria 
                 !cabível nesse cenário.
                 ?Vamos análisar um caso onde demonstraria uma boa aplicabilidade em "PlanoTelefonico.java"
                 */ 
        }       


    } 
}
