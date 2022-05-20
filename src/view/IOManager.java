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
		pestanas = new JTabbedPane();
		pestanas.add("Log In", ((PrimerPanel)panelUno));
		add(pestanas);

		
		panelDos = new SegundoPanel();
		((SegundoPanel)panelDos).setEvento(objetoControlador);
		pestanas.add("ACCESO", ((SegundoPanel)panelDos));
		pestanas.setEnabledAt(pestanas.indexOfComponent(panelDos),false);
		add(pestanas);
		
		panelTres= new TercerPanel();
		//((TercerPanel)panelTres).setEvento(objetoControlador);
		pestanas.add("TIENDA//QUIOSCO", ((TercerPanel)panelTres));
		add(pestanas);

		panelCuatro = new CuartoPanel();
		//((CuartoPanel)panelCuatro).setEvento(objetoControlador);
		pestanas.add("CIERRE CAJA", ((CuartoPanel)panelCuatro));
		add(pestanas);
	}

	//Métodos propios

	@Override
	public void respuestaResultadoLogIn(boolean resultadoLogIn) {
		((PrimerPanel)panelUno).mostrarResultadoLogIn(resultadoLogIn);
		if(resultadoLogIn == true) {
			pestanas.setEnabledAt(pestanas.indexOfComponent(panelDos),true);
		} else{
			pestanas.setEnabledAt(pestanas.indexOfComponent(panelDos),false);
		}
	}

	@Override
	public void respuestaRegistroPersonas(String resultadoImpresion) {
		((SegundoPanel)panelDos).mostrarResultadoRegistro(resultadoImpresion);
		
	}

}



	


	






	

