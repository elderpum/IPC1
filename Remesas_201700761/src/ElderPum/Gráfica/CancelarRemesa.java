package ElderPum.Gráfica;
import ElderPum.Lógica.*;
import ElderPum.Gráfica.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CancelarRemesa extends JFrame{
    public JTextField id, fecha, usuario, motivo;
    public JLabel lblid, lblfecha, lblusuario, lblmotivo;
    public JButton eliminar, cancelar, salir;
    String usuariopagar, motivopagar, fechapagartext, idremesa;
    Calendar fechapagar = Calendar.getInstance();
    int año = fechapagar.get(Calendar.DATE);
    int mes = fechapagar.get(Calendar.MONTH);
    int dia = fechapagar.get(Calendar.YEAR);
    int hora = fechapagar.get(Calendar.HOUR_OF_DAY);
    int minuto = fechapagar.get(Calendar.MINUTE);
    int segundo = fechapagar.get(Calendar.SECOND);
    
    public CancelarRemesa(){
        super("CANCELAR REMESA");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 250, 530, 250);
        this.lblfecha = new JLabel("Fecha Cancelación:");
        this.lblfecha.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblfecha.setBounds(20, 20, 200, 25);
        this.fecha = new JTextField(dia + "/" +(mes +1) + "/" + (año-2) + "---" + hora + ":" + minuto + ":" + segundo);
        this.fecha.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.fecha.setBounds(250, 20, 250, 25);
        this.fecha.setHorizontalAlignment(SwingConstants.CENTER);
        this.fecha.setEnabled(false);
        this.lblusuario = new JLabel("Usuario:");
        this.lblusuario.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblusuario.setBounds(20, 50, 150, 25);
        this.usuario = new JTextField();
        this.usuario.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.usuario.setBounds(250, 50, 250, 25);
        this.usuario.setHorizontalAlignment(SwingConstants.CENTER);
        this.usuario.setEnabled(false);
        this.lblmotivo = new JLabel("Motivo Cancelar:");
        this.lblmotivo.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblmotivo.setBounds(20, 80, 200, 25);
        this.motivo = new JTextField("");
        this.motivo.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.motivo.setBounds(250, 80, 250, 25);
        this.motivo.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblid = new JLabel("ID Remesa:");
        this.lblid.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.lblid.setBounds(20, 110, 150, 25);
        this.id = new JTextField();
        this.id.setFont(new java.awt.Font("Monospaced", Font.BOLD, 18));
        this.id.setBounds(250, 110, 250, 25);
        this.id.setHorizontalAlignment(SwingConstants.CENTER);
        this.eliminar = new JButton("Eliminar");
        this.eliminar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.eliminar.setBounds(20, 165, 120, 30);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.cancelar.setBounds(200, 165, 120, 30);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.salir.setBounds(370, 165, 120, 30);
        
        this.add(this.lblfecha);
        this.add(this.fecha);
        this.add(this.lblusuario);
        this.add(this.usuario);
        this.add(this.lblmotivo);
        this.add(this.motivo);
        this.add(this.lblid);
        this.add(this.id);
        this.add(this.eliminar);
        this.add(this.cancelar);
        this.add(this.salir);
        this.setLayout(null);
        
        this.salir.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             TipoCancelar mcancelar = new TipoCancelar();
             mcancelar.setVisible(true);
             hide();
         }
         });
        
        this.cancelar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
                 motivo.setText("");
                 id.setText("");
         }
         });
        
        this.eliminar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Cancelar_Venta cancelarventa;
             idremesa = id.getText();
             fechapagartext = fecha.getText();
             usuariopagar = usuario.getText();
             motivopagar = motivo.getText();
             cancelarventa = new Cancelar_Venta(idremesa, fechapagartext, usuariopagar, motivopagar);
             if (Cancelar_Venta.agregarCancelarVenta(cancelarventa) == true) {
                 JOptionPane.showMessageDialog(null, "Procesando solicitud de cancelación.");
                 JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente el pago. El dinero se ha remunerado a su cuenta.");
                 JOptionPane.showMessageDialog(null, "Volviendo al menú de cancelaciones. Recuerde que la cancelación en el área de Contabilidad no se mostrará hasta reiniciar el programa.");
                 TipoCancelar mcancelar = new TipoCancelar();
                 mcancelar.setVisible(true);
                 hide();
             }
         }
         });
    }
}
