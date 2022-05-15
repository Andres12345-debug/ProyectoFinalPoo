package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controll.Controller;
/*
 * Autor: Iván Monsalve | Julián Montañez
 * Descripción: Componente gráfico SwimSoft
 * Fecha: 14/05/22
 */
public class PrimerPanel extends JPanel implements ActionListener {
	//Declaración de Variables
	//Imágenes
	private Image ImagenDos;

	//Etiquetas
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTres;
	private JLabel resultado;//es una prueba
	
	//Cajas de texto
	private JTextField contenidoPreguntaAdmin;
	private JTextField contenidoClaveAdmin;

	//Fuentes
	private Font fuente;
	private Font fuenteDos;

	//Botones
	private JButton botonUno;
	
	//Eventos
	private CustomEvent evento;
	private CustomEvent eventoDos;
	//Variables
	private String resultadoVista;
	
	//Método Constructor
	public PrimerPanel() {
		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 16);
		setLayout(null);

		etiquetaUno = new JLabel("INICIAR SESIÓN");
		etiquetaUno.setBounds(30, 20, 600, 90);
		etiquetaUno.setFont(fuente);
		add(etiquetaUno);
		
		etiquetaDos = new JLabel("Usuario:");
		etiquetaDos.setBounds(45, 120, 600, 90);
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);
		
		contenidoPreguntaAdmin = new JTextField();
		contenidoPreguntaAdmin.setBounds(45, 180, 160, 30);
		add(contenidoPreguntaAdmin);
		
		etiquetaTres = new JLabel("Contraseña:");
		etiquetaTres.setBounds(45, 200, 600, 90);
		etiquetaTres.setFont(fuenteDos);
		add(etiquetaTres);
		
		contenidoClaveAdmin = new JTextField();
		contenidoClaveAdmin.setBounds(40, 280, 160, 30);
		add(contenidoClaveAdmin);
		
		botonUno = new JButton("Ingresar");
		botonUno.setBackground(Color.WHITE);
		botonUno.setBounds(45,350,100,40);
		botonUno.setFont(fuenteDos);
		botonUno.addActionListener(this);
		botonUno.setActionCommand("Primer Boton");//pa que haga alguna monda	
		add(botonUno);
		
		resultado = new JLabel("Su resultado Es: ");
		resultado.setBounds(8, 90, 200, 50);
		add(resultado);	
	}
	
	//Métodos propios
	public void probar(){
	


		





	}
	//Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("C:\\Users\\Acer\\Desktop\\uni\\programacion\\Proyecto final\\Swim.jpg"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "IMAGEN NO ENCONTRADA ");
		}
		g.drawImage(ImagenDos, 0, 0, null);//movemos imagen
	}

	//metodo para resultado al ingresar los datos
	public void mostrarResultado(int resultado) {
		resultadoVista = Integer.toString(resultado);
	}
	public void mostrarResultadoUsuario(String resultadoUsuario){

		resultadoVista = (resultadoUsuario);
	}
	
	//Gets and Sets
	public CustomEvent getEvento() {
		return evento;
	}

	public void setEvento(CustomEvent evento) {
		this.evento = evento;
	}

	//Gets and Sets
	public CustomEvent getEventoDos() {
		return evento;
	}

	public void setEventoDos(CustomEvent eventoDos) {
		this.eventoDos = eventoDos;
	}

	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		probar();
		
		int clave = Integer.parseInt(contenidoClaveAdmin.getText());
		String usuario = (contenidoPreguntaAdmin.getText());
		
		
		resultado.setText(resultadoVista);
		
		resultado.enable();
		
		contenidoClaveAdmin.setText("");
		contenidoPreguntaAdmin.setText("");
		

	}

	
		
}



