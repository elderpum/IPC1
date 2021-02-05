package Logica;

public class ManejadorAsignaciones {
    private Asignacion inicio;
    private Asignacion fin;
    private int longitud;

    public ManejadorAsignaciones() {
        this.inicio = null;
        this.fin = null;
        this.longitud = 0;
    }
    
    public Asignacion getInicio(){
        return this.inicio;
    }
    
    public Asignacion getFin(){
        return this.fin;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
    
    public boolean agregarInicio(Asignacion nuevo) {
        if (this.inicio == null) {
           this.inicio = nuevo;
           this.fin = nuevo;
           nuevo.setAnterior(this.fin);
           nuevo.setSiguiente(this.inicio);
           this.longitud++;
           return true;
        } else {
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(this.fin);
            this.fin.setSiguiente(nuevo);
            this.inicio.setAnterior(nuevo);
            this.inicio = nuevo;
            this.longitud++;
            return true;
        }
    }
    
    public boolean agregarFinal(Asignacion nuevo) {
         if (this.inicio == null) {
           this.inicio = nuevo;
           this.fin = nuevo;
           nuevo.setAnterior(this.fin);
           nuevo.setSiguiente(this.inicio);
           this.longitud++;
           return true;
        } else {
             nuevo.setAnterior(this.fin);
             nuevo.setSiguiente(this.inicio);
             this.fin.setSiguiente(nuevo);
             this.inicio.setAnterior(nuevo);
             this.fin = nuevo;
             this.longitud++;
             return true;
         }
    }
}
