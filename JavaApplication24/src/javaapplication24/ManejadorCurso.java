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
public class ManejadorCurso {
    
    private Curso inicio;
    private Curso fin;
    private int longitud;

    public ManejadorCurso() {
        this.inicio = null;
        this.fin = null;
        this.longitud = 0;
    }
    
    public Curso getInicio() {
        return this.inicio;
    }
    
    public Curso getFin() {
        return this.fin;
    }
    
    public int getLongitud() {
        return this.longitud;
    }
    
    public boolean agregarInicio(Curso nuevo) {
        if (this.inicio == null) {
            this.inicio = nuevo;
            nuevo.setSiguiente(nuevo);
            this.fin = nuevo;
            this.longitud++;
            return true;
        } else {
            nuevo.setSiguiente(this.inicio);
            this.fin.setSiguiente(nuevo);
            this.inicio = nuevo;
            this.longitud++;
            return true;
        }
    }
    
    public boolean agregarFinal(Curso nuevo) {
        if (this.inicio == null) {
            this.inicio = nuevo;
            nuevo.setSiguiente(nuevo);
            this.fin = nuevo;
            this.longitud++;
            return true;
        } else {
            nuevo.setSiguiente(this.fin.getSiguiente());
            this.fin.setSiguiente(nuevo);
            this.fin = nuevo;
            this.longitud++;
            return true;
        }
    }
    
    
    
}
