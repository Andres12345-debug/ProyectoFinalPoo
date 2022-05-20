package controll;

import javax.swing.JOptionPane;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;

public class Controller implements CustomEvent{
	//Declaración de variables
	private Operacion objetoOperaciones;
	private CustomEventRespons eventoRespuesta;
	
	//Método Constructor
	public Controller(){
		objetoOperaciones = new Operacion();
	}
	
	//Métodos propios
	@Override
	public void retornarLogIn(String usuario, String contrasenia) {
		//System.out.println("Estoy en el controlador");
		boolean resultadoLogIn = objetoOperaciones.validarDatos(usuario, contrasenia);
		//System.out.println(resultadoLogIn);
		eventoRespuesta.respuestaResultadoLogIn(resultadoLogIn);
	}

	@Override
	public void retornarImpresionPersonas(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos) {
		String resultadoImpresion = objetoOperaciones.realizarValidacionRegistro(nombre, apellido, sexo, identificacion, cantidadNinos, cantidadAdultos);
		//System.out.println(resultadoImpresion);
		eventoRespuesta.respuestaRegistroPersonas(resultadoImpresion);
		JOptionPane.showMessageDialog(null, resultadoImpresion);
	}

	//Gets and Sets
	public CustomEventRespons getEventoRespuesta() {
		return eventoRespuesta;
	}

	public void setEventoRespuesta(CustomEventRespons eventoRespuesta) {
		this.eventoRespuesta = eventoRespuesta;
	}

	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}

}
