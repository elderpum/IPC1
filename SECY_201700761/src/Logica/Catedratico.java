package Logica;

public class Catedratico {
    private String registroCat;
    private String nombre;
    private String direccion;
    private String correo;
    private String contrasenia;
    
    //enlaces
    private Catedratico siguiente;

    public Catedratico() {
    }

    public Catedratico(String registroCat, String nombre, String direccion, String correo, String contrasenia) {
        this.registroCat = registroCat;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.siguiente = null;
    }

    public String getRegistroCat() {
        return registroCat;
    }

    public void setRegistroCat(String registroCat) {
        this.registroCat = registroCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Catedratico getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Catedratico siguiente) {
        this.siguiente = siguiente;
    }
}
