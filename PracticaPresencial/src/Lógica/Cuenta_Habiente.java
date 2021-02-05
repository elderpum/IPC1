package Lógica;

public class Cuenta_Habiente {
    String nombre;
    String apellido;
    String fecha;
    String dpi;
    String procedencia;
    int monto;
    String telefono;
    String contrasenia;
    String nocuenta;
    public static Cuenta_Habiente[] ListHabientes;

    public static void llenarHabiente(){
        ListHabientes = new Cuenta_Habiente[10];
        ListHabientes[0] = new Cuenta_Habiente("Elder","Pum","2/9/1999","2823918350101","Ciudad de Guatemala",2000,"35179068","123","123456");
        ListHabientes[1] = new Cuenta_Habiente("Edwin","Pum","12/12/1989","34256716849","Ciudad de Guatemala",5000,"50164211","321","654321");
    }
    

    public static boolean agregarHabiente(Cuenta_Habiente habiente){
        for (int i = 0; i < ListHabientes.length; i++) {
            Cuenta_Habiente vacio = ListHabientes[i];
            if (vacio == null) {
                ListHabientes[i]= habiente;
                return true;
            }
        }
        return false;
    }
    
    public static boolean iniciarSesion(String noCuenta, String contrasenia){
        for (int i = 0; i < ListHabientes.length; i++) {
            Cuenta_Habiente existente = ListHabientes[i];
            if (existente != null) {
                if (existente.getNocuenta().equalsIgnoreCase(noCuenta) && existente.getContrasenia().equals(contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Cuenta_Habiente() {
    }

    public Cuenta_Habiente(String nombre, String apellido, String fecha, String dpi, String procedencia, int monto, String telefono, String contrasenia, String nocuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.dpi = dpi;
        this.procedencia = procedencia;
        this.monto = monto;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
        this.nocuenta = nocuenta;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNocuenta() {
        return nocuenta;
    }

    public void setNocuenta(String nocuenta) {
        this.nocuenta = nocuenta;
    }
    
    
}
