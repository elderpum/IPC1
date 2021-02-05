package Control_de_Remesas;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {

	public JLabel usuario, password;
	public JTextField user;
	public JPasswordField pass;
	public JButton ingresar;
	public String nombre, conta, puesto;
	public static String[][] usuarios = new String [100][8];
	
	public Login() {
		super("Login");

		nombre = "Pedro";
		conta = "11";
		puesto = "Administrador";

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500, 250, 600, 380);
		this.usuario = new JLabel("Usuario");
		this.usuario.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		this.usuario.setBounds(125, 45, 100, 100);
		this.password = new JLabel("password");
		this.password.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		this.password.setBounds(100, 126, 150, 100);
		this.user = new JTextField("");
		this.user.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		this.user.setBounds(220, 85, 150, 25);
		this.pass = new JPasswordField("");
		this.pass.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		this.pass.setBounds(220, 165, 150, 25);
		this.ingresar = new JButton("Ingresar");
		this.ingresar.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		this.ingresar.setBounds(350, 230, 150, 25);

		// agregar al frame
		this.add(this.usuario);
		this.add(this.password);
		this.add(this.user);
		this.add(this.pass);
		this.add(this.ingresar);
		this.setLayout(null);

		// Accion del boton
		this.ingresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if ((pass.getText().isEmpty()) && (user.getText().isEmpty())) {

					JOptionPane.showMessageDialog(null, "Debe ingresar un Usuario y una contraseña...", "Alerta",
							JOptionPane.INFORMATION_MESSAGE);

				} else if ((pass.getText().equals(conta)) && (user.getText().equals(nombre)) && (puesto.equals("Administrador"))) {
						
						ventana_Administrador menu = new ventana_Administrador();
						menu.main(null);
						hide();
					
				}else {
					
					for(int a = 0; a<9; a++) {
						
					}
					
				}
				
			}
		});

	}

	
	public static void main(String[] args) {

		Login iniciar = new Login();
		iniciar.setVisible(true);

	}

}
