package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SegundoPanel extends JPanel implements ActionListener {

	private JLabel etiquetaUno;
	
	public SegundoPanel() {
		etiquetaUno = new JLabel("DIGITA TU NOMBRE");
		etiquetaUno.setBounds(8, 10, 200, 50);
		add(etiquetaUno);


		
		
	}
	
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
