package ElderPum.Gráfica;
    
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ModBeneficiario extends JFrame{
    public JButton agregar, salir;
    public JLabel lblnombre, lblapellido, lblfecha, lblidentificacion,  lblnacionalidad, lbldireccion, lbltelefono, lblcorreo;
    public JTextField nombre, apellido, identificacion, nacionalidad, direccion, telefono, correo;
    public JDateChooser fecha;
    Calendar calendario = new GregorianCalendar(2000,8,22);
    String nombret, apellidot, nacionalidadt, direcciont, correot, identificaciont, telefonot;
    Date fechat;
    
    public ModBeneficiario(){
        super("MODIFICAR BENEFICIARIO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 800, 445, 530);
        this.setLocationRelativeTo(null);
        this.lblnombre = new JLabel("Nombre:");
        this.lblnombre.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblnombre.setBounds(20, 15, 100, 25);
        this.nombre = new JTextField();
        this.nombre.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.nombre.setBounds(200, 15, 200, 25);
        this.nombre.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblapellido = new JLabel("Apellido:");
        this.lblapellido.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblapellido.setBounds(20, 50, 100, 25);
        this.apellido = new JTextField();
        this.apellido.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.apellido.setBounds(200, 50, 200, 25);
        this.apellido.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblfecha = new JLabel("Edad:");
        this.lblfecha.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblfecha.setBounds(20, 85, 100, 25);
        this.fecha = new JDateChooser();
        this.fecha.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.fecha.setBounds(200, 85, 200, 25);
        this.fecha.setMaxSelectableDate(calendario.getTime());
        this.fecha.setDate(calendario.getTime());
        this.lblidentificacion = new JLabel("Identificación:");
        this.lblidentificacion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblidentificacion.setBounds(20, 135, 150, 25);
        this.identificacion = new JTextField();
        this.identificacion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.identificacion.setBounds(200, 135, 200, 25);
        this.identificacion.setHorizontalAlignment(SwingConstants.CENTER);
        this.identificacion.setEnabled(false);
        this.lblnacionalidad = new JLabel("Nacionalidad:");
        this.lblnacionalidad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblnacionalidad.setBounds(20, 200, 200, 25);
        this.nacionalidad = new JTextField();
        this.nacionalidad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.nacionalidad.setBounds(200, 200, 200, 25);
        this.nacionalidad.setHorizontalAlignment(SwingConstants.CENTER);
        this.lbldireccion = new JLabel("Dirección:");
        this.lbldireccion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lbldireccion.setBounds(20, 245, 150, 25);
        this.direccion = new JTextField();
        this.direccion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.direccion.setBounds(200, 245, 200, 25);
        this.direccion.setHorizontalAlignment(SwingConstants.CENTER);
        this.lbltelefono = new JLabel("Teléfono:");
        this.lbltelefono.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lbltelefono.setBounds(20, 290, 150, 25);
        this.telefono = new JTextField();
        this.telefono.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.telefono.setBounds(200, 290, 200, 25);
        this.telefono.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblcorreo = new JLabel("Correo:");
        this.lblcorreo.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblcorreo.setBounds(20, 345, 150, 25);
        this.correo = new JTextField();
        this.correo.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.correo.setBounds(200, 345, 200, 25);
        this.correo.setHorizontalAlignment(SwingConstants.CENTER);
        this.agregar = new JButton("Modificar");
        this.agregar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.agregar.setBounds(20, 390, 150, 45);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.salir.setBounds(250, 390, 150, 45);
        this.add(this.lblnombre);
        this.add(this.nombre);
        this.add(this.lblapellido);
        this.add(this.apellido);
        this.add(this.lblfecha);
        this.add(this.fecha);
        this.add(this.lblidentificacion);
        this.add(this.identificacion);
        this.add(this.lblnacionalidad);
        this.add(this.nacionalidad);
        this.add(this.lbldireccion);
        this.add(this.direccion);
        this.add(this.lbltelefono);
        this.add(this.telefono);
        this.add(this.lblcorreo);
        this.add(this.correo);
        this.add(this.agregar);
        this.add(this.salir);
        this.setLayout(null);
        
        this.salir.addActionListener(new ActionListener() {
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
        
         this.agregar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             nombret = nombre.getText();
             apellidot = apellido.getText();
             fechat = fecha.getDate();
             DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
             String convertido = d.format(fechat);
             identificaciont = identificacion.getText();
             nacionalidadt = nacionalidad.getText();
             direcciont = direccion.getText();
             telefonot = telefono.getText();
             correot = correo.getText();
             String nombreBen = BuscarBeneficiarioParaMod.nombreBen;
             int posicion = Beneficiario.obtenerPosicionBeneficiario(nombreBen);
             Beneficiario obtbeneficiario = Beneficiario.obtenerBeneficiario(posicion);
             obtbeneficiario = new Beneficiario(identificaciont, nombret, apellidot, fechat, nacionalidadt, direcciont, telefonot, correot);
             if (Beneficiario.actualizarBeneficiario(obtbeneficiario, posicion) == true) {
                 JOptionPane.showMessageDialog(null, "Beneficiario Modificado con Éxito.");
                 MenuRegistro rmenu = new MenuRegistro();
                 rmenu.setVisible(true);
                 hide();
             }else if (Beneficiario.actualizarBeneficiario(obtbeneficiario, posicion) == false) {
                 JOptionPane.showMessageDialog(null, "Error al modificar. Volver a intentarlo.");
             }
         }
         });
    }
}
