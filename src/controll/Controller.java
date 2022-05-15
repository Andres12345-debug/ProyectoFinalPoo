package controll;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;

public class Controller implements CustomEvent{
	//Declaración de variables
	
	private CustomEventRespons objetoRespuesta;
	Operacion objetoOperacion = new Operacion();

	
	//Método Constructor
	public Controller(){
		
	}
	
	//Métodos propios
	public CustomEventRespons getObjetoRespuesta() {
		return objetoRespuesta;
	}

	public void setObjetoRespuesta(CustomEventRespons objetoRespuesta) {
		this.objetoRespuesta = objetoRespuesta;
	}


	

	

		
	

	@Override
	public void retornoSuma(int primerNumero) {

		// TODO Auto-generated method stub
		int respuestaModelo = objetoOperacion.realizacionOperaciones(primerNumero );

		objetoRespuesta.respuesta(respuestaModelo);
		// TODO Auto-generated method stub
		
	}

	//Método main
	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);
	}
	
	

}
