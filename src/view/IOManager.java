package view;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controll.Controller;



public class IOManager extends JFrame implements CustomEventRespons{

	PrimerPanel panelUno;
	SegundoPanel panelDos;
	TercerPanel panelTres;
	CuartoPanel panelCuatro;
	JTabbedPane pestanas;
	
	
	public IOManager() {
		
		setTitle("PROYECTO PISCINA 1.1");
		setSize(700,600);
		
		setLocationRelativeTo(null); 
		
		
	
		iniciarComponentes();
		
	
		
		
		
		
	}
	private void iniciarComponentes() {
		
		
		pestanas = new JTabbedPane();
		panelUno = new PrimerPanel();
		
		
		
		panelDos = new SegundoPanel();
		panelTres= new TercerPanel();
		
		panelCuatro = new CuartoPanel();
		
		pestanas.add("Panel LOG", new PrimerPanel());
		
//		pesta�as.add("panel Dos", new SegundoPanel());
		
		
		
		add(pestanas);
		
		
		
		
		
	}
	@Override
	public void respuesta(int clave) {
		((PrimerPanel)panelUno).mostrarResultado(clave);
		// TODO Auto-generated method stub
		
	}
	
}
