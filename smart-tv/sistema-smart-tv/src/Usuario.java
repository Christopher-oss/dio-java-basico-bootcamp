public class Usuario {

    public static void main(String[] args) {

        // Criação do objeto TV
        SmartTv smartTv = new SmartTv();

        // Estado inicial da TV
        System.out.println("TV Ligada: " + smartTv.ligada);

        // Ligar TV
        smartTv.ligar();

        // Status Iniciais da TV
        System.out.println("Status inicial TV: " + smartTv.ligada);
        System.out.println("Canal Inicial: " + smartTv.canal);
        System.out.println("Volume Inicial: " + smartTv.volume);

        // Manipulando Volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        // Manipulando os Canais
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(22);

        System.out.println("Canal Atual: " + smartTv.canal);

        // Desligar TV
        smartTv.desligar();
        System.out.println("Novo Status TV: " + smartTv.ligada);
    }
}
