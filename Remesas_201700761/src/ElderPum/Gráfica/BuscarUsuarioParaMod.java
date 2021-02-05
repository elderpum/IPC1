package ElderPum.Gráfica;

import ElderPum.Lógica.Usuario;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BuscarUsuarioParaMod extends JFrame{
public JButton bbuscar, bsalir;
    public JLabel lblbuscar;
    public JTextField txtbuscar;
    public static String nombreUsuario;
    ModUsuario mod = new ModUsuario();
    
    public BuscarUsuarioParaMod(){
        super("BUSCAR USUARIO:");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 250);
        this.setLocationRelativeTo(null);
        this.lblbuscar = new JLabel("Ingrese el Nombre Usuario:");
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
            MenuRegistro rmenu = new MenuRegistro();
            rmenu.setVisible(true);
            hide();
        }
        });
        
        this.bbuscar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            nombreUsuario = txtbuscar.getText();
            int posicion = Usuario.obtenerPosicionUsuario(nombreUsuario);
            if (Usuario.prepararModificacionUsuario(nombreUsuario) == true) {
                mod.apellido.setText(Usuario.ListUsuario[posicion].getApellido());
                mod.contrasenia.setText(Usuario.ListUsuario[posicion].getPassword());
                mod.correo.setText(Usuario.ListUsuario[posicion].getCorreo());
                mod.edad.setText(Integer.toString(Usuario.ListUsuario[posicion].getEdad()));
                mod.identificacion.setText(Usuario.ListUsuario[posicion].getIdentificacion());
                mod.nacionalidad.setText(Usuario.ListUsuario[posicion].getNacionalidad());
                mod.nombre.setText(Usuario.ListUsuario[posicion].getNombre());
                mod.nombreuser.setText(Usuario.ListUsuario[posicion].getNombreUsuario());
                mod.rol.setSelectedItem(Usuario.ListUsuario[posicion].getRol());
                JOptionPane.showMessageDialog(null, "Abriendo pestaña para modificación de Usuario.");
                mod.setVisible(true);
                hide();
            }else if (Usuario.obtenerPosicionUsuario(nombreUsuario) == -1) {
                JOptionPane.showMessageDialog(null, "Error en la búsqueda. Intentarlo de Nuevo.");
                txtbuscar.setText("");
            }
        }
        });
    }    
}
