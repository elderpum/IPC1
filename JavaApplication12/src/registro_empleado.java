package Control_de_Remesas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class registro_empleado {

	//public String[][] usuarios = new String [100][8];
	public JFrame registros;
	public JPanel panelR;
	public JLabel nombrelbl, apellidoslbl, edadlbl, identificacionlbl, rollbl, nacionalidadlbl, usuariolbl, contrasenalbl, correolbl;
	public JTextField nombretxt, apellidostxt, edadtxt, identificaciontxt, roltxt, nacionalidadtxt, usuariotxt, contrasenatxt, correotxt;
	public JButton registrarbt, cancelarbt;
	public Login almacenar = new Login();
	public int contador;
	
	
	public registro_empleado() {
		contador=0;
		registros = new JFrame("Registro de Empleados");
		panelR = new JPanel();
		nombrelbl = new JLabel("Nombres");
		apellidoslbl = new JLabel("Apellidos");
		edadlbl = new JLabel("Edad");
		identificacionlbl = new JLabel("Identificación");
		rollbl = new JLabel("Rol");
		nacionalidadlbl = new JLabel("Nacionalidad");
		usuariolbl = new JLabel("Usuario");
		contrasenalbl = new JLabel("Contraseña");
		correolbl = new JLabel("Correo electrónico");
		nombretxt = new JTextField();
		apellidostxt = new JTextField();
		edadtxt = new JTextField();
		identificaciontxt = new JTextField();
		roltxt = new JTextField();
		nacionalidadtxt = new JTextField();
		usuariotxt = new JTextField();
		contrasenatxt = new JTextField();
		correotxt = new JTextField();
		registrarbt = new JButton("Registrar");
		cancelarbt = new JButton("Cancelar");
		
		
		registros.setBounds(500, 250, 450, 600);
		registros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nombrelbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		nombrelbl.setBounds(85, 20, 300, 50);
		apellidoslbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		apellidoslbl.setBounds(85, 70, 300, 50);
		edadlbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		edadlbl.setBounds(115, 120, 300, 50);
		identificacionlbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		identificacionlbl.setBounds(50, 170, 300, 50);
		rollbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		rollbl.setBounds(125, 220, 300, 50);
		nacionalidadlbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		nacionalidadlbl.setBounds(55, 270, 300, 50);
		usuariolbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		usuariolbl.setBounds(95, 320, 300, 50);
		contrasenalbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		contrasenalbl.setBounds(70, 370, 300, 50);
		correolbl.setFont(new java.awt.Font("Arial", Font.BOLD, 16));
		correolbl.setBounds(20, 420, 300, 50);
		nombretxt.setBounds(180, 35, 150, 20);
		apellidostxt.setBounds(180, 85, 150, 20);
		edadtxt.setBounds(180, 135, 150, 20);
		identificaciontxt.setBounds(180, 185, 150, 20);
		roltxt.setBounds(180, 235, 150, 20);
		nacionalidadtxt.setBounds(180, 285, 150, 20);
		usuariotxt.setBounds(180, 335, 150, 20);
		contrasenatxt.setBounds(180, 385, 150, 20);
		correotxt.setBounds(180, 435, 150, 20);
		registrarbt.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		registrarbt.setBounds(50, 490, 100, 30);
		cancelarbt.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
		cancelarbt.setBounds(250, 490, 100, 30);
		
		
		//Agregar al panel
		panelR.add(cancelarbt);
		panelR.add(registrarbt);
		panelR.add(correotxt);
		panelR.add(contrasenatxt);
		panelR.add(usuariotxt);
		panelR.add(nacionalidadtxt);
		panelR.add(roltxt);
		panelR.add(identificaciontxt);
		panelR.add(edadtxt);
		panelR.add(apellidostxt);
		panelR.add(nombretxt);
		panelR.add(nombrelbl);
		panelR.add(apellidoslbl);
		panelR.add(edadlbl);
		panelR.add(identificacionlbl);
		panelR.add(rollbl);
		panelR.add(nacionalidadlbl);
		panelR.add(usuariolbl);
		panelR.add(contrasenalbl);
		panelR.add(correolbl);
		panelR.setLayout(null);
		registros.add(panelR);
		
		
		
		//Accion de Registro
		
		registrarbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		
				if((nombretxt.getText().isEmpty())||(apellidostxt.getText().isEmpty())||(edadtxt.getText().isEmpty())||(identificaciontxt.getText().isEmpty())||(roltxt.getText().isEmpty())||(nacionalidadtxt.getText().isEmpty())||(usuariotxt.getText().isEmpty())||(contrasenatxt.getText().isEmpty())||(correotxt.getText().isEmpty())) {
					
					JOptionPane.showMessageDialog(null, "Debe ingresar un Usuario no existente...","Alerta", JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					for (int a = 0; a<99; a++) {
						if(identificaciontxt.getText().equals(almacenar.usuarios[a][3])||(usuariotxt.getText().equals(almacenar.usuarios[a][6]))) {
							JOptionPane.showMessageDialog(null, "Usuario ya existente con esta ID","Alerta", JOptionPane.INFORMATION_MESSAGE);
							break;
						}else {
						
						JOptionPane.showMessageDialog(null, "Usuario Creado Con Exito","Creado", JOptionPane.INFORMATION_MESSAGE);
						almacenar.usuarios[contador][0] = nombretxt.getText();
						almacenar.usuarios[contador][1] = apellidostxt.getText();
						almacenar.usuarios[contador][2] = edadtxt.getText();
						almacenar.usuarios[contador][3] = identificaciontxt.getText();
						almacenar.usuarios[contador][4] = roltxt.getText();
						almacenar.usuarios[contador][5] = nacionalidadtxt.getText();
						almacenar.usuarios[contador][6] = usuariotxt.getText();
						almacenar.usuarios[contador][7] = contrasenatxt.getText();
						almacenar.usuarios[contador][8] = correotxt.getText();
						System.out.println(almacenar.usuarios[contador][0]);
							contador = contador + 1;
							registros.hide();
							ventana_Administrador admin = new ventana_Administrador();
							admin.Administrador.show();
							break;
							
						}
				}
				}
				
			}
		});
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		registro_empleado iniciar = new registro_empleado();
		iniciar.registros.show();
		
	}

}
