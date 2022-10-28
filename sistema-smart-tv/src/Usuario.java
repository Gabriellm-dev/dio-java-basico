// O usuario esta interagindo com a smartTv.

public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        //SmartTV Ligada
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
        //SmartTV foi desligada
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);      

        //Status da SmartTV
        System.out.println("Volume atual : " + smartTv.volume);
        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Qual o canal ? " + smartTv.canal);
        System.out.println("Qual o volume " + smartTv.volume);

        // Trocando o canal da SmartTV
        System.out.println("Canal atual : "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : "+smartTv.canal);

        // Diminuindo e aumentando o volume da smartTv
        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


    }
}
