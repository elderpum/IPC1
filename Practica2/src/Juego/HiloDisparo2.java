package Juego;
import static Juego.Nivel.cuphead;
import static Juego.Nivel.disparo2;
import static Juego.Nivel.vectorDisparo;

public class HiloDisparo2 extends Thread{
     public void run(){
        try {
            disparo2.setLocation(cuphead.getX(),cuphead.getY());
            while (true) {                
                disparo2.setVisible(true);
            while(disparo2.isVisible()==true){
                    disparo2.setLocation(disparo2.getX()+10, disparo2.getY());
                    sleep(20);
            if(disparo2.getX()>1100){
                   disparo2.setLocation(cuphead.getX(),cuphead.getY());
                   disparo2.setVisible(false);
                   stop();
                   break;
                }
                }
            }
        } catch (Exception e) {
        }
    }
}
