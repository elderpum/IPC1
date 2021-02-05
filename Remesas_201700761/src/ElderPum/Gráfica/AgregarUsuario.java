package ElderPum.Gráfica;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ElderPum.Gráfica.*;
import ElderPum.Lógica.*;

public class AgregarUsuario extends JFrame{
    public JButton agregar, cancelar, salir;
    public JLabel lblmenu, lblnombre, lblapellido, lbledad, lblidentificacion, lblrol, lblnacionalidad, lblnombreuser, lblcontrasenia, lblcorreo;
    public JTextField nombre, apellido, edad, identificacion, nacionalidad, nombreuser, contrasenia, correo;
    public JComboBox rol;
    String nombret, apellidot, identificaciont, nacionalidadt, usert, contrat, correot;
    Usuario.Rol rolt;
    int edadt;
    public static Usuario.Rol admin = Usuario.Rol.ADMINISTRADOR;
    public static Usuario.Rol pagador = Usuario.Rol.PAGADOR;
    public static Usuario.Rol vendedor = Usuario.Rol.VENDEDOR;
    
    public AgregarUsuario(){
        super("AGREGAR USUARIO");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 800, 450, 600);
        this.setLocationRelativeTo(null);
        this.lblnombre = new JLabel("Nombre:");
        this.lblnombre.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblnombre.setBounds(20, 15, 100, 25);
        this.nombre = new JTextField("");
        this.nombre.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.nombre.setBounds(200, 15, 200, 25);
        this.nombre.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblapellido = new JLabel("Apellido:");
        this.lblapellido.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblapellido.setBounds(20, 50, 100, 25);
        this.apellido = new JTextField("");
        this.apellido.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.apellido.setBounds(200, 50, 200, 25);
        this.apellido.setHorizontalAlignment(SwingConstants.CENTER);
        this.lbledad = new JLabel("Edad:");
        this.lbledad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lbledad.setBounds(20, 85, 100, 25);
        this.edad = new JTextField("");
        this.edad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.edad.setBounds(200, 85, 200, 25);
        this.edad.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblidentificacion = new JLabel("Identificación:");
        this.lblidentificacion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblidentificacion.setBounds(20, 135, 150, 25);
        this.identificacion = new JTextField("");
        this.identificacion.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.identificacion.setBounds(200, 135, 200, 25);
        this.identificacion.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblrol = new JLabel("Rol:");
        this.lblrol.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblrol.setBounds(20, 190, 100, 25);
        this.rol = new JComboBox();
        this.rol.addItem(admin);
        this.rol.addItem(pagador);
        this.rol.addItem(vendedor);
        this.rol.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.rol.setBounds(200, 190, 200, 25);
        this.lblnacionalidad = new JLabel("Nacionalidad:");
        this.lblnacionalidad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblnacionalidad.setBounds(20, 245, 200, 25);
        this.nacionalidad = new JTextField("");
        this.nacionalidad.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.nacionalidad.setBounds(200, 245, 200, 25);
        this.nacionalidad.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblnombreuser = new JLabel("Nombre User:");
        this.lblnombreuser.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblnombreuser.setBounds(20, 290, 150, 25);
        this.nombreuser = new JTextField("");
        this.nombreuser.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.nombreuser.setBounds(200, 290, 200, 25);
        this.nombreuser.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblcontrasenia = new JLabel("Contraseña:");
        this.lblcontrasenia.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblcontrasenia.setBounds(20, 335, 150, 25);
        this.contrasenia = new JTextField("");
        this.contrasenia.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.contrasenia.setBounds(200, 335, 200, 25);
        this.contrasenia.setHorizontalAlignment(SwingConstants.CENTER);
        this.lblcorreo = new JLabel("Correo:");
        this.lblcorreo.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.lblcorreo.setBounds(20, 390, 150, 25);
        this.correo = new JTextField("@gmail.com");
        this.correo.setFont(new java.awt.Font("helvetica", Font.BOLD, 18));
        this.correo.setBounds(200, 390, 200, 25);
        this.correo.setHorizontalAlignment(SwingConstants.CENTER);
        this.agregar = new JButton("Agregar");
        this.agregar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.agregar.setBounds(20, 450, 150, 45);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.cancelar.setBounds(250, 450, 150, 45);
        this.salir = new JButton("Salir");
        this.salir.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
        this.salir.setBounds(133, 507, 150, 45);
        this.add(this.lblnombre);
        this.add(this.nombre);
        this.add(this.lblapellido);
        this.add(this.apellido);
        this.add(this.lbledad);
        this.add(this.edad);
        this.add(this.lblidentificacion);
        this.add(this.identificacion);
        this.add(this.lblrol);
        this.add(this.rol);
        this.add(this.lblnacionalidad);
        this.add(this.nacionalidad);
        this.add(this.lblnombreuser);
        this.add(this.nombreuser);
        this.add(this.lblcontrasenia);
        this.add(this.contrasenia);
        this.add(this.lblcorreo);
        this.add(this.correo);
        this.add(this.agregar);
        this.add(this.cancelar);
        this.add(this.salir);
        this.setLayout(null);
        this.cancelar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            nombre.setText("");
            apellido.setText("");
            edad.setText("");
            identificacion.setText("");
            nacionalidad.setText("");
            nombreuser.setText("");
            contrasenia.setText("");
            correo.setText("@gmail.com");
            JOptionPane.showMessageDialog(null, "Recuerde solamente introducir un correo de Google. Gracias por su preferencia.");
        }
        });
        
        this.salir.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             MenuRegistro rmenu = new MenuRegistro();
             rmenu.setVisible(true);
             hide();
         }
         });
        
        this.agregar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent arg0) {
             Usuario usuario;
             nombret = nombre.getText();
             apellidot = apellido.getText();
             edadt = edad.getText().length();
             identificaciont = identificacion.getText();
             rolt = (Usuario.Rol) rol.getSelectedItem();
             nacionalidadt = nacionalidad.getText();
             usert = nombreuser.getText();
             contrat = contrasenia.getText();
             correot = correo.getText();
             usuario = new Usuario(nombret, apellidot, edadt, identificaciont, rolt, nacionalidadt, usert, contrat, correot);
             if (Usuario.agregarUsuario(usuario) == true) {
                     JOptionPane.showMessageDialog(null, "Usuario agregado con éxito.");
                    nombre.setText("");
                    apellido.setText("");
                    edad.setText("");
                    identificacion.setText("");
                    nacionalidad.setText("");
                    nombreuser.setText("");
                    contrasenia.setText("");
                    correo.setText("@gmail.com");
                 
             }else if (Usuario.agregarUsuario(usuario) == false) {               
                 JOptionPane.showMessageDialog(null, "Error al ingresar usuario. Volver a intentarlo.");               
                 nombre.setText("");
                 apellido.setText("");
                 edad.setText("");
                 identificacion.setText("");
                 nacionalidad.setText("");
                 nombreuser.setText("");
                 contrasenia.setText("");
                 correo.setText("@gmail.com");

             }
         }
         });
    }
}
