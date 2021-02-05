package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;

public class VenderRemesa extends JFrame{
    public JLabel lblremitente, lblbeneficiario, lblpais, lblfecha, lblmonto, lblid;
    public JTextField remitente, beneficiario, pais, fecha, monto, id;
    public JButton vender, cancelar, salir;
    Calendar fechapagar = Calendar.getInstance();
    int año = fechapagar.get(Calendar.DATE);
    int mes = fechapagar.get(Calendar.MONTH);
    int dia = fechapagar.get(Calendar.YEAR);
    int hora = fechapagar.get(Calendar.HOUR_OF_DAY);
    int minuto = fechapagar.get(Calendar.MINUTE);
    int segundo = fechapagar.get(Calendar.SECOND);
    String getremitente, getbeneficiario, getpais, getfecha, getmonto, getid;
    int numero = (int)(Math.random()*(500+1)+1);
    
    public VenderRemesa(){
        super("VENDER REMESA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 800, 450, 450);
        this.setLocationRelativeTo(null);
        this.lblremitente = new JLabel("ID Remitente:");
        this.lblremitente.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblremitente.setBounds(20, 15, 150, 25);
        this.remitente  = new JTextField("");
        this.remitente.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.remitente.setBounds(200, 15, 200, 25);
        this.remitente.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblbeneficiario = new JLabel("ID Beneficiario:");
        this.lblbeneficiario.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblbeneficiario.setBounds(20, 50, 150, 25);
        this.beneficiario = new JTextField("");
        this.beneficiario.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.beneficiario.setBounds(200, 50, 200, 25);
        this.beneficiario.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblpais = new JLabel("País:");
        this.lblpais.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblpais.setBounds(20, 85, 100, 25);
        this.pais = new JTextField("");
        this.pais.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.pais.setBounds(200, 85, 200, 25);
        this.pais.setHorizontalAlignment(SwingConstants.CENTER);
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
        this.monto = new JTextField("");
        this.monto.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.monto.setBounds(200, 190, 200, 25);
        this.monto.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblid = new JLabel("ID Remesa:");
        this.lblid.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblid.setBounds(20, 245, 150, 25);
        this.id = new JTextField();
        this.id.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.id.setBounds(200, 245, 200, 25);
        this.id.setEnabled(false);
        this.id.setHorizontalAlignment(SwingConstants.CENTER);
        this.vender = new JButton("Vender");
        this.vender.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.vender.setBounds(20, 275, 150, 45);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.cancelar.setBounds(250, 275, 150, 45);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.salir.setBounds(133, 350, 150, 45);
        
        this.add(lblremitente);
        this.add(remitente);
        this.add(lblbeneficiario);
        this.add(beneficiario);
        this.add(lblpais);
        this.add(pais);
        this.add(lblfecha);
        this.add(fecha);
        this.add(lblmonto);
        this.add(monto);
        this.add(lblid);
        this.add(id);
        this.add(vender);
        this.add(cancelar);
        this.add(salir);
        this.setLayout(null);
        
        this.cancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            pais.setText("");
            remitente.setText("");
            beneficiario.setText("");
            monto.setText("");
            id.setText("Boleta No."+numero);
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
             Remesas remesa;
             getid = id.getText();
             getremitente = remitente.getText();
             getbeneficiario = beneficiario.getText();
             getpais = pais.getText();
             getfecha = fecha.getText();
             getmonto = monto.getText();
             remesa = new Remesas(getid, getremitente, getbeneficiario, getpais, getfecha, getmonto);
             if (Remesas.agregarRemesa(remesa) == true) {
                 JOptionPane.showMessageDialog(null, "Procesando Remesa...");
                 JOptionPane.showMessageDialog(null, "Remesa vendida con éxito. Saliendo al menú de ventas.");
                 TipoVenta ventas = new TipoVenta();
                 ventas.setVisible(true);
                 hide();
             }else if (remitente.getText().isEmpty() && beneficiario.getText().isEmpty() && pais.getText().isEmpty() && monto.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Procesando Remesa...");
                 JOptionPane.showMessageDialog(null, "Fallo al vender la Remesa. Volviendo al menú de ventas debido a fallos.");
                 TipoVenta ventas = new TipoVenta();
                 ventas.setVisible(true);
                 hide();
             }
         }
         });
    }
}
