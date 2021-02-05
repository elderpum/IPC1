/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author Elder
 */
public class ManejadorEstudiante {
    private Estudiante inicio;
    private Estudiante fin;
    private int longitud;
    
    public ManejadorEstudiante() {
        this.inicio = null;
        this.fin = null;
        this.longitud = 0;
    }
    
    public Estudiante getInicio() {
        return this.inicio;
    }
    
    public Estudiante getFin() {
        return this.fin;
    }
    
    public int getLongitud() {
        return this.longitud;
    }
    
    public boolean agregarInicio(Estudiante nuevo) {
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
    
    public boolean agregarFinal(Estudiante nuevo) {
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
    
    public boolean buscar(int referencia){
        Estudiante aux = inicio;
        boolean encontrado = false;
        do{
            if (referencia == aux.getId()) {
                encontrado = true;
            }else{
                aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
        return encontrado;
    }
    
    public void editarPorReferencia(int referencia, int valor){
        if (buscar(referencia)) {
            Estudiante aux = inicio;
            while(aux.getId() != referencia){
                aux = aux.getSiguiente();
            }
        }
    }
    
    public void removerPorReferencia(int referencia){
        if (buscar(referencia)) {
            if (inicio.getId() == referencia) {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            }else{
                Estudiante aux = inicio;
                while(aux.getSiguiente().getId() != referencia){
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == fin) {
                    aux.setSiguiente(inicio);
                    fin = aux;
                }else{
                    Estudiante siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            longitud--;
        }
    }
    
}
