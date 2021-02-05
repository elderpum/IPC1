package ElderPum.Lógica;
import java.util.Calendar;
import java.util.Date;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Beneficiario {
    String identificadorBen;
    String nombreBen;
    String apellidoBen;
    Date nacimientoBen;
    String nacionalidadBen;
    String direccionBen;
    String telefonoBen;
    String correoBen;
    public static Beneficiario[] ListBeneficiario;
    
     public static void llenarBeneficiarios() throws ParseException{
        ListBeneficiario = new Beneficiario[10];
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("15/04/1997");
        Date e = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1998");
        Date f = new SimpleDateFormat("dd/MM/yyyy").parse("07/07/1980");
        ListBeneficiario[0] = new Beneficiario("1","Rony","Echeverria",d,"Guatemalteco","8-14, zona 3", "+50265879120", "ronyeche@gmail.com");
        ListBeneficiario[1] = new Beneficiario("2","Michael","Orellana",e,"Guatemalteco","9-15, zona 18","+50254210479","michaelorel@gmail.com");
        ListBeneficiario[2] = new Beneficiario("3","Miguel","Sagastume",f,"Salvadoreño","7-51, zona 21","+50254789210","miguesagas@gmail.com");
    }
     
     public static boolean agregarBeneficiario(Beneficiario beneficiario){
        for (int i = 0; i < ListBeneficiario.length; i++) {
            Beneficiario vacio = ListBeneficiario[i];
            if (vacio == null) {
                ListBeneficiario[i] = beneficiario;
                return true;
            }
        }
        return false;
    }
     
     public static int obtenerPosicionBeneficiario(String nombreBen){
        int posicion=-1;
        for (int i = 0; i < ListBeneficiario.length; i++) {
            Beneficiario existente = ListBeneficiario[i];
            if (existente != null) {
                if (existente.getNombreBen().equalsIgnoreCase(nombreBen)) {
                    posicion=i;
                    break;
                }
            }
        }
        return posicion;
    }
    
    public static Beneficiario obtenerBeneficiario(int posicion){
        return ListBeneficiario[posicion];
    }
    
    public static boolean actualizarBeneficiario(Beneficiario nuevoBen, int posicion){
        if (nuevoBen != null && posicion >-1) {
            ListBeneficiario[posicion] = nuevoBen;
            return true;
        }
        return false;
    }
    
     public static boolean prepararModificacionBeneficiario(String nombreBen){
        for (int i = 0; i < ListBeneficiario.length; i++) {
            Beneficiario existente = ListBeneficiario[i];
            if (existente != null) {
                if (existente.getNombreBen().equalsIgnoreCase(nombreBen)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Beneficiario() {
    }

    public Beneficiario(String identificadorBen, String nombreBen, String apellidoBen, Date nacimientoBen, String nacionalidadBen, String direccionBen, String telefonoBen, String correoBen) {
        this.identificadorBen = identificadorBen;
        this.nombreBen = nombreBen;
        this.apellidoBen = apellidoBen;
        this.nacimientoBen = nacimientoBen;
        this.nacionalidadBen = nacionalidadBen;
        this.direccionBen = direccionBen;
        this.telefonoBen = telefonoBen;
        this.correoBen = correoBen;
    }

    public String getIdentificadorBen() {
        return identificadorBen;
    }

    public void setIdentificadorBen(String identificadorBen) {
        this.identificadorBen = identificadorBen;
    }

    public String getNombreBen() {
        return nombreBen;
    }

    public void setNombreBen(String nombreBen) {
        this.nombreBen = nombreBen;
    }

    public String getApellidoBen() {
        return apellidoBen;
    }

    public void setApellidoBen(String apellidoBen) {
        this.apellidoBen = apellidoBen;
    }

    public Date getNacimientoBen() {
        return nacimientoBen;
    }

    public void setNacimientoBen(Date nacimientoBen) {
        this.nacimientoBen = nacimientoBen;
    }

    public String getNacionalidadBen() {
        return nacionalidadBen;
    }

    public void setNacionalidadBen(String nacionalidadBen) {
        this.nacionalidadBen = nacionalidadBen;
    }

    public String getDireccionBen() {
        return direccionBen;
    }

    public void setDireccionBen(String direccionBen) {
        this.direccionBen = direccionBen;
    }

    public String getTelefonoBen() {
        return telefonoBen;
    }

    public void setTelefonoBen(String telefonoBen) {
        this.telefonoBen = telefonoBen;
    }

    public String getCorreoBen() {
        return correoBen;
    }

    public void setCorreoBen(String correoBen) {
        this.correoBen = correoBen;
    }

    public static Beneficiario[] getListBeneficiario() {
        return ListBeneficiario;
    }

    public static void setListBeneficiario(Beneficiario[] ListBeneficiario) {
        Beneficiario.ListBeneficiario = ListBeneficiario;
    }
     
    
}
