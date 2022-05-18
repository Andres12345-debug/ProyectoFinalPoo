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
	private Boolean resultadoLogIn;
	private String caracterUsuario;
	private String caracterContraseña;
	
	//private Prueba panelPrueba;
	private JPanel panelUno;
	private String resultado;

	//Método Constructor
	public Operacion() {
		panelUno = new PrimerPanel();
		resultadoLogIn = false;
		caracterUsuario = "admin";
		caracterContraseña = "admin123";
 	}

	//Métodos propios
	public boolean validarDatos(String usuario, String contraseña) {
		if(usuario.equals(caracterUsuario) == true && contraseña.equals(caracterContraseña) == true) {
			resultadoLogIn = true;
		} else {
			resultadoLogIn = false;
		}
		return resultadoLogIn;
	}

	public String realizarValidacion(String nombre, String apellido){
		resultado = "asd"+nombre+apellido;
		return resultado;
	}
	
}





