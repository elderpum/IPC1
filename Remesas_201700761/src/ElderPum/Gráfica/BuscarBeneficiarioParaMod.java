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

public class BuscarBeneficiarioParaMod extends JFrame{
    public JButton bbuscar, bsalir;
    public JLabel lblbuscar;
    public JTextField txtbuscar;
    ModBeneficiario modR = new ModBeneficiario();
    public static String nombreBen;
    
    public BuscarBeneficiarioParaMod(){
        super("BUSCAR BENEFICIARIO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 250);
        this.setLocationRelativeTo(null);
        this.lblbuscar = new JLabel("Ingrese el Nombre del Benf:");
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
            nombreBen = txtbuscar.getText();
            int posicion = Beneficiario.obtenerPosicionBeneficiario(nombreBen);
            if (Beneficiario.prepararModificacionBeneficiario(nombreBen) == true) {
                modR.apellido.setText(Beneficiario.ListBeneficiario[posicion].getApellidoBen());
                modR.direccion.setText(Beneficiario.ListBeneficiario[posicion].getDireccionBen());
                modR.correo.setText(Beneficiario.ListBeneficiario[posicion].getCorreoBen());
                modR.fecha.setDate(Beneficiario.ListBeneficiario[posicion].getNacimientoBen());
                modR.identificacion.setText(Beneficiario.ListBeneficiario[posicion].getIdentificadorBen());
                modR.nacionalidad.setText(Beneficiario.ListBeneficiario[posicion].getNacionalidadBen());
                modR.nombre.setText(Beneficiario.ListBeneficiario[posicion].getNombreBen());
                modR.telefono.setText(Beneficiario.ListBeneficiario[posicion].getTelefonoBen());
                JOptionPane.showMessageDialog(null, "Abriendo pestaña para modificación de Remitente.");
                modR.setVisible(true);
                hide();
            }else if (Beneficiario.obtenerPosicionBeneficiario(nombreBen) == -1) {
                JOptionPane.showMessageDialog(null, "Error en la búsqueda. Intentarlo de Nuevo.");
                txtbuscar.setText("");
            }
        }
        });
    }
}
