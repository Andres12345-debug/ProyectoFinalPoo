package view;

import java.awt.*;
import javax.swing.*;

import controll.Controller;

/*
 * Autor: Iván Monsalve | Julián Montañez
 * Descripción: Componente gráfico SwimSoft
 * Fecha: 14/05/22
 */

public class IOManager extends JFrame implements CustomEventRespons {
	
	//Declaración de Variables
	private PrimerPanel panelUno;
	private SegundoPanel panelDos;
	private TercerPanel panelTres;
	private CuartoPanel panelCuatro;
	private JTabbedPane pestanas;
	private JPanel panelPrueba;
	
	//Método Constructor
	public IOManager() {


		
		Controller objetoControlador = new Controller();
        objetoControlador.setObjetoRespuesta(this);
	

		panelPrueba = new Prueba();
		((Prueba)panelPrueba).setEvento(objetoControlador);
		panelPrueba.setBounds(15, 5, 360,340);
		add(panelPrueba);

		
		setResizable(false);
		setTitle("PROYECTO PISCINA 1.1");
		setSize(700,600);
		setLocationRelativeTo(null); 

		pestanas = new JTabbedPane();
		panelUno = new PrimerPanel();
		


		panelDos = new SegundoPanel();
		panelTres= new TercerPanel();
		panelCuatro = new CuartoPanel();
		
		pestanas.add("Log In", new PrimerPanel());
		add(pestanas);	
		pestanas.add("panelDos", new SegundoPanel());
		add(pestanas);	
		//((PrimerPanel)panelUno).setEvento(objetoControlador);
		

	}

	@Override
	public void respuesta(int resultado) {
		((Prueba)panelPrueba).mostrarResultado(resultado);
		
		
		
	
}
}
