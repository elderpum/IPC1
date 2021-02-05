package ElderPum.Gráfica;
import ElderPum.Lógica.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
    public JLabel usuario, password;
    public JTextField user;
    public  JPasswordField pass;
    public JButton ingresar, cancelar;
    public static String nombreuser, contrasenia;
    public MenuRegistro mregistro = new MenuRegistro();
    
    public Login(){
        super("LOGIN");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 250, 325, 300);
        this.usuario = new JLabel("Usuario:");
        this.usuario.setFont(new java.awt.Font("Agency FB", Font.BOLD, 25));
        this.usuario.setBounds(20, 45, 100, 25);
        this.password = new JLabel("Contraseña:");
        this.password.setFont(new java.awt.Font("Agency FB", Font.BOLD, 25));
        this.password.setBounds(20, 126, 150, 25);
        this.user = new JTextField("");
        this.user.setFont(new java.awt.Font("Agency FB", Font.BOLD, 14));
        this.user.setBounds(130, 50, 150, 25);
        this.user.setHorizontalAlignment(SwingConstants.CENTER);
        this.pass = new JPasswordField("");
        this.pass.setFont(new java.awt.Font("Agency FB", Font.BOLD, 14));
        this.pass.setBounds(130, 126, 150, 25);
        this.pass.setHorizontalAlignment(SwingConstants.CENTER);
        this.ingresar = new JButton("Ingresar");
        this.ingresar.setFont(new java.awt.Font("Agency FB", Font.BOLD, 14));
        this.ingresar.setBounds(30, 200, 100, 25);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("Agency FB", Font.BOLD, 14));
        this.cancelar.setBounds(170, 200, 100, 25);
        this.add(this.usuario);
        this.add(this.password);
        this.add(this.user);
        this.add(this.pass);
        this.add(this.ingresar);
        this.add(this.cancelar);
        this.setLayout(null);
        this.ingresar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            nombreuser = user.getText();
            contrasenia = pass.getText();
            if (Usuario.iniciarSesion(nombreuser, contrasenia) == true && Usuario.obtenerRolUsuario(nombreuser) == Usuario.admin) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
            }else if (Usuario.iniciarSesion(nombreuser, contrasenia) == true && Usuario.obtenerRolUsuario(nombreuser) == Usuario.pagador) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
                menu.cancelar.setEnabled(false);
                menu.registro.setEnabled(false);
                menu.configuracion.setEnabled(false);
                menu.ventas.setEnabled(false);
                menu.contabilidad.setEnabled(false);
            }else if (Usuario.iniciarSesion(nombreuser, contrasenia) == true && Usuario.obtenerRolUsuario(nombreuser) == Usuario.vendedor) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
                menu.pagos.setEnabled(false);
                menu.configuracion.setEnabled(false);
                menu.contabilidad.setEnabled(false); 
            }else if (Usuario.iniciarSesion(nombreuser, contrasenia) == false) {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña inválidos. Volver a intentarlo.");
                user.setText("");
                pass.setText("");
            }
        }
        });
        
        this.cancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            user.setText("");
            pass.setText("");
        }
        });
    }
}