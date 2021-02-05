package Lógica;
import Gráfica.*;
public class Iniciador {

    public static void main(String[] args) {
        Cuenta_Habiente.llenarHabiente();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
