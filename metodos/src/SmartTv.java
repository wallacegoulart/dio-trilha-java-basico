public class SmartTv {

    boolean ligada = false;
    int canal = 1; 
    int volume = 25;


    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false ;
    }

    public void aumentarVolume(){
        volume =  volume +5;
        System.out.println("Aumentando o volume para:  " + volume);
    }

    public void diminuirVolume(){
        volume = volume -5;
        System.out.println("Diminuindo o volume para:  " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Sintonizado no canal :  " + canal);
    }

    public void dimunirCanal(){
        canal--;
        System.out.println("Sintonizado no canal :  " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Sintonizado no canal :  " + canal);
    }


}
