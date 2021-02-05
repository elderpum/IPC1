package ElderPum.Lógica;

import javax.swing.JOptionPane;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;

public class Usuario {
    public static enum Rol{ADMINISTRADOR, VENDEDOR, PAGADOR;}
    public static Rol admin = Rol.ADMINISTRADOR;
    public static Rol vendedor = Rol.VENDEDOR;
    public static Rol pagador = Rol.PAGADOR;
    String nombre;
    String apellido;
    int edad;
    String identificacion;
    Rol rol;
    String nacionalidad;
    String nombreUsuario;
    String password;
    String correo;
    public static Usuario[] ListUsuario;
    
    public static void llenarUsuarios(){
        ListUsuario = new Usuario[10];
        ListUsuario[0] = new Usuario("Elder","Pum",19,"1",admin,"Guatemalteco","epum","123","elderpum@gmail.com");
        ListUsuario[1] = new Usuario("Edwin","Pum",28,"2",vendedor,"Guatemalteco","winpum","456","winpum@gmail.com");
        ListUsuario[2] = new Usuario("Ana","Rojas",53,"3",pagador,"Guatemalteco","arojas","789","anarojas500@gmail.com");
    }
     
      public static boolean agregarUsuario(Usuario usuario){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario vacio = ListUsuario[i];
            if (vacio == null) {
                ListUsuario[i]=usuario;
                return true;
            }
        }
        return false;
    }
    
    public static boolean verificarUsuarioExistente(Usuario usuario){
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
    
    public static boolean eliminarUsuario(String nombreUsuario){
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
    
    public static int obtenerPosicionUsuario(String nombreUsuario){
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
    
    public static Usuario obtenerUsuario(int posicion){
        return ListUsuario[posicion];
    }
    
    public static boolean actualizarUsuario(Usuario nuevoUsuario, int posicion){
        if (nuevoUsuario != null && posicion >-1) {
            ListUsuario[posicion]=nuevoUsuario;
            return true;
        }
        return false;
    }

    public static boolean iniciarSesion(String nombreUsuario, String contrasenia){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && existente.getPassword().equals(contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static Rol obtenerRolUsuario(String nombreUsuario){
        Rol obtrol = null;
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    obtrol = existente.getRol();
                }
            }
        }
        return obtrol;
    }
    
    public static boolean prepararModificacionUsuario(String nombreUsuario){
        for (int i = 0; i < ListUsuario.length; i++) {
            Usuario existente = ListUsuario[i];
            if (existente != null) {
                if (existente.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, String identificacion, Rol rol, String nacionalidad, String nombreUsuario, String password, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.rol = rol;
        this.nacionalidad = nacionalidad;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
