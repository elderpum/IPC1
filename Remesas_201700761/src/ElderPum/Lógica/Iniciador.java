package ElderPum.Lógica;

import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
import java.text.ParseException;

public class Iniciador {

    public static void main(String[] args) throws ParseException {
        Usuario.llenarUsuarios();
        Remitente.llenarRemitentes();
        Beneficiario.llenarBeneficiarios();
        Login login = new Login();
        login.setVisible(true);
    }
    
}
