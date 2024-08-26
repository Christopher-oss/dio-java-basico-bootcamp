public class SmartTv {

    // variaveis
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // metodo ligar TV
    public void ligar() {
        ligada = true;
    }

    // metodo desligar TV
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    } 
}
