public class FormatadorCep {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("");
        System.out.println("cepFormatado");
        } catch(CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras do negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() ! = 8)
        throw new CepInvalidoException();
        //simulando um cep formatado
        return "23.875-064";
    }
}
