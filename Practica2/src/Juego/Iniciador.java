package Juego;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Iniciador {

    public static void main(String[] args) {
       Principal menu = new Principal();
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
       try {
            FileInputStream fis;
            Player player;
            fis = new FileInputStream("C:\\Users\\Elder\\Desktop\\Prueba\\cancion1.mp3");
            BufferedInputStream bis =new BufferedInputStream(fis);
            
            player =new Player(bis);
            player.play();
            
            
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e ){
        e.printStackTrace();
        }
    }
    
}
