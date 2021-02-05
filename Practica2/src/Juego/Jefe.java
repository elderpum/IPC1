package Juego;

public class Jefe {
    String tipo, nombre, rutadisparo, rutaimagen, escenario, cancion;
    int danio, nivel;
    double velocidad, frecuencia;

    public Jefe() {
    }

    public Jefe(String tipo, String nombre, String rutadisparo, String rutaimagen, String escenario, String cancion, int danio, int nivel, double velocidad, double frecuencia) {
        this.tipo = "";
        this.nombre = "";
        this.rutadisparo = "";
        this.rutaimagen = "";
        this.escenario = "";
        this.cancion = "";
        this.danio = -1;
        this.nivel = -1;
        this.velocidad = 0;
        this.frecuencia = 0;
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

    public String getRutadisparo() {
        return rutadisparo;
    }

    public void setRutadisparo(String rutadisparo) {
        this.rutadisparo = rutadisparo;
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    
}
