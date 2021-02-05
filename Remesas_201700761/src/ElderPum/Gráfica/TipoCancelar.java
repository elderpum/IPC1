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

public class TipoCancelar extends JFrame{
    public JButton bremesa, bpago, bsalir;
    
    public TipoCancelar(){
        super("TIPO DE CANCELACIÓN");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 200);
        this.setLocationRelativeTo(null);
        this.bremesa = new JButton("Remesa");
        this.bremesa.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bremesa.setBounds(10, 50, 125, 25);
        this.bpago = new JButton("Pago");
        this.bpago.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bpago.setBounds(150, 50, 125, 25);
        this.bsalir = new JButton("Salir");
        this.bsalir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bsalir.setBounds(80, 120, 125, 25);
        
        this.add(this.bremesa);
        this.add(this.bpago);
        this.add(this.bsalir);
        this.setLayout(null);
        
        this.bpago.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            CancelarPago pago = new CancelarPago();
            pago.setVisible(true);
            hide();
            pago.usuario.setText(Login.nombreuser);
        }
        });
        
        this.bremesa.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            CancelarRemesa remesa = new CancelarRemesa();
            remesa.setVisible(true);
            hide();
            remesa.usuario.setText(Login.nombreuser);
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
