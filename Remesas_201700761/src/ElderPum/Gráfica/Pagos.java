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

public class Pagos extends JFrame{
    public JTextField id, fechapago, usuario, cambio, montodestino;
    public JLabel lblid, lblfecha, lblusuario, lblcambio, lblmonto;
    public JButton pagar, cancelar, salir;
    String usuariopagar, cambiopagar, fechapagartext;
    int montopagar, idremesa;
    Calendar fechapagar = Calendar.getInstance();
    int año = fechapagar.get(Calendar.DATE);
    int mes = fechapagar.get(Calendar.MONTH);
    int dia = fechapagar.get(Calendar.YEAR);
    int hora = fechapagar.get(Calendar.HOUR_OF_DAY);
    int minuto = fechapagar.get(Calendar.MINUTE);
    int segundo = fechapagar.get(Calendar.SECOND);
    
    public Pagos(){
        super("VENTANA DE PAGOS");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 250, 430, 325);
        this.lblfecha = new JLabel("Fecha Pago:");
        this.lblfecha.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblfecha.setBounds(20, 20, 150, 25);
        this.fechapago = new JTextField(dia + "/" +(mes +1) + "/" + (año-2) + "---" + hora + ":" + minuto + ":" + segundo);
        this.fechapago.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.fechapago.setBounds(200, 20, 300, 25);
        this.fechapago.setHorizontalAlignment(SwingConstants.CENTER);
        this.fechapago.setEnabled(false);
        this.lblusuario = new JLabel("Usuario:");
        this.lblusuario.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblusuario.setBounds(20, 50, 150, 25);
        this.usuario = new JTextField("");
        this.usuario.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.usuario.setBounds(200, 50, 200, 25);
        this.usuario.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblcambio = new JLabel("Tipo Cambio:");
        this.lblcambio.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblcambio.setBounds(20, 80, 150, 25);
        this.cambio = new JTextField("");
        this.cambio.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.cambio.setBounds(200, 80, 200, 25);
        this.cambio.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblmonto = new JLabel("Monto Destino:");
        this.lblmonto.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblmonto.setBounds(20, 110, 150, 25);
        this.montodestino = new JTextField("");
        this.montodestino.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.montodestino.setBounds(200, 110, 200, 25);
        this.montodestino.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblid = new JLabel("ID Remesa:");
        this.lblid.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblid.setBounds(20, 140, 150, 25 );
        this.id = new JTextField();
        this.id.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.id.setBounds(200, 140, 200, 25);
        this.id.setHorizontalAlignment(SwingConstants.CENTER);
        this.pagar = new JButton("Pagar");
        this.pagar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.pagar.setBounds(20, 160, 120, 30);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.cancelar.setBounds(250, 160, 120, 30);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.salir.setBounds(133, 210, 120, 30);
        
        this.add(this.lblfecha);
        this.add(this.fechapago);
        this.add(this.lblusuario);
        this.add(this.usuario);
        this.add(this.lblcambio);
        this.add(this.cambio);
        this.add(this.lblmonto);
        this.add(this.montodestino);
        this.add(this.lblid);
        this.add(this.id);
        this.add(this.pagar);
        this.add(this.cancelar);
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
        
        this.cancelar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
                 fechapago.setText("");
                 usuario.setText("");
                 cambio.setText("");
                 montodestino.setText("");
                 id.setText("");
         }
         });
        
        this.pagar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Pago pago;
             idremesa = Integer.parseInt(id.getText());
             fechapagartext = fechapago.getText();
             usuariopagar= usuario.getText();
             cambiopagar = cambio.getText();
             montopagar = montodestino.getText().length();
             pago = new Pago(idremesa, fechapagartext, usuariopagar, cambiopagar, montopagar);
             if (Pago.agregarPago(pago) == true) {
                 JOptionPane.showMessageDialog(null, "Se ha efectuado el pago exitosamente.");
                 usuario.setText("");
                 cambio.setText("");
                 montodestino.setText("");
                 id.setText("");
             }else if (usuario.getText().isEmpty() && cambio.getText().isEmpty() && montodestino.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Error al ingresar los datos. Volver a intentarlo.");
                 usuario.setText("");
                 cambio.setText("");
                 montodestino.setText("");
                 id.setText("");
             }
         }
         });
    }
}