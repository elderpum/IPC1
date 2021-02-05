package ElderPum.Lógica;

import java.util.Calendar;

public class Cancelar_Pago {
    String noremesa;
    String fechacancelar;
    String nombreuser;
    String motivo;
    public static Cancelar_Pago[] ListCancelarPago = new Cancelar_Pago[10];

    public static boolean agregarCancelarPago(Cancelar_Pago cancelarpago){
        for (int i = 0; i < ListCancelarPago.length; i++) {
            Cancelar_Pago vacio = ListCancelarPago[i];
            if (vacio == null) {
                ListCancelarPago[i] = cancelarpago;
                return true;
            }
        }
        return false;
    }
    
    public Cancelar_Pago() {
    }

    public Cancelar_Pago(String noremesa, String fechacancelar, String nombreuser, String motivo) {
        this.noremesa = noremesa;
        this.fechacancelar = fechacancelar;
        this.nombreuser = nombreuser;
        this.motivo = motivo;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
