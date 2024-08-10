package edu.kaua.exemplo;

public class SmartTv {
    boolean estadoDaTv = false;
    int canal = 1;
    int volume = 12;

    //Configurar estado da TV:
    public void ligarTv(){
        estadoDaTv = true;
    }
    public void desligarTv(){
        estadoDaTv = false;
    }

    //Configurar Canal:
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    //Configurar Volume:
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
