public class estudo_java {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv ligada ? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(12);

        System.out.println("Canal atual : " + smartTV.canal);
        System.out.println("Programa: " + smartTV.programa);
        System.out.println("Volume atual: " + smartTV.volume);
        
        smartTV.ligar();
        System.out.println("Tv ligada ? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);
    }


}
