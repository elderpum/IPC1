package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*; 

public class EliminarUsuario extends JFrame{
    public JButton beliminar, bsalir;
    public JLabel lbleliminar;
    public JTextField txteliminar;
    
    public EliminarUsuario(){
        super("ELIMINAR USUARIO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 250);
        this.setLocationRelativeTo(null);
        this.lbleliminar = new JLabel("Ingrese el Nombre del User:");
        this.lbleliminar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lbleliminar.setBounds(25, 10, 300, 25);
        this.beliminar = new JButton("Eliminar");
        this.beliminar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.beliminar.setBounds(10, 150, 125, 25);
        this.bsalir = new JButton("Salir");
        this.bsalir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bsalir.setBounds(150, 150, 125, 25);
        this.txteliminar = new JTextField("");
        this.txteliminar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.txteliminar.setBounds(70, 75, 150, 50);
        this.txteliminar.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(this.lbleliminar);
        this.add(this.beliminar);
        this.add(this.bsalir);
        this.add(this.txteliminar);
        this.setLayout(null);
        
        this.bsalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            MenuRegistro rmenu = new MenuRegistro();
            rmenu.setVisible(true);
            hide();
        }
        });
        
        this.beliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String nombreUsuario = txteliminar.getText();
            if (Usuario.eliminarUsuario(nombreUsuario) == true) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado con éxito.");
                txteliminar.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario. Volver a intentarlo.");
                txteliminar.setText("");
            }
        }
        });
    }
}
