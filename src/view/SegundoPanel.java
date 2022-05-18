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
	private JLabel  etiquetaSexo;
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
	private JTextField contenidoIndeti;


	//variables ComboBox
	private JComboBox comboUno;
	private JComboBox comboDos;

	//variables para Boton
	private JButton botonUno;

	//custom Event
	private CustomEvent evento;

	//String o Int
	private String resultadoVista;
	
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
		etiquetaUno.setBounds(5, 60, 200, 50);
		etiquetaUno.setFont(fuenteDos);
		add(etiquetaUno);

		contenidoNombre = new JTextField("");
		contenidoNombre.setBounds(190, 80, 100, 20);
		
		add(contenidoNombre);

		etiquetaDos = new JLabel("DIGITA TU APELLIDO");
		etiquetaDos.setBounds(5, 30, 200, 200);
		etiquetaDos.setFont(fuenteDos);
		add(etiquetaDos);

		contenidoApellido = new JTextField();
		contenidoApellido.setBounds(190,120,100,20);
		add(contenidoApellido);
		
		etiquetaSexo = new JLabel("DIGITA TU SEXO");
		etiquetaSexo.setBounds(5, 70, 200, 200);
		etiquetaSexo.setFont(fuenteDos);
		add(etiquetaSexo);

		contenidoSexo = new JTextField();
		contenidoSexo.setBounds(190,160,100,20);
		add(contenidoSexo);

		etiquetaIdenti = new JLabel("DIGITA TU IDENTIFICACION");
		etiquetaIdenti.setBounds(5, 110, 200, 200);
		etiquetaIdenti.setFont(fuenteDos);
		add(etiquetaIdenti);

		contenidoIndeti = new JTextField();
		contenidoIndeti.setBounds(190,200,100,20);
		add(contenidoIndeti);

		etiquetaNiños = new JLabel("CANTIDAD MANILLAS NIÑOS");
		etiquetaNiños.setBounds(5,150,200,200);
		etiquetaNiños.setFont(fuenteDos);
		add(etiquetaNiños);

        comboUno=new JComboBox<String>();
		comboUno.setBounds(220,240,80,20);

		comboUno.addItem("Seleccione");
		comboUno.addItem("Una");
		comboUno.addItem("Dos");
		comboUno.addItem("Tres");
		comboUno.addItem("Cuatro");
		comboUno.addItem("Cinco");
		comboUno.addActionListener(this);
		add(comboUno);

		etiquetaMayores = new JLabel("CANTIDAD MANILLAS MAYORES");
		etiquetaMayores.setBounds(5,190,400,200);
		etiquetaMayores.setFont(fuenteDos);
		add(etiquetaMayores);

		comboDos=new JComboBox<String>();
		comboDos.setBounds(220,280,80,20);

		comboDos.addItem("Seleccione");
		comboDos.addItem("Una");
		comboDos.addItem("Dos");
		comboDos.addItem("Tres");
		comboDos.addItem("Cuatro");
		comboDos.addItem("Cinco");
		comboDos.addActionListener(this);
		add(comboDos);

		botonUno = new JButton("IMPRIMIR");
		botonUno.setBackground(Color.cyan);
		botonUno.setBounds(300,350,100,40);
		botonUno.setActionCommand("Primer Boton");
		botonUno.addActionListener(this);
		add(botonUno);
		
		//es una prueba
		resultado = new JLabel("Su resultado Es: ");
		resultado.setBounds(8, 220, 200, 50);
		add(resultado);
}

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

	public void mostrarResultadoDos(String resultado) {
		resultadoVista = (resultado);	
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
		JOptionPane.showMessageDialog(null, "Click");
		PrimerPanel segundaPestaña = new PrimerPanel();
        Pestana.add("Pestaña2", segundaPestaña);
        Pestana.setSelectedComponent(segundaPestaña);
		Pestana.setseleccion(segundaPestaña);
	
		String nombre = (contenidoNombre.getText());
		String apellido =(contenidoApellido.getText());
		evento.retornarImpresionPersonas(nombre, apellido);
		resultado.setText(resultadoVista);

		contenidoNombre.setText(" ");
		contenidoApellido.setText(" ");
	}

	public void mostrarResultadoRegistro(String nombre, String apellido) {
		String resultadoVista = nombre.toString() + apellido.toString();;
	}

		
}

	

	

