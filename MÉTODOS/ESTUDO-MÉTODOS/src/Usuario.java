public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada :" + smartTv.ligada);
        System.out.println("Canal atual :" + smartTv.canal);
        System.out.println("Volume inicial: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada :" + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(13);
    }
}
