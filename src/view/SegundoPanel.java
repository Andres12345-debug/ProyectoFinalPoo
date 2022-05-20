package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


import java.awt.Image;

public class SegundoPanel extends JPanel implements ActionListener {
	
	//JTabbet
	private JTabbedPane pestana;

	//variables etiquetas
	private JLabel etiquetaUno;
	private JLabel etiquetaDos;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaSexo;
	private JLabel etiquetaIdenti;
	private JLabel etiquetaNiños;
	private JLabel etiquetaMayores;
	private JLabel resultado;
 
	private Image ImagenDos;

	//variables fuentes
	//Fuentes
	private Font fuente;
	private Font fuenteDos; 

	//variables contenidos
	private JTextField contenidoNombre;
	private JTextField contenidoApellido;
	private JTextField contenidoSexo;
	private JTextField contenidoIdentificacion;
	private JTextField contenidoManillasNinos;
	private JTextField contenidoManillasAdultos;
	
	//variables para Boton
	private JButton botonUno;

	//custom Event
	private CustomEvent evento;

	//String o Int
	private String resultadoVista;
	
	//Método Constructor
	public SegundoPanel() {
		resultadoVista = " ";
		setLayout(null);

		fuente = new Font("Berlin Sans FB", Font.BOLD, 20);
		fuenteDos = new Font("Berlin Sans FB", Font.BOLD, 13);

		etiquetaTitulo = new JLabel("BIENVENIDO");
		etiquetaTitulo.setBounds(300, 10, 200, 50);
		etiquetaTitulo.setFont(fuente);
		etiquetaTitulo.setForeground(java.awt.Color.decode("#0B2B7C"));
		add(etiquetaTitulo);

		etiquetaUno = new JLabel("DIGITA TU NOMBRE");
		etiquetaUno.setBounds(50, 60, 200, 50);
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		contenidoNombre = new JTextField("");
		contenidoNombre.setBounds(350, 80, 180, 20);
		
		add(contenidoNombre);

		etiquetaDos = new JLabel("DIGITA TU APELLIDO");
		etiquetaDos.setBounds(50, 30, 200, 200);
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		contenidoApellido = new JTextField();
		contenidoApellido.setBounds(350, 120, 180, 20);
		add(contenidoApellido);
		
		etiquetaSexo = new JLabel("DIGITA TU SEXO");
		etiquetaSexo.setBounds(50, 70, 200, 200);
		etiquetaSexo.setFont(fuenteDos);
		add(etiquetaSexo);

		contenidoSexo = new JTextField();
		contenidoSexo.setBounds(350, 160, 180, 20);
		add(contenidoSexo);

		etiquetaIdenti = new JLabel("DIGITA TU IDENTIFICACION");
		etiquetaIdenti.setBounds(50, 110, 200, 200);
		etiquetaIdenti.setFont(fuenteDos);
		add(etiquetaIdenti);

		contenidoIdentificacion = new JTextField();
		contenidoIdentificacion.setBounds(350, 200, 180, 20);
		add(contenidoIdentificacion);

		etiquetaNiños = new JLabel("CANTIDAD MANILLAS NIÑOS");
		etiquetaNiños.setBounds(50, 150, 280, 200);
		etiquetaNiños.setFont(fuenteDos);
		add(etiquetaNiños);

		contenidoManillasNinos = new JTextField();
		contenidoManillasNinos.setBounds(350, 240, 180, 20);
		add(contenidoManillasNinos);

		etiquetaMayores = new JLabel("CANTIDAD MANILLAS MAYORES");
		etiquetaMayores.setBounds(50, 190, 400, 200);
		etiquetaMayores.setFont(fuenteDos);
		add(etiquetaMayores);

		contenidoManillasAdultos = new JTextField();
		contenidoManillasAdultos.setBounds(350, 280, 180, 20);
		add(contenidoManillasAdultos);

		botonUno = new JButton("IMPRIMIR");
		botonUno.setBackground(Color.cyan);
		botonUno.setBounds(300,350,100,40);
		botonUno.setActionCommand("Primer Boton");
		botonUno.addActionListener(this);
		add(botonUno);
	}

	//Métodos Propios
	public void mostrarResultadoRegistro(String resultadoImpresion) {
		String resultadoVista = resultadoImpresion.toString();
	}

	//Gráficos de imagen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//exception  controlan el entorno
		g.setColor(Color.BLACK);//repintar la pantalla g
		g.drawLine(5, 900, 120, 20);//linea g
		g.setColor(Color.yellow);
		g.drawRect(30, 30, 100, 30);//rectangulo g 
		try {
			//ImagenDos = ImageIO.read(new File("C:\\Users\\Acer\\Desktop\\uni\\programacion\\Proyecto final\\panelDos.jpg"));
			ImagenDos = ImageIO.read(new File("C:\\Users\\ivan\\Downloads\\PanelDos.jpeg"));
			super.paintComponent(g);//herencia para poner color en g
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "IMAGEN NO ENCONTRADA ");
		}
		g.drawImage(ImagenDos, 0, 0, null);//movemos imagen
	}

	//Gets and Sets 
	public CustomEvent getEvento() {
		return evento;
	}

	public void setEvento(CustomEvent evento) {
		this.evento = evento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "Click");
		PrimerPanel segundaPestaña = new PrimerPanel();
        Pestana.add("Pestaña2", segundaPestaña);
        Pestana.setSelectedComponent(segundaPestaña);
		Pestana.setseleccion(segundaPestaña);
	
		String nombre = (contenidoNombre.getText());
		String apellido =(contenidoApellido.getText());
		String sexo = (contenidoNombre.getText());
		String identificacion = (contenidoApellido.getText());
		int cantidadNinos = Integer.parseInt(contenidoManillasNinos.getText());
		int cantidadAdultos = Integer.parseInt(contenidoManillasAdultos.getText());

		evento.retornarImpresionPersonas(nombre, apellido, sexo, identificacion, cantidadNinos, cantidadAdultos);

		contenidoNombre.setText(" ");
		contenidoApellido.setText(" ");
		contenidoSexo.setText(" ");
		contenidoIdentificacion.setText(" ");
		contenidoManillasNinos.setText(" ");
		contenidoManillasAdultos.setText(" ");
	}
	
}

	

	

