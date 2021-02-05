package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Contabilidad extends JFrame{
    public JButton salir;
    public JList lista;
    public JComboBox mostrar;
    public DefaultListModel modelo = new DefaultListModel();
    
    public Contabilidad(){
        super("CONTABILIDAD");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 440, 500, 500);
        this.mostrar = new JComboBox();
        this.mostrar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.mostrar.setBounds(20, 20, 200, 35);
        this.mostrar.addItem("Remesas Vendidas");
        this.mostrar.addItem("Remesas Pagadas");
        this.mostrar.addItem("Remesas Canceladas");
        this.mostrar.addItem("Pagos Cancelados");
        this.mostrar.addItem("Recargas de Teléfonos");
        this.mostrar.addItem("Remitentes");
        this.mostrar.addItem("Beneficiarios");
        this.lista = new JList();
        this.lista.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lista.setBounds(20, 60, 600, 600);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.salir.setBounds(75, 320, 100, 35);
        
        this.add(this.mostrar);
        this.add(this.lista);
        this.add(this.salir);
        this.setLayout(null);
        this.salir.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             MenuPrincipal menu = new MenuPrincipal();
             menu.setVisible(true);
             hide();
         }
         });
        
        this.mostrar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             String item = (String) mostrar.getSelectedItem();
             if ("Remesas Vendidas".equals(item)) {
                 for (int i = 0; i < Remesas.ListRemesas.length; i++) {
                     modelo.addElement(Remitente.ListRemitente[i]);
                 }
                 lista.setModel(modelo);
             }else if ("Remesas Pagadas".equals(item)) {
                 for (int i = 0; i < Pago.ListPagos.length; i++) {
                     modelo.addElement(Pago.ListPagos[i]);
                 }
                 lista = new JList(modelo);
             }else if ("Remesas Canceladas".equals(item)) {
                 for (int i = 0; i < Cancelar_Venta.ListCancelarVenta.length; i++) {
                     modelo.addElement(Cancelar_Venta.ListCancelarVenta[i]);
                 }
                 lista.setModel(modelo);
             }else if ("Pagos Cancelados".equals(item)) {
                 for (int i = 0; i < Cancelar_Pago.ListCancelarPago.length; i++) {
                     modelo.addElement(Cancelar_Pago.ListCancelarPago[i]);
                 }
                 lista = new JList(modelo);
             }else if ("Recargas de Teléfonos".equals(item)) {
                 for (int i = 0; i < Recargas.ListRecargas.length; i++) {
                     modelo.addElement(Recargas.ListRecargas[i]);
                 }
                 lista.setModel(modelo);
             }else if ("Remitentes".equals(item)) {
                 for (int i = 0; i < Remitente.ListRemitente.length; i++) {
                     modelo.addElement(Remitente.ListRemitente[i]);
                 }
                 lista.setModel(modelo);
             }else if ("Beneficiarios".equals(item)) {
                 for (int i = 0; i < Beneficiario.ListBeneficiario.length; i++) {
                     String beneficiario = Beneficiario.ListBeneficiario[i].getNombreBen();
                     modelo.addElement(beneficiario);
                 }
                 lista.setModel(modelo);
             }else {
                 JOptionPane.showMessageDialog(null, "Error crítico. Volver a intentarlo.");
             }
         }
         });
    }
}
