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
public class Estudiante {
    // Propiedades
    private int id;
    private String nombre;
    
    // Enlaces
    private Estudiante anterior;
    private Estudiante siguiente;
    
    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.siguiente = null;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante getAnterior() {
        return anterior;
    }

    public void setAnterior(Estudiante anterior) {
        this.anterior = anterior;
    }

    public Estudiante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estudiante siguiente) {
        this.siguiente = siguiente;
    }
    
}
