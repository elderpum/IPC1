/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import javax.swing.table.DefaultTableModel;
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

    public boolean buscar(String referencia){
        Estudiante aux = inicio;
        boolean existe = false;
        do
            if(referencia.equals(aux.getCarnet()))
                existe = true;
            else
                aux = aux.getSiguiente();
        while(aux != inicio && !existe);
        return existe;
    }
    
    public void editar(String car, String dpi, String nom, String cor, String dir, int cred, String pass){
        if(buscar(car)){
            Estudiante aux = inicio;
            while(aux.getCarnet() != null ? aux.getCarnet().equals(car) : car == null) 
            aux = aux.getSiguiente();
            aux.setCarnet(car);
            aux.setDpi(dpi);
            aux.setNombre(nom);
            aux.setCorreo(cor);
            aux.setDireccion(dir);
            aux.setNocreditos(cred);
            aux.setPassword(pass);
        }
    }
    
     public void eliminar(String referencia){
        if(buscar(referencia)){
            if(inicio.getCarnet().equals(referencia))
            {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            }else{
                Estudiante aux = inicio;
                while(aux.getSiguiente().getCarnet()!= null ? aux.getSiguiente().getCarnet().equals(referencia) : referencia == null) 
                    aux = aux.getSiguiente();
                if(aux.getSiguiente() == fin){
                    aux.setSiguiente(inicio);
                    fin = aux;
                } else
                {
                    Estudiante siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            this.longitud--;
        }
    }
     
     public Estudiante buscarNodo(String carnet){
        for(Estudiante recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getCarnet().equals(carnet))
                return recorrer;

        return null;
    }
     
     public boolean buscarEstudiante(String carnet){
        for(Estudiante recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente()){
            if(recorrer.getCarnet().equals(carnet)){
                return true;
            }
        }
        return false;
    }
     
     public void ver(int opcion){
         String carnet, dpi, nombre, correo, direccion, contrasenia;
         int creditos;
                 Estudiante aux = inicio;
                 while (aux != null) {                     
                     carnet = aux.getCarnet();
                     dpi = aux.getDpi();
                     nombre = aux.getNombre();
                     correo = aux.getCorreo();
                     direccion = aux.getDireccion();
                     creditos = aux.getNocreditos();
                     contrasenia = aux.getPassword();
                     Object[] fila = {carnet, dpi, nombre, correo, direccion, creditos, contrasenia};
                     
                 }
        }
     
     public boolean buscarEstudianteLogin(String carnet, String password){
        for(Estudiante recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
            if(recorrer.getCarnet().equals(carnet) && recorrer.getPassword().equals(password))
                return true;

        return false;
    }
     
     public void mostrarTabla(DefaultTableModel modelo){
        for(Estudiante recorrer = inicio; recorrer != null; recorrer = recorrer.getSiguiente())
        {
            String datos[] = new String[8];
            datos[0] = recorrer.getCarnet();
            datos[1] = recorrer.getDpi();
            datos[2] = recorrer.getNombre();
            datos[4] = recorrer.getCorreo();
            datos[5] = recorrer.getDireccion();
            datos[6] = String.valueOf(recorrer.getNocreditos());
            datos[7] = recorrer.getPassword();
            modelo.addRow(datos);
        }

    }
}
