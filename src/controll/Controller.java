package controll;

import modell.Operacion;
import view.CustomEvent;
import view.CustomEventRespons;
import view.IOManager;

public class Controller implements CustomEvent{
	
	//crear objeto respuesta
	private CustomEventRespons objetoRespuesta;
	
	Operacion objetoModelo = new Operacion();
	
	
	public CustomEventRespons getObjetoRespuesta() {
		return objetoRespuesta;
	}

	public void setObjetoRespuesta(CustomEventRespons objetoRespuesta) {
		this.objetoRespuesta = objetoRespuesta;
	}

	public void init() {
		IOManager objetoIOManager = new IOManager();
		objetoIOManager.setVisible(true);

		
		
		
	}

	@Override
	public void retornoClave(int clave, String usuario) {
		int  objetoRespuesta = objetoModelo.realizarOperaciones(clave, usuario);
//		objetoRespuesta.respuesta(objetoRespuesta);
		// TODO Auto-generated method stub
		
	}

	

}
