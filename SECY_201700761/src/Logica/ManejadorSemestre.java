package Logica;

public class ManejadorSemestre {
    private Semestre inicio;
    private Semestre fin;
    private int longitud;

    public ManejadorSemestre() {
        this.inicio = null;
        this.fin = null;    
        this.longitud = 0;
    }
    
    public Semestre getInicio(){
        return this.inicio;
    }
    
    public Semestre getFin(){
        return this.fin;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
    
    public boolean agregarInicio(Semestre nuevo) {
        if (this.inicio == null) {
           this.inicio = nuevo;
           this.fin = nuevo;
           nuevo.setAnterior(this.fin);
           nuevo.setSiguiente(this.inicio);
           nuevo.setBandera(true);
           this.longitud++;
           return true;
        } else {
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(this.fin);
            this.fin.setSiguiente(nuevo);
            this.inicio.setAnterior(nuevo);
            this.inicio.setBandera(false);
            this.inicio = nuevo;
            nuevo.setBandera(true);
            this.longitud++;
            return true;
        }
    }
    
    public boolean agregarFinal(Semestre nuevo) {
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
    
    public boolean buscar(int anio, int numero){
        Semestre aux = inicio;
        boolean existe = false;
        do
            if(anio == aux.getAnio() && numero == aux.getNumerosem())
                existe = true;
            else
                aux = aux.getSiguiente();
        while(aux != inicio && !existe);
        return existe;
    }
    
    public Semestre buscarNodo(int anio, int numero){
        for(Semestre recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getAnio() == anio && recorrer.getNumerosem() == numero)
                return recorrer;

        return null;
    }
}
