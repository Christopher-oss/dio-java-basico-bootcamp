public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "T";

        switch (plano) {
            case "B": {
                System.out.println("Plano Basic!");
                System.out.println("Vantagens: 100 minutos de ligação");
                break;
            }
            case "M": {
                System.out.println("Plano Midia!");
                System.out.println("Vantagens: 100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            }
            case "T": {
                System.out.println("Plano Turbo!");
                System.out.println("Vantagens: 100 minutos de ligação + WhatsApp e Instagram grátis + 5gb YouTube");
                break;
            }

            default:
                System.out.println("Não identificado");
                break;
        }
    }
}
