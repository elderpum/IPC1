package ElderPum.Lógica;

import java.util.Calendar;

public class Pago {
    int idventa;
    String fechapago;
    String user;
    String cambio;
    int monto;
    public static Pago[] ListPagos = new Pago[10];
    
    public static boolean agregarPago(Pago pago){
        for (int i = 0; i < ListPagos.length; i++) {
            Pago vacio = ListPagos[i];
            if (vacio == null) {
                ListPagos[i]=pago;
                return true;
            }
        }
        return false;
    }
    
    public Pago() {
    }

    public Pago(int idventa, String fechapago, String user, String cambio, int monto) {
        this.idventa = idventa;
        this.fechapago = fechapago;
        this.user = user;
        this.cambio = cambio;
        this.monto = monto;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public static Pago[] getListPagos() {
        return ListPagos;
    }

    public static void setListPagos(Pago[] ListPagos) {
        Pago.ListPagos = ListPagos;
    }

    
}
