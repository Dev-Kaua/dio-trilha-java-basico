/*
  !Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
  *    1-Ela tenha as características: ligada(boolean), canal(int) e volume(int);
  *    2-Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
  *    3-Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
  *    4-Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */
public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
        System.out.println("Canal: " + canal);
    }
    public void subirCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume:" + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("volume:" + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada=false;  
    }
}
