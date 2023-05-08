public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void aumentarVolume(){
        //volume = volume ++;
        volume++;

        System.out.println("Volume aumentado " + volume);
    }


    public void diminuirVolume(){
        volume--;

        System.out.println("Volume diminuido " + volume);
    }

    public void aumentarCanal(){
        canal++;

        System.out.println("Canal aumentado " + canal);

    }
    
    public void reduzirCanal(){
        canal--;

        System.out.println("Canal reduzido " + canal);

    }    

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;

    }


}