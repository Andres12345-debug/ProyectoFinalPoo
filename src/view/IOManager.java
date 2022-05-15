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
	
	//Método Constructor
	public IOManager() {
		setTitle("PROYECTO PISCINA 1.1");
		setSize(700,600);
		setLocationRelativeTo(null); 

		pestanas = new JTabbedPane();
		panelUno = new PrimerPanel();
		panelDos = new SegundoPanel();
		panelTres= new TercerPanel();
		panelCuatro = new CuartoPanel();
		
		pestanas.add("Panel LOG", new PrimerPanel());
		add(pestanas);	
		pestanas.add("panelDos", new SegundoPanel());
		add(pestanas);	

	}

	@Override
	public void respuesta(int clave) {
		((PrimerPanel)panelUno).mostrarResultado(clave);
		
	}
	
}
