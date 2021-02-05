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
    
    public boolean buscar(String referencia){
        Curso aux = inicio;
        boolean existe = false;
        do
            if(referencia.equals(aux.getNocurso()))
                existe = true;
            else
                aux = aux.getSiguiente();
        while(aux != inicio && !existe);
        return existe;
    }
    
    public void eliminar(String referencia){
        if(buscar(referencia)){
            if(inicio.getNocurso().equals(referencia))
            {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            }else{
                Curso aux = inicio;
                while(aux.getSiguiente().getNocurso()!= null ? aux.getSiguiente().getNocurso().equals(referencia) : referencia == null) 
                    aux = aux.getSiguiente();
                if(aux.getSiguiente() == fin){
                    aux.setSiguiente(inicio);
                    fin = aux;
                } else
                {
                    Curso siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            this.longitud--;
        }
    }
    
    public void editar(String nocur, String nom, String cat, int cred, String lab, String secc, String[] pre, String post){
        if(buscar(nocur)){
            Curso aux = inicio;
            while(aux.getNocurso()!= null ? aux.getNocurso().equals(nocur) : nocur == null) 
            aux = aux.getSiguiente();
            aux.setNocurso(nocur);
            aux.setNombreCurso(nom);
            aux.setCatedratico(cat);
            aux.setCreditos(cred);
            aux.setLab(lab);
            aux.setSeccion(secc);
            aux.setPrerequisito(pre);
            aux.setPostrequisito(post);
        }
    }
    
    public Curso buscarNodo(String nocurso){
        for(Curso recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getNocurso().equals(nocurso))
                return recorrer;

        return null;
    }
}