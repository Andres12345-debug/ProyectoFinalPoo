package controll;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;

public class Controller implements CustomEvent{
	//Declaración de variables
	private CustomEventRespons objetoRespuesta;
	private Operacion objetoOperacion;
	
	//Método Constructor
	public Controller(){
		objetoOperacion = new Operacion();
	}
	
	//Métodos propios
	@Override
	public void retornoClave(int clave, String usuario) {
		int  objetoRespuesta = objetoOperacion.realizarOperaciones(clave, usuario);
		
	}

	//Gets and Sets
	public CustomEventRespons getObjetoRespuesta() {
		return objetoRespuesta;
	}

	public void setObjetoRespuesta(CustomEventRespons objetoRespuesta) {
		this.objetoRespuesta = objetoRespuesta;
	}

	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}

}
