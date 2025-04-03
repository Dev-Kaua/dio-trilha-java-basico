public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "M"; //M / T
        //!Forma tradicional de se escrever esse código, usando if else:
        /* 
        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if(plano == "A"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if(plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        } */
        //?Forma usando o switch case, onde não vamos precisar ser tão repetitivos:
        switch(plano) {
            case "T" : {
                System.out.println("5Gb youtube");
            }
            case "M" : {
                System.out.println("Whats e Instagram grátis");
            }
            case "B" : {
                System.out.println("100 minutos de ligação");
            } //?caso ele seja "M", ele cairá na segunda condição, mas como não colocamos o "break",
              //?ele irá adquirir todas as categorias que estão abaixo dele.
              //?Por isso ele está em ordem decrescente, onde o tipo "T" tem as condicões do "M" e "B"
              //?Inclusos nele. apenas nesses casos o switch case será necessãrio.
        }
    }
}
