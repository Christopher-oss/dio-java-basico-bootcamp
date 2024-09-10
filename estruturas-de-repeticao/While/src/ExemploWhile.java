import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.0;
        
        
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + "Adicionado ao carrinho!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Joãoziho gestou toda a sua mesada em doces");
    }

    private static Double valorAleatorio() {
       return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
