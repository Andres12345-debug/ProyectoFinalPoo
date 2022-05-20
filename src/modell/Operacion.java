package modell;
import view.PrimerPanel;
//import view.Prueba;
import view.SegundoPanel;

import javax.lang.model.util.SimpleTypeVisitor14;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

/*
 * Autor: Iván Monsalve | Julián Montañez
 * Descripción: Componente gráfico SwimSoft
 * Fecha: 14/05/22
 */
public class Operacion {
	//Declaracion de variables 
	Boolean resultadoLogIn;
	
	//private Prueba panelPrueba;
	private JPanel panelUno;
	private String resultado;

	//Método Constructor
	public Operacion() {
		panelUno = new PrimerPanel();
		resultadoLogIn = false;
 	}

	//Métodos propios
	public Boolean validarDatos(String usuario, String contraseña) {
		if(usuario == "admin" && contraseña == "admin123") {
			resultadoLogIn = true;
		} else {
			resultadoLogIn = false;
		}
		return resultadoLogIn;
	}

	public String realizarValidacion(String nombre, String apellido){

		resultado = "prueba funciona"+nombre+apellido;

		return resultado;

	}
	
}





