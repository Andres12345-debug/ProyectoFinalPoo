package modell;

/*
 * Autor: Iván Monsalve | Julián Montañez
 * Descripción: Componente gráfico SwimSoft
 * Fecha: 14/05/22
 */
public class Operacion {
	//Declaracion de variables 
	private int resupuestaClave;

	//Método Constructor
	public Operacion() {
		
	}

	//Métodos propios
	public int realizarOperaciones(int clave,String usuario) {
		if(clave == 1) {
			System.out.println("Funciono");
		}
		return clave;
	}

}
