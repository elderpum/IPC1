package login;
import org.ElderPum.Bean.*;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class login extends JFrame{
    JTextField JTUser;
    JPasswordField JPPassword;
    JLabel JLUser, JLPassword, JLTitulo;
    JPanel JPSesion;
    JButton JBAceptar, JBCancelar;
    JDialog JDNo_Existe_Usuario, JDNo_Coindice_Contraseña, JDBlanco;
    int a,w;
    
    public login(String nom){
    super(nom);
    ScreenDetail();
    InicioLogin();
    }

public void ScreenDetail(){
    Toolkit tk = Toolkit.getDefaultToolkit();   
    Dimension tam = tk.getScreenSize();
    a= tam.height;
    w=tam.width;
    }
    public void InicioLogin(){
          
    setVisible(true);
    setDefaultCloseOperation(HIDE_ON_CLOSE);
    setResizable(true);
    setLayout(null);
    setLocation(3*w/10, 3*a/10);
    setSize(4*w/10,3*a/10);
    JPSesion = new JPanel(null);
    JPSesion.setBounds(0, 0, 4*w/10, 20);
    JPSesion.setBackground(Color.DARK_GRAY);
    
    JLTitulo= new JLabel("INICIO DE SESIÓN");
    JLTitulo.setBounds(50,5,3*w/10,15);
    JLTitulo.setHorizontalAlignment(SwingConstants.CENTER);
    JLTitulo.setForeground(Color.WHITE);
    
    JLUser = new JLabel("ID/USUARIO:");
    JLUser.setBounds(40,30,80,20);
    JTUser= new JTextField();
    JTUser.setBounds(40, 60,200, 20);
    
    JLPassword= new JLabel("PASSWORD:");
    JLPassword.setBounds(40, 90,80,20);
    JPPassword= new JPasswordField();
    JPPassword.setBounds(40, 110,200,20);
    JPSesion.add(JLTitulo);
    
    JBAceptar= new JButton("ACEPTAR");
    JBAceptar.setBounds(350, 50, 100, 40);
    JBAceptar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainLogin.verificar();
        }
    });
    JBCancelar= new JButton("CANCELAR");
    JBCancelar.setBounds(350, 100, 100, 40);
    JBCancelar.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==1){
        JTUser.setText("");
        JPPassword.setText("");    
        }else if(e.getClickCount()==2){    
        setVisible(false);
        }  
        }
    
    });
    add(JPSesion);
    add(JLUser);
    add(JTUser);
    add(JLPassword);
    add(JPPassword);
    add(JBAceptar);
    add(JBCancelar);
    }
    public String getUserOrID(){
    return JTUser.getText();
    }
    public char [] getPassword(){
    return JPPassword.getPassword();
    }
    public void DialogoNoCoincideContraseña(){
    JPanel JPBarra;    
    JPBarra= new JPanel(null);
    JPBarra.setBounds(0, 0,2*w/8,20);
    
    JLabel JLTituloDialog;
    JLTituloDialog= new JLabel("INFORMACIÓN DE ERROR");
    JLTituloDialog.setBounds(0,0,2*w/8,15);
    JLTituloDialog.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel Contenido;
    Contenido= new JLabel("NO COINCIDEN LA CONTRASEÑA");
    Contenido.setBounds(0,20,2*w/8,60);
    Contenido.setHorizontalAlignment(SwingConstants.CENTER);
    JPBarra.add(JLTituloDialog); 
    
    JButton JBAceptar;
    JBAceptar = new JButton("ACEPTAR");
    JBAceptar.setBounds(125, 70,100, 20);
    JBAceptar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTUser.setText("");
            JPPassword.setText(""); 
       }
    });
    }
    public void DialogoNoCoincideUser(){
    JPanel JPBarra;    
    JPBarra= new JPanel(null);
    JPBarra.setBounds(0, 0,2*w/8,20);
    
    JLabel JLTituloDialog;
    JLTituloDialog= new JLabel("INFORMACIÓN");
    JLTituloDialog.setBounds(0,0,2*w/8,15);
    JLTituloDialog.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel Contenido;
    Contenido= new JLabel("NO EXISTE EL USUARIO");
    Contenido.setBounds(0,20,2*w/8,60);
    Contenido.setHorizontalAlignment(SwingConstants.CENTER);
    JPBarra.add(JLTituloDialog); 

    JButton JBAceptar;
    JBAceptar = new JButton("ACEPTAR");
    JBAceptar.setBounds(125, 70,100, 20);
    JBAceptar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTUser.setText("");
            JPPassword.setText("");
        }
    });
    }
    public void DialogoEspacioBlanco(){
    JPanel JPBarra;    
    JPBarra= new JPanel(null);
    JPBarra.setBounds(0, 0,2*w/8,20);
    
    JLabel JLTituloDialog;
    JLTituloDialog= new JLabel("INFORMACIÓN");
    JLTituloDialog.setBounds(0,0,2*w/8,15);
    JLTituloDialog.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel Contenido;
    Contenido= new JLabel("NO DEJE NINGUN CAMPO EN BLANCO");
    Contenido.setBounds(0,20,2*w/8,60);
    Contenido.setHorizontalAlignment(SwingConstants.CENTER);
    JPBarra.add(JLTituloDialog); 

    JButton JBAceptar;
    JBAceptar = new JButton("ACEPTAR");
    JBAceptar.setBounds(125, 70,100, 20);
    JBAceptar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Acá se deja igual el espacio en blanco.");
            JTUser.setText("");
            JPPassword.setText("");
        }
    });
    }
}