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
public class Curso {
    
    // Propiedades
    private int id;
    private String nombre;
    
    // Enlaces
    private Curso siguiente;
    
    public Curso(int id, String nombre) {
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

    public Curso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Curso siguiente) {
        this.siguiente = siguiente;
    }
    
}
