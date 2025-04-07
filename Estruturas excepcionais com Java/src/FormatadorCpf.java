public class FormatadorCpf {
    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCpf(""); // teste com CPF vazio
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            System.out.println("O CPF não corresponde com as regras do negócio");
        }
    }

    static String formatarCpf(String cpf) throws CpfInvalidoException {
        if (cpf.length() != 11) {
            throw new CpfInvalidoException();
        }
        // simulando um CPF formatado
        return "245.039.785-85";
    }
}