package org.ElderPum.Bean;
import javax.swing.JOptionPane;
import org.ElderPum.Bean.Usuario;
import login.*;
import org.ElderPum.Grafico.*;

public class Admin {
    static String Nombre = "admin";
    static String Apellido = "admin";
    static int Edad = 20;
    static int Identificacion = 1234567890;
    static String Rol = "admin";
    static String Nacionalidad = "admin";
    static String User = "admin";
    static String Password = "admin";
    static String Correo = "admin";
    static String newNombre, newApellido, newRol, newNacionalidad, newUser, newPassword, newCorreo;
    Usuario []ubicacionUsuario;
    static EliminarUsuario FormElim;
    static CrearUsuario FormCrear;
    static ModificarUsuario FormMod;
    static VerUsuario Ver;    
    public static Usuario[] ListUsuario;
 
    
    public static void llenarUsuarios(){
        ListUsuario = new Usuario[10];
        ListUsuario[0] = new Usuario("Elder","Pum",19,1,"Administrador","Guatemalteco","epum","123","elderpum@gmail.com");
        ListUsuario[1] = new Usuario("Michael","Orellana",20,2,"Pagador","Guatemalteco","mikel","456","michaelorl@gmail.com");
        ListUsuario[2] = new Usuario("Rony","Echeverria",19,3,"Vendedor","Guatemalteco","ronych","789","ronyecheverria@gmail.com");
    }
    
    public boolean agregarUsuario(Usuario usuario){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario vacio = ListUsuario[i];
            if (vacio == null) {
                ListUsuario[i]=usuario;
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarUsuarioExistente(Usuario usuario){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean eliminarUsuario(String nombreUsuario){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    ListUsuario[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public int obtenerPosicionUsuario(String nombreUsuario){
        int posicion=-1;
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    posicion=i;
                    break;
                }
            }
        }
        return posicion;
    }
    
    public Usuario obtenerUsuario(int posicion){
        return ListUsuario[posicion];
    }
    
    public boolean actualizarUsuario(Usuario nuevoUsuario, int posicion){
        if (nuevoUsuario != null && posicion >-1) {
            ListUsuario[posicion]=nuevoUsuario;
            return true;
        }
        return false;
    }
    
    public boolean iniciarSesion(String nombreUsuario, String contrasenia){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && existente.getContrasenia().equals(contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String obtenerRolUsuario(String nombreUsuario){
        String rol = "";
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    rol = existente.getRol();
                }
            }
        }
        return rol;
    }

    public Usuario[] getListUsuario() {
        return ListUsuario;
    }

    public void setListUsuario(Usuario[] ListUsuario) {
        this.ListUsuario = ListUsuario;
    }
    
    
}
