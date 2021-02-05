package Juego;
import static Juego.Nivel.cuphead;
import static Juego.Nivel.jefe;
import static Juego.Nivel.x1;
import static java.lang.Thread.sleep;
public class HiloJefe extends Thread{
    public void run(){
     
        try{
            while (true) {                
        while(jefe.getY()>-x1){
        jefe.setLocation(jefe.getX(),jefe.getY()-10);
        sleep(100);
         }
        while(jefe.getY()<550){
         jefe.setLocation(jefe.getX(),jefe.getY()+10);
         sleep(100);
         }      
      }
    }catch(Exception e){

    }
    }
}
