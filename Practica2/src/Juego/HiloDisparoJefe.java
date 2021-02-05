package Juego;
import static Juego.Nivel.disparojefe;

public class HiloDisparoJefe extends Thread{
    public void run(){
        int x = Nivel.jefe.getX();
        int y = Nivel.jefe.getY();
        
        try{
            while(true){
                disparojefe.setVisible(true);
                sleep(1);
                x = x-2;
                
                if (x < 50) {
                    disparojefe.setVisible(false);
                    stop();
                    break;
                }
                disparojefe.setLocation(x, y);
            }
        }catch (Exception e){
            
        }
    }
}
