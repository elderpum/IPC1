package Juego;
import static Juego.Nivel.cuphead;
import static Juego.Nivel.disparo1;
import static Juego.Nivel.vectorDisparo;

public class HiloDisparo1 extends Thread{
    public void run(){
        try {
            disparo1.setLocation(cuphead.getX(),cuphead.getY());
            while (true) {                
                disparo1.setVisible(true);
            while(disparo1.isVisible()==true){
                    disparo1.setLocation(disparo1.getX()+10, disparo1.getY());
                    sleep(20);
            if(disparo1.getX()>1100){
                   disparo1.setLocation(cuphead.getX(),cuphead.getY());
                   disparo1.setVisible(false);
                   stop();
                   break;
                }
                }
            }
        } catch (Exception e) {
        }
    }
}