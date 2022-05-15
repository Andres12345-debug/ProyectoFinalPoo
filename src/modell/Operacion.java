package modell;
import view.PrimerPanel;
import view.Prueba;
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

	int resultado ;
	private Prueba panelPrueba;
	private JPanel panelUno;

	//Método Constructor
	public Operacion() {
		panelUno = new PrimerPanel();
		panelPrueba = new Prueba();

		
		


 	}

	//Métodos propios
	
	
	
	public int realizacionOperaciones(int numeroUno) {
	
		int contraseñaValidad = 123;
		if(numeroUno == contraseñaValidad){
	
        PrimerPanel pn = new PrimerPanel();
		
		
		pn.setVisible(true);
		dispose();
		
			JOptionPane.showMessageDialog(null, "Tu contraseña es correcta");
				
				//asd
				
				

				
				

				
				
		
				
				
				
	
	
	
			}else{
	
				JOptionPane.showMessageDialog(null, "Tu contraseña es Incorrecta");
				
	
			}
		
		
		
		
		return numeroUno;
	}

	private void dispose() {
	}
	}





