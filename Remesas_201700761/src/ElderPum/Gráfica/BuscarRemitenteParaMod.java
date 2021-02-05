package ElderPum.Gráfica;

import ElderPum.Lógica.*;
import ElderPum.Gráfica.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BuscarRemitenteParaMod extends JFrame{
    public JButton bbuscar, bsalir;
    public JLabel lblbuscar;
    public JTextField txtbuscar;
    ModRemitente modR = new ModRemitente();
    public static String nombreRem;
    
    public BuscarRemitenteParaMod(){
        super("BUSCAR REMITENTE:");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 250);
        this.setLocationRelativeTo(null);
        this.lblbuscar = new JLabel("Ingrese el Nombre del Rem:");
        this.lblbuscar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblbuscar.setBounds(25, 10, 300, 25);
        this.bbuscar = new JButton("Buscar");
        this.bbuscar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bbuscar.setBounds(10, 150, 125, 25);
        this.bsalir = new JButton("Salir");
        this.bsalir.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.bsalir.setBounds(150, 150, 125, 25);
        this.txtbuscar = new JTextField("");
        this.txtbuscar.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.txtbuscar.setBounds(70, 75, 150, 50);
        this.txtbuscar.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(this.lblbuscar);
        this.add(this.bbuscar);
        this.add(this.bsalir);
        this.add(this.txtbuscar);
        this.setLayout(null);
        
        this.bsalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.admin) {
                MenuRegistro rmenu = new MenuRegistro();
                rmenu.setVisible(true);
                hide();  
             }else if (Usuario.obtenerRolUsuario(Login.nombreuser) == Usuario.vendedor) {
                MenuRegistro rmenu = new MenuRegistro();
                rmenu.setVisible(true);
                hide();
                rmenu.agregarusuario.setEnabled(false);
                rmenu.modusuario.setEnabled(false);
                rmenu.eliminarusuario.setEnabled(false);
             }
        }
        });
        
        this.bbuscar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            nombreRem = txtbuscar.getText();
            int posicion = Remitente.obtenerPosicionRemitente(nombreRem);
            if (Remitente.prepararModificacionRemitente(nombreRem) == true) {
                modR.apellido.setText(Remitente.ListRemitente[posicion].getApellidoRem());
                modR.direccion.setText(Remitente.ListRemitente[posicion].getDireccionRem());
                modR.correo.setText(Remitente.ListRemitente[posicion].getCorreoRem());
                modR.fecha.setDate(Remitente.ListRemitente[posicion].getNacimientoRem());
                modR.identificacion.setText(Remitente.ListRemitente[posicion].getIdentificadorRem());
                modR.nacionalidad.setText(Remitente.ListRemitente[posicion].getNacionalidadRem());
                modR.nombre.setText(Remitente.ListRemitente[posicion].getNombreRem());
                modR.telefono.setText(Remitente.ListRemitente[posicion].getTelefonoRem());
                JOptionPane.showMessageDialog(null, "Abriendo pestaña para modificación de Remitente.");
                modR.setVisible(true);
                hide();
            }else if (Remitente.obtenerPosicionRemitente(nombreRem) == -1) {
                JOptionPane.showMessageDialog(null, "Error en la búsqueda. Intentarlo de Nuevo.");
                txtbuscar.setText("");
            }
        }
        });
    }
}
