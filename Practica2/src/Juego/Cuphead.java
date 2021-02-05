package Juego;

public class Cuphead {
    String tipo, nombre, ruta;
    int velocidad, danio;

    public Cuphead() {
    }

    public Cuphead(String tipo, String nombre, int velocidad, int danio, String ruta) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.danio = danio;
        this.ruta = ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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

    
}
