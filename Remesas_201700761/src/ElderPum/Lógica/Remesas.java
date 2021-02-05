package ElderPum.Lógica;

public class Remesas {
    String idremesa;
    String idremitente;
    String idbeneficiario;
    String paisdestino;
    String fechaventa;
    String montoorigen;
    public static Remesas[] ListRemesas = new Remesas[10];

    public static boolean agregarRemesa(Remesas remesa){
        for (int i = 0; i < ListRemesas.length; i++) {
            Remesas vacio = ListRemesas[i];
            if (vacio == null) {
                ListRemesas[i] = remesa;
                return true;
            }
        }
        return false;
    }
    
    public Remesas() {
    }

    public Remesas(String idremesa, String idremitente, String idbeneficiario, String paisdestino, String fechaventa, String montoorigen) {
        this.idremesa = idremesa;
        this.idremitente = idremitente;
        this.idbeneficiario = idbeneficiario;
        this.paisdestino = paisdestino;
        this.fechaventa = fechaventa;
        this.montoorigen = montoorigen;
    }

    public String getIdremesa() {
        return idremesa;
    }

    public void setIdremesa(String idremesa) {
        this.idremesa = idremesa;
    }

    public String getIdremitente() {
        return idremitente;
    }

    public void setIdremitente(String idremitente) {
        this.idremitente = idremitente;
    }

    public String getIdbeneficiario() {
        return idbeneficiario;
    }

    public void setIdbeneficiario(String idbeneficiario) {
        this.idbeneficiario = idbeneficiario;
    }

    public String getPaisdestino() {
        return paisdestino;
    }

    public void setPaisdestino(String paisdestino) {
        this.paisdestino = paisdestino;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getMontoorigen() {
        return montoorigen;
    }

    public void setMontoorigen(String montoorigen) {
        this.montoorigen = montoorigen;
    }

    public static Remesas[] getListRemesas() {
        return ListRemesas;
    }

    public static void setListRemesas(Remesas[] ListRemesas) {
        Remesas.ListRemesas = ListRemesas;
    }

    
}
