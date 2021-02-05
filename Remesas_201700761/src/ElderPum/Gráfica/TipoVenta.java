
package ElderPum.Gráfica;

import ElderPum.Lógica.*;
import ElderPum.Gráfica.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TipoVenta extends JFrame{
    public JButton bremesa, brecarga, bsalir;
    VenderRecarga recarga = new VenderRecarga();
    VenderRemesa remesa = new VenderRemesa();
    
    public TipoVenta(){
        super("TIPO DE VENTA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 200);
        this.setLocationRelativeTo(null);
        this.bremesa = new JButton("Remesa");
        this.bremesa.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bremesa.setBounds(10, 50, 125, 25);
        this.brecarga = new JButton("Recargas");
        this.brecarga.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.brecarga.setBounds(150, 50, 125, 25);
        this.bsalir = new JButton("Salir");
        this.bsalir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bsalir.setBounds(80, 120, 125, 25);
        
        this.add(this.bremesa);
        this.add(this.brecarga);
        this.add(this.bsalir);
        this.setLayout(null);
        
        this.brecarga.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            recarga.setVisible(true);
            hide();
            recarga.usuario.setText(Login.nombreuser);
        }
        });
        
        this.bremesa.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            remesa.setVisible(true);
            hide();
            int numero = (int)(Math.random()*(500+1)+1);
            remesa.id.setText("Boleta No."+numero);
        }
        });
        
        this.bsalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.admin) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();  
             }else if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.vendedor) {
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                hide();
                menu.configuracion.setEnabled(false);
                menu.contabilidad.setEnabled(false);
                menu.pagos.setEnabled(false);
             }
        }
        });
    }
}
