package login;
import org.ElderPum.Bean.Admin;
import org.ElderPum.Bean.Usuario;
import org.ElderPum.Grafico.*;

public class MainLogin {
    public static login InicioSesion;
    static PantallaAdmin PantallaAdmin;
    static PantallaVendedor PantallaVendedor;
    static PantallaPagador PantallaPagador;
    Usuario ListaActual[];
    
    public static void main(String[] args) {
        Admin.llenarUsuarios();//esto inicializa una lista para guarda los usuarios
        inicio();
    }

    public static void logoutAdmin(){
    //InicioSesion.
    //Principal.repaint();        
    }
    public static void logoutUsuario(){
    //Principal.remove(PantallaUsuario);
    //Principal.addComponent();
    //Principal.repaint();      
    }
    public static void inicio(){
    InicioSesion = new login("Inicio de Sesión");
    }
    public static void verificar(){
    String UserOrID;
    char [] CharPass;
    String Password;
    UserOrID= InicioSesion.getUserOrID();
    CharPass=InicioSesion.getPassword();
    Password = new String(CharPass);
    //Super if
if(UserOrID.equals("")|Password.equals("")){    
    InicioSesion.DialogoEspacioBlanco();
}else{
    if(UserOrID.equals("admin")&&Password.equals("admin")){
    InicioSesion.setVisible(false);
    //InicioSesion.removeAlll();
    //PantallaAdmin= new VentanaAdmin();
    //Principal.add(PantallaAdmin);
    //Principal.repaint();
    }else{

        int i=0;
        while(Admin.ListUsuario[i]!=null){
            
            if(UserOrID.equals(Admin.ListUsuario[i].getRol())||UserOrID.equals(Admin.ListUsuario[i].getNombreUsuario())){
                if(Password.equals(Admin.ListUsuario[i].getContrasenia())){
                //Redirección a la ventana de Usuario
                InicioSesion.setVisible(false);
 
                    break;
                }else{
                //Dialogo passsword incorrecta
                InicioSesion.DialogoNoCoincideContraseña();
                break;
                }
            }  else if((UserOrID.equals(Admin.ListUsuario[i].getRol())||UserOrID.equals(Admin.ListUsuario[i].getNombreUsuario())==false)&&Admin.ListUsuario[i+1]==null){
                //Dialogo usuario no existe
                InicioSesion.DialogoNoCoincideUser(); break; 
            } 
        i++;    
        }
        if(Admin.ListUsuario[0]==null){
            InicioSesion.DialogoNoCoincideUser();
        }
    }


}  
    }
    public static void removeJPAdmin(){
    //Principal.remove(PantallaAdmin);
    }
    public static void addJPadmin(){
    //Principal.add(PantallaAdmin);
    //Principal.repaint();
    }
}
