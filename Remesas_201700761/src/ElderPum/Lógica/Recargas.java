package ElderPum.Lógica;

import java.util.Calendar;

public class Recargas {
    
    public static enum Compañia{CLARO, TIGO, MOVISTAR, TUENTI}
    public static Compañia claro = Compañia.CLARO;
    public static Compañia tigo = Compañia.TIGO;
    public static Compañia movistar = Compañia.MOVISTAR;
    public static Compañia tuenti = Compañia.TUENTI;
    
    String idusuario;
    String paisDestino;
    String telefono;
    String fechaventa;
    Compañia compañia;
    String montorecarga;
    public static Recargas[] ListRecargas = new Recargas[10];
    
    public static boolean agregarRecarga(Recargas recarga){
        for (int i = 0; i < ListRecargas.length; i++) {
            Recargas vacio = ListRecargas[i];
            if (vacio == null) {
                ListRecargas[i]=recarga;
                return true;
            }
        }
        return false;
    }
    
    public Recargas() {
    }

    public Recargas(String idusuario, String paisDestino, String telefono, String fechaventa, Compañia compañia, String montorecarga) {
        this.idusuario = idusuario;
        this.paisDestino = paisDestino;
        this.telefono = telefono;
        this.fechaventa = fechaventa;
        this.compañia = compañia;
        this.montorecarga = montorecarga;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }

    public String getMontorecarga() {
        return montorecarga;
    }

    public void setMontorecarga(String montorecarga) {
        this.montorecarga = montorecarga;
    }

    
}
