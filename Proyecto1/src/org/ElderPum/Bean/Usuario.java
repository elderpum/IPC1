
package org.ElderPum.Bean;

public class Usuario {
    String nombre;
    String apellido;
    int edad;
    int identificación;
    String rol;
    String nacionalidad;
    String nombreUsuario;
    String contrasenia;
    String correo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, int identificación, String rol, String nacionalidad, String nombreUsuario, String contrasenia, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificación = identificación;
        this.rol = rol;
        this.nacionalidad=nacionalidad;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
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

    public int getIdentificación() {
        return identificación;
    }

    public void setIdentificación(int identificación) {
        this.identificación = identificación;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}