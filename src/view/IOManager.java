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

	private Controller objetoControlador;
	
	//Método Constructor
	public IOManager() {
		objetoControlador = new Controller();
       //con esto comunicamos los objetos en el modelo
		objetoControlador.setEventoRespuesta(this);

		setResizable(false);
		setTitle("SWIMSOFT 1.0");
		setSize(700,600);
		setLocationRelativeTo(null);

		pestanas = new JTabbedPane();
		panelUno = new PrimerPanel();
		((PrimerPanel)panelUno).setEvento(objetoControlador);
		
		panelDos = new SegundoPanel();
		((SegundoPanel)panelDos).setEvento(objetoControlador);
		panelTres= new TercerPanel();

		panelCuatro = new CuartoPanel();

		
		pestanas.add("Log In", new PrimerPanel());
		add(pestanas);

		pestanas.add("ACCESO", new SegundoPanel());
		add(pestanas);	

		pestanas.add("TIENDA//QUIOSCO", new TercerPanel());
		add(pestanas);

		pestanas.add("CIERRE CAJA", new CuartoPanel());
		add(pestanas);



	}


	//Métodos propios
	@Override
	public void respuestaResultadoLogIn(boolean resultadoLogIn) {
		((PrimerPanel)panelUno).mostrarResultadoLogIn(resultadoLogIn);
		//System.out.println("El resultado de la suma está en la vista " + resultadoSuma);
	}


	@Override
	public void respuestaPanelDos(String resultado) {
		((SegundoPanel)panelDos).mostrarResultadoDos(resultado);
	
		// TODO Auto-generated method stub
		
	}


	


	


	


	}




	

