package Logica;

public class Semestre {
    private int anio;
    private int numerosem;
    private boolean bandera;
    private ManejadorAsignaciones asignacion;
    
    private Semestre siguiente;
    private Semestre anterior;

    public Semestre(int anio, int numerosem, boolean bandera) {
        this.anio = anio;
        this.numerosem = numerosem;
        this.bandera = bandera;
        this.asignacion = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumerosem() {
        return numerosem;
    }

    public void setNumerosem(int numerosem) {
        this.numerosem = numerosem;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public ManejadorAsignaciones getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(ManejadorAsignaciones asignacion) {
        this.asignacion = asignacion;
    }

    public Semestre getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Semestre siguiente) {
        this.siguiente = siguiente;
    }

    public Semestre getAnterior() {
        return anterior;
    }

    public void setAnterior(Semestre anterior) {
        this.anterior = anterior;
    }

    
    
}
