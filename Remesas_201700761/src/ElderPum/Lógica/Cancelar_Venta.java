package ElderPum.Lógica;

import java.util.Calendar;

public class Cancelar_Venta {
    String noremesa;
    String fechacancelar;
    String nombreuser;
    String motivocancelar;
    public static Cancelar_Venta[] ListCancelarVenta = new Cancelar_Venta[10];

    public static boolean agregarCancelarVenta(Cancelar_Venta cancelarventa){
        for (int i = 0; i < ListCancelarVenta.length; i++) {
            Cancelar_Venta vacio = ListCancelarVenta[i];
            if (vacio == null) {
                ListCancelarVenta[i] = cancelarventa;
                return true;
            }
        }
        return false;
    }
    
    public Cancelar_Venta() {
    }

    public Cancelar_Venta(String noremesa, String fechacancelar, String nombreuser, String motivocancelar) {
        this.noremesa = noremesa;
        this.fechacancelar = fechacancelar;
        this.nombreuser = nombreuser;
        this.motivocancelar = motivocancelar;
    }

    public String getNoremesa() {
        return noremesa;
    }

    public void setNoremesa(String noremesa) {
        this.noremesa = noremesa;
    }

    public String getFechacancelar() {
        return fechacancelar;
    }

    public void setFechacancelar(String fechacancelar) {
        this.fechacancelar = fechacancelar;
    }

    public String getNombreuser() {
        return nombreuser;
    }

    public void setNombreuser(String nombreuser) {
        this.nombreuser = nombreuser;
    }

    public String getMotivocancelar() {
        return motivocancelar;
    }

    public void setMotivocancelar(String motivocancelar) {
        this.motivocancelar = motivocancelar;
    }
}
