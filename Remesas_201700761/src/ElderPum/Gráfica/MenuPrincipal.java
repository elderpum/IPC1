package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;

public class MenuPrincipal extends JFrame{
    public JButton logout, ventas, pagos, cancelar, configuracion, registro, contabilidad;
    public JLabel menu;
    Login login = new Login();
    MenuRegistro mregistro = new MenuRegistro();
    Pagos pagar = new Pagos();
    TipoVenta vender = new TipoVenta();
    TipoCancelar cancelacion = new TipoCancelar();
    Contabilidad conta = new Contabilidad();
    public String nombreUsuario;
    
    
    
    public MenuPrincipal(){
         super("MENÚ PRINCIPAL");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(300, 250, 550, 340);
         this.setLocationRelativeTo(null);
         this.menu = new JLabel("Bienvenido al manejo global del sistema.");
         this.menu.setFont(new java.awt.Font("Agency FB", Font.BOLD, 30));
         this.menu.setBounds(80, 25, 800, 100);
         this.logout = new JButton("Cerrar Sesión");
         this.logout.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.logout.setBounds(360, 10, 150, 25);
         this.ventas = new JButton("Ventas");
         this.ventas.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.ventas.setBounds(70, 150, 150, 25);
         this.pagos = new JButton("Pagos");
         this.pagos.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.pagos.setBounds(310, 150, 150, 25);
         this.cancelar = new JButton("Cancelaciones");
         this.cancelar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.cancelar.setBounds(70, 200, 150, 25);
         this.configuracion = new JButton("Configuraciones");
         this.configuracion.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.configuracion.setBounds(310, 200, 150, 25);
         this.registro = new JButton("Registros");
         this.registro.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.registro.setBounds(70, 250, 150, 25);
         this.contabilidad = new JButton("Contabilidad");
         this.contabilidad.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
         this.contabilidad.setBounds(310, 250, 150, 25);
         this.add(this.menu);
         this.add(this.logout);
         this.add(this.ventas);
         this.add(this.pagos);
         this.add(this.cancelar);
         this.add(this.configuracion);
         this.add(this.registro);
         this.add(this.contabilidad);
         this.setLayout(null);
         this.logout.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             login.setVisible(true);
             hide();
         }
         });
         
         this.ventas.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent arg0) {
            vender.setVisible(true);
            hide();
         }
         });
         
         this.pagos.addActionListener(new ActionListener() {
        @Override
         public void actionPerformed(ActionEvent arg0) {
            pagar.setVisible(true);
            hide();
         }
         });
         
         this.cancelar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            cancelacion.setVisible(true);
            hide();
         }
         });
         
         this.configuracion.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            
         }
         });
         
         this.registro.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.admin) {
                 mregistro.setVisible(true);
                 hide();
             }else if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.vendedor) {
                mregistro.setVisible(true);
                hide();
                mregistro.agregarusuario.setEnabled(false);
                mregistro.modusuario.setEnabled(false);
                mregistro.eliminarusuario.setEnabled(false);
             }
         }
         });
         
         this.contabilidad.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
            conta.setVisible(true);
            hide();
         }
         });
    }
}
