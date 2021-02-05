package Control_de_Remesas;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ventana_Administrador {

	public JFrame Administrador;
	public JPanel panelA;
	public JLabel bienvenidolbl;
	public JButton cerrar, ventas, registro, contabilidad, pagos;
	public Login login = new Login();
	public registro_empleado empleado = new registro_empleado();

	public ventana_Administrador() {

		Administrador = new JFrame("Administrador");
		panelA = new JPanel();
		bienvenidolbl = new JLabel("Bienvenido seleccione uno de las siguientes acciones...");
		cerrar = new JButton("Cerrar Sesion");
		ventas = new JButton("Ventas");
		registro = new JButton("Registro de Empleado");
		contabilidad = new JButton("Contabilidad");
		pagos = new JButton("Pagos");

		Administrador.setBounds(500, 250, 800, 450);
		Administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bienvenidolbl.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
		bienvenidolbl.setBounds(50, 45, 800, 100);
		cerrar.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		cerrar.setBounds(600, 20, 140, 30);
		ventas.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		ventas.setBounds(50, 150, 140, 30);
		registro.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		registro.setBounds(200, 150, 200, 30);
		contabilidad.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		contabilidad.setBounds(410, 150, 140, 30);
		pagos.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		pagos.setBounds(565, 150, 140, 30);
		ImageIcon img = new ImageIcon(
				"C:\\Users\\Casca\\Documents\\IPC\\Segundo Semestre\\Proyecto 1\\LOGO-FIUSAC.png");
		JLabel imagen = new JLabel(img);
		imagen.setBounds(100, 200, 200, 200);
		Icon icono = new ImageIcon(
				img.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
		imagen.setIcon(icono);
		ImageIcon img2 = new ImageIcon("C:\\Users\\Casca\\Documents\\IPC\\Segundo Semestre\\Proyecto 1\\logo_usac.png");
		JLabel imagen2 = new JLabel(img);
		imagen2.setBounds(410, 200, 200, 200);
		Icon icono2 = new ImageIcon(
				img2.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_DEFAULT));
		imagen2.setIcon(icono2);

		// agregar
		panelA.add(bienvenidolbl);
		panelA.add(cerrar);
		panelA.add(ventas);
		panelA.add(registro);
		panelA.add(contabilidad);
		panelA.add(pagos);
		panelA.add(imagen);
		panelA.add(imagen2);
		panelA.setLayout(null);
		Administrador.add(panelA);

		// Cerrar Sesion

		cerrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				login.main(null);
				Administrador.hide();

			}
		});
		
		//Registro de Empleado
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				empleado.registros.show();
				Administrador.hide();
			}
		});

	}

	public static void main(String[] args) {

		ventana_Administrador iniciar = new ventana_Administrador();
		iniciar.Administrador.show();

	}

}
