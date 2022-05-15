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
import javax.swing.JScrollPane;
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
	private Font fuenteNombre;

	//Botones
	private JButton botonUno;
	
	//Eventos
	private CustomEvent evento;
	
	//Variables
	private String resultadoVista;
	
	//Método Constructor
	public PrimerPanel() {
		fuente = new Font("Times New Roman",Font.BOLD,33);
		fuenteNombre = new Font("Times New Roman",Font.BOLD,15);
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("REGISTRO"));

		etiquetaUno = new JLabel("LOG DE ACCESO ADMINISTRATIVO");
		etiquetaUno.setBounds(50, 50, 600, 90);
		etiquetaUno.setFont(fuente);
		add(etiquetaUno);
		
		etiquetaDos = new JLabel("ESCRIBE TU USARIO");
		etiquetaDos.setBounds(255, 120, 600, 90);
		etiquetaDos.setFont(fuenteNombre);
		add(etiquetaDos);
		
		contenidoPreguntaAdmin = new JTextField();
		contenidoPreguntaAdmin.setBounds(250, 180, 160, 30);
		add(contenidoPreguntaAdmin);
		
		etiquetaTres = new JLabel("ESCRIBE TU CONTRASE�A");
		etiquetaTres.setBounds(255, 200, 600, 90);
		etiquetaTres.setFont(fuenteNombre);
		add(etiquetaTres);
		
		contenidoClaveAdmin = new JTextField();
		contenidoClaveAdmin.setBounds(250, 280, 160, 30);
		add(contenidoClaveAdmin);
		
		botonUno = new JButton("INGRESAR");
		botonUno.setBackground(Color.WHITE);
		botonUno.setBounds(270,360,100,40);
		botonUno.setActionCommand("Primer Boton");//pa que haga alguna monda
		botonUno.addActionListener(this);
		add(botonUno);
		
		resultado = new JLabel("Su resultado Es: ");
		resultado.setBounds(8, 90, 200, 50);
		add(resultado);	
	}
	
	//Métodos propios
	//Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		try {
			ImagenDos = ImageIO.read(new File("C:\\Users\\Acer\\Desktop\\uni\\programacion\\Proyecto final\\EsteSi.jpg"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "IMAGEN NO ENCONTRADA ");
		}
		g.drawImage(ImagenDos, 0, 0, null);//movemos imagen
	}

	//metodo para resultado al ingresar los datos
	public void mostrarResultado(int clave) {
		resultadoVista = Integer.toString(clave);
	}
	
	public CustomEvent getEvento() {
		return evento;
	}

	public void setEvento(CustomEvent evento) {
		this.evento = evento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int clave = Integer.parseInt(contenidoClaveAdmin.getText());
		String usuario = (contenidoPreguntaAdmin.getText());
		
		resultado.setText(resultadoVista);
		evento.retornoClave(clave,usuario);
		resultado.enable();
		
		contenidoClaveAdmin.setText("");
		contenidoPreguntaAdmin.setText("");
	
		if(e.getSource() == botonUno) {	
			JOptionPane.showMessageDialog(botonUno, "funciona");
		}
			
		JOptionPane.showMessageDialog(null, "asd");
	}

}
