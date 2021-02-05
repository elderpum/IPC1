package Juego;

public class DisparoCuphead {
    int danio;
    String ruta;
    double velocidad;

    public DisparoCuphead() {
    }

    public DisparoCuphead(int danio, String ruta, double velocidad) {
        this.danio = -1;
        this.ruta = "";
        this.velocidad = 0;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
