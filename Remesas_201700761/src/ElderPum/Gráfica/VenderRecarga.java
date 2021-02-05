package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;

public class VenderRecarga extends JFrame{
    public JButton vender, cancelar, salir;
    public JLabel lblusuario, lblpais, lbltelefono, lblcompañia, lblfecha, lblmonto;
    public JTextField usuario, pais, fecha, telefono;
    public JComboBox compañia, monto;
    public static Recargas.Compañia claro = Recargas.Compañia.CLARO;
    public static Recargas.Compañia tigo = Recargas.Compañia.TIGO;
    public static Recargas.Compañia movistar = Recargas.Compañia.MOVISTAR;
    public static Recargas.Compañia tuenti = Recargas.Compañia.TUENTI;
    Calendar fechapagar = Calendar.getInstance();
    int año = fechapagar.get(Calendar.DATE);
    int mes = fechapagar.get(Calendar.MONTH);
    int dia = fechapagar.get(Calendar.YEAR);
    int hora = fechapagar.get(Calendar.HOUR_OF_DAY);
    int minuto = fechapagar.get(Calendar.MINUTE);
    int segundo = fechapagar.get(Calendar.SECOND);
    
    String monto1 = "5";
    String monto2 = "10";
    String monto3 = "15";
    String monto4 = "25";
    String monto5 = "50";
    String monto6 = "100";
    
    String getuser, getpais, gettelefono, getfecha, getmonto;
    Recargas.Compañia getcompañia;;
    
    public VenderRecarga(){
        super("VENDER RECARGA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 800, 450, 450);
        this.setLocationRelativeTo(null);
        this.lblusuario = new JLabel("Usuario:");
        this.lblusuario.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblusuario.setBounds(20, 15, 100, 25);
        this.usuario = new JTextField();
        this.usuario.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.usuario.setBounds(200, 15, 200, 25);
        this.usuario.setHorizontalAlignment(SwingConstants.CENTER);
        this.usuario.setEnabled(false);
        this.lblpais = new JLabel("País:");
        this.lblpais.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblpais.setBounds(20, 50, 100, 25);
        this.pais = new JTextField("");
        this.pais.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.pais.setBounds(200, 50, 200, 25);
        this.pais.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblcompañia = new JLabel("Compañia:");
        this.lblcompañia.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblcompañia.setBounds(20, 85, 100, 25);
        this.compañia = new JComboBox();
        this.compañia.addItem(claro);
        this.compañia.addItem(tigo);
        this.compañia.addItem(movistar);
        this.compañia.addItem(tuenti);
        this.compañia.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.compañia.setBounds(200, 85, 200, 25);
        this.lblfecha = new JLabel("Fecha:");
        this.lblfecha.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblfecha.setBounds(20, 135, 150, 25);
        this.fecha = new JTextField(dia + "/" +(mes+1) + "/" + (año-2) + "---" + hora + ":" + minuto + ":" + segundo);
        this.fecha.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.fecha.setBounds(200, 135, 200, 25);
        this.fecha.setHorizontalAlignment(SwingConstants.CENTER);
        this.fecha.setEnabled(false);
        this.lblmonto = new JLabel("Monto:");
        this.lblmonto.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblmonto.setBounds(20, 190, 100, 25);
        this.monto = new JComboBox();
        this.monto.addItem(monto1);
        this.monto.addItem(monto2);
        this.monto.addItem(monto3);
        this.monto.addItem(monto4);
        this.monto.addItem(monto5);
        this.monto.addItem(monto6);
        this.monto.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.monto.setBounds(200, 190, 200, 25);
        this.lbltelefono = new JLabel("Teléfono:");
        this.lbltelefono.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lbltelefono.setBounds(20, 245, 100, 25);
        this.telefono = new JTextField("+502");
        this.telefono.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.telefono.setBounds(200, 245, 200, 25);
        this.telefono.setHorizontalAlignment(SwingConstants.CENTER);
        this.vender = new JButton("Vender");
        this.vender.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.vender.setBounds(20, 275, 150, 45);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.cancelar.setBounds(250, 275, 150, 45);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.salir.setBounds(133, 350, 150, 45);
        
        this.add(lblusuario);
        this.add(usuario);
        this.add(lblpais);
        this.add(pais);
        this.add(lblfecha);
        this.add(fecha);
        this.add(lblcompañia);
        this.add(compañia);
        this.add(lblmonto);
        this.add(monto);
        this.add(lbltelefono);
        this.add(telefono);
        this.add(vender);
        this.add(cancelar);
        this.add(salir);
        this.setLayout(null);
        
         this.cancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            pais.setText("");
            telefono.setText("+502");
        }
        });
        
        this.salir.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             TipoVenta ventas = new TipoVenta();
             ventas.setVisible(true);
             hide();
         }
         });
        
        this.vender.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Recargas recarga;
             getuser = usuario.getText();
             getpais = pais.getText();
             gettelefono = telefono.getText();
             getfecha = fecha.getText();
             getcompañia = (Recargas.Compañia) compañia.getSelectedItem();
             getmonto = monto.getSelectedItem().toString();
             recarga = new Recargas(getuser, getpais, gettelefono, getfecha, getcompañia, getmonto);
             if (Recargas.agregarRecarga(recarga) == true) {
                 JOptionPane.showMessageDialog(null, "Procesando Recarga...");
                 JOptionPane.showMessageDialog(null, "Recarga envíada con éxito. Cerrando pestaña de recargas.");
                 TipoVenta ventas = new TipoVenta();
                 ventas.setVisible(true);
                hide();
             }else if (Recargas.agregarRecarga(recarga) == false) {
                 JOptionPane.showMessageDialog(null, "Procesando Recarga...");
                 JOptionPane.showMessageDialog(null, "Error al conectar con el server. Intentarlo nuevamente.");
             }
         }
         });
    }
}