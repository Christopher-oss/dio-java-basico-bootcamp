public class MinhaClasse { // inicio do corpo da classe//

    // Corpor Primeiro Metodo
    public static void main(String[] args) {

        String primeiroNome = "Christopher";
        String segundoNome = "Martins";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Corpo Segundo Metodo

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

} // fim do corpo da classe//
