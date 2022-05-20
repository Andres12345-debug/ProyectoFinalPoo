package controll;

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
	public void retornarLogIn(String usuario, String contraseña) {
		Boolean resultadoLogIn = objetoOperaciones.validarDatos(usuario, contraseña);
		eventoRespuesta.respuestaResultadoLogIn(resultadoLogIn);
	}

	//Gets and Sets
	public CustomEventRespons getEventoRespuesta() {
		return eventoRespuesta;
	}

	public void setEventoRespuesta(CustomEventRespons eventoRespuesta) {
		this.eventoRespuesta = eventoRespuesta;
	}
	@Override
	public void retornoImpresion(String nombre, String apellido) {
		String respuestaModelo = objetoOperaciones.realizarValidacion(nombre, apellido);
		eventoRespuesta.respuestaPanelDos(respuestaModelo);

		// TODO Auto-generated method stub
		
	}


	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}

	
}
