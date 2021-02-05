package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
public class MenuRegistro extends JFrame{
    public JButton agregarusuario,modusuario,eliminarusuario, agregarremitente, modremitente, agregarbeneficiario, modbeneficiario, salir;
    public JLabel menuregistro;
    Usuario usuario = new Usuario();
    AgregarUsuario agregaruser = new AgregarUsuario();
    EliminarUsuario eliminaruser = new EliminarUsuario();
    AgregarRemitente agregarrem = new AgregarRemitente();
    AgregarBeneficiario agregarbe = new AgregarBeneficiario();
    BuscarUsuarioParaMod buscaruser = new BuscarUsuarioParaMod();
    BuscarRemitenteParaMod buscarrem = new BuscarRemitenteParaMod();
    BuscarBeneficiarioParaMod buscarben = new BuscarBeneficiarioParaMod();
    
    public MenuRegistro(){
        super("MENÚ DE REGISTROS");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(300, 250, 750, 500);
         this.setLocationRelativeTo(null);
         this.menuregistro = new JLabel("Menú Secundario de Registros Varios");
         this.menuregistro.setFont(new java.awt.Font("Monospaced", Font.BOLD, 30));
         this.menuregistro.setBounds(60, 25, 800, 100);
         this.agregarusuario = new JButton("Agregar Usuario");
         this.agregarusuario.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.agregarusuario.setBounds(30, 150, 200, 50);
         this.eliminarusuario = new JButton("Eliminar Usuario");
         this.eliminarusuario.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.eliminarusuario.setBounds(30, 250, 200, 50);
         this.modusuario = new JButton("Modificar Usuario");
         this.modusuario.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.modusuario.setBounds(30, 350, 200, 50);
         this.agregarremitente = new JButton("Agregar Remitente");
         this.agregarremitente.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.agregarremitente.setBounds(275, 150, 200, 50);
         this.modremitente = new JButton("Modificar Remitente");
         this.modremitente.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.modremitente.setBounds(275, 250, 200, 50);
         this.agregarbeneficiario = new JButton("Agregar Beneficiario");
         this.agregarbeneficiario.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.agregarbeneficiario.setBounds(510, 150, 200, 50);
         this.modbeneficiario = new JButton("Modificar Beneficiario");
         this.modbeneficiario.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.modbeneficiario.setBounds(510, 250, 200, 50);
         this.salir = new JButton("Salir");
         this.salir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.salir.setBounds(525, 15, 150, 25);
         this.add(this.menuregistro);
         this.add(this.agregarusuario);
         this.add(this.eliminarusuario);
         this.add(this.modusuario);
         this.add(this.agregarremitente);
         this.add(this.modremitente);
         this.add(this.agregarbeneficiario);
         this.add(this.modbeneficiario);
         this.add(this.salir);
         this.setLayout(null);
         this.salir.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.vendedor) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
                menu.configuracion.setEnabled(false);
                menu.contabilidad.setEnabled(false);
                menu.pagos.setEnabled(false);
             }else if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.admin) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
             }
         }
         });
         
         this.agregarusuario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             agregaruser.setVisible(true);
             hide();
             JOptionPane.showMessageDialog(null, "Por el momento, solamente se permiten correos con Google debido a derechos de protección.");
         }
         });
         
         this.eliminarusuario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             eliminaruser.setVisible(true);
             hide();
         }
         });
         
         this.modusuario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             buscaruser.setVisible(true);
             hide();
         }
         });
         
          this.agregarremitente.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             agregarrem.setVisible(true);
             hide();
         }
         });
          
         this.modremitente.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             buscarrem.setVisible(true);
             hide();
         }
         });
         
         this.agregarbeneficiario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             agregarbe.setVisible(true);
             hide();
         }
         });
         
         this.modbeneficiario.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             buscarben.setVisible(true);
             hide();
         }
         });
    }
}
