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
public class Curso {
    
    // Propiedades
    private String nocurso;
    private String nombreCurso;
    private String catedratico;
    private int creditos;
    private String lab;
    private String seccion;
    private String[] prerequisito;
    private String postrequisito;
    
    // Enlaces
    private Curso siguiente;

    public Curso() {
    }

    public Curso(String nocurso, String nombreCurso, String catedratico, int creditos, String lab, String seccion, String[] prerequisito, String postrequisito) {
        this.nocurso = nocurso;
        this.nombreCurso = nombreCurso;
        this.catedratico = catedratico;
        this.creditos = creditos;
        this.lab = lab;
        this.seccion = seccion;
        this.prerequisito = prerequisito;
        this.postrequisito = postrequisito;
        this.siguiente = null;
    }

    public String getNocurso() {
        return nocurso;
    }

    public void setNocurso(String nocurso) {
        this.nocurso = nocurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String[] getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(String[] prerequisito) {
        this.prerequisito = prerequisito;
    }

    public String getPostrequisito() {
        return postrequisito;
    }

    public void setPostrequisito(String postrequisito) {
        this.postrequisito = postrequisito;
    }

    public Curso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Curso siguiente) {
        this.siguiente = siguiente;
    }

}
