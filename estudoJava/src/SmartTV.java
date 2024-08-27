public class SmartTV {

    boolean ligada = false;
    int canal = 5;
    int volume = 50;
    String programa = "Programa Silvio Santos";

    public void ligar (){
            ligada = true;
    }

    public void desligar (){
            ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
