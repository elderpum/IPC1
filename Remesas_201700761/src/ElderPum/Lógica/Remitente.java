package ElderPum.Lógica;
import java.util.Calendar;
import java.util.Date;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Remitente {
    String identificadorRem;
    String nombreRem;
    String apellidoRem;
    Date nacimientoRem;
    String nacionalidadRem;
    String direccionRem;
    String telefonoRem;
    String correoRem;
    public static Remitente[] ListRemitente;

    public static void llenarRemitentes() throws ParseException{
        ListRemitente = new Remitente[10];
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("15/09/1980");
        Date e = new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1982");
        Date f = new SimpleDateFormat("dd/MM/yyyy").parse("29/11/1986");
        ListRemitente[0] = new Remitente("1","Manuel","Fuentes",d,"Guatemalteco","3-15, zona 1", "+50245789653", "aux1ipc1@gmail.com");
        ListRemitente[1] = new Remitente("2","Alejandro","Hernández",e,"Guatemalteco","1-17, zona 12", "+50247894201", "aux1ipc2@gmail.com");
        ListRemitente[2] = new Remitente("3","Rodrigo","Bonilla",f,"Guatemalteco","8-17, zona 4", "+50234578129", "rodribon@gmail.com");
    }
    
    public static boolean agregarRemitente(Remitente remitente){
        for (int i = 0; i < ListRemitente.length; i++) {
            Remitente vacio = ListRemitente[i];
            if (vacio == null) {
                ListRemitente[i] = remitente;
                return true;
            }
        }
        return false;
    }
    
     public static int obtenerPosicionRemitente(String nombreRem){
        int posicion=-1;
        for (int i = 0; i < ListRemitente.length; i++) {
            Remitente existente = ListRemitente[i];
            if (existente != null) {
                if (existente.getNombreRem().equalsIgnoreCase(nombreRem)) {
                    posicion=i;
                    break;
                }
            }
        }
        return posicion;
    }
    
    public static Remitente obtenerRemitente(int posicion){
        return ListRemitente[posicion];
    }
    
    public static boolean actualizarRemitente(Remitente nuevoRem, int posicion){
        if (nuevoRem != null && posicion >-1) {
            ListRemitente[posicion] = nuevoRem;
            return true;
        }
        return false;
    }
    
     public static boolean prepararModificacionRemitente(String nombreRem){
        for (int i = 0; i < ListRemitente.length; i++) {
            Remitente existente = ListRemitente[i];
            if (existente != null) {
                if (existente.getNombreRem().equalsIgnoreCase(nombreRem)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Remitente() {
    }

    public Remitente(String identificadorRem, String nombreRem, String apellidoRem, Date nacimientoRem, String nacionalidadRem, String direccionRem, String telefonoRem, String correoRem) {
        this.identificadorRem = identificadorRem;
        this.nombreRem = nombreRem;
        this.apellidoRem = apellidoRem;
        this.nacimientoRem = nacimientoRem;
        this.nacionalidadRem = nacionalidadRem;
        this.direccionRem = direccionRem;
        this.telefonoRem = telefonoRem;
        this.correoRem = correoRem;
    }

    public String getIdentificadorRem() {
        return identificadorRem;
    }

    public void setIdentificadorRem(String identificadorRem) {
        this.identificadorRem = identificadorRem;
    }

    public String getNombreRem() {
        return nombreRem;
    }

    public void setNombreRem(String nombreRem) {
        this.nombreRem = nombreRem;
    }

    public String getApellidoRem() {
        return apellidoRem;
    }

    public void setApellidoRem(String apellidoRem) {
        this.apellidoRem = apellidoRem;
    }

    public Date getNacimientoRem() {
        return nacimientoRem;
    }

    public void setNacimientoRem(Date nacimientoRem) {
        this.nacimientoRem = nacimientoRem;
    }

    public String getNacionalidadRem() {
        return nacionalidadRem;
    }

    public void setNacionalidadRem(String nacionalidadRem) {
        this.nacionalidadRem = nacionalidadRem;
    }

    public String getDireccionRem() {
        return direccionRem;
    }

    public void setDireccionRem(String direccionRem) {
        this.direccionRem = direccionRem;
    }

    public String getTelefonoRem() {
        return telefonoRem;
    }

    public void setTelefonoRem(String telefonoRem) {
        this.telefonoRem = telefonoRem;
    }

    public String getCorreoRem() {
        return correoRem;
    }

    public void setCorreoRem(String correoRem) {
        this.correoRem = correoRem;
    }
    
    
}
