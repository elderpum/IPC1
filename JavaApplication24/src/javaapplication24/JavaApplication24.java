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
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante(1, "Nombre1");
        Estudiante estudiante2 = new Estudiante(2, "Nombre2");
        Estudiante estudiante3 = new Estudiante(3, "Nombre3");
        Estudiante estudiante4 = new Estudiante(4, "Nombre4");
        
        ManejadorEstudiante manejador = new ManejadorEstudiante();
        
        manejador.agregarInicio(estudiante1);
        manejador.agregarInicio(estudiante2);
        manejador.agregarInicio(estudiante3);
        manejador.agregarInicio(estudiante4);
        
        /*
        manejador.agregarFinal(estudiante1);
        manejador.agregarFinal(estudiante2);
        manejador.agregarFinal(estudiante3);
        manejador.agregarFinal(estudiante4);
        */
        
        Estudiante puntero = manejador.getInicio();
        for(int i = 0; i<manejador.getLongitud(); i++) {
            System.out.println("Id: " + puntero.getId() + "  /  Nombre: " + puntero.getNombre());
            puntero = puntero.getSiguiente();
        }
    }
    
}
