/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Elder
 */
public class Estudiante {
    // Propiedades
    private String carnet;
    private String dpi;
    private String nombre;
    private String correo;
    private String direccion;
    private int nocreditos;
    private String password;
    private int valor;
    
    // Enlaces
    private Estudiante anterior;
    private Estudiante siguiente;

    public Estudiante() {
    }
    
    public Estudiante(String carnet, String dpi, String nombre, String correo, String direccion, int nocreditos, String password) {
        this.carnet = carnet;
        this.dpi = dpi;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.nocreditos = nocreditos;
        this.password = password;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNocreditos() {
        return nocreditos;
    }

    public void setNocreditos(int nocreditos) {
        this.nocreditos = nocreditos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
