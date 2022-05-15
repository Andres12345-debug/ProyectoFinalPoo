package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prueba extends JPanel  implements ActionListener{
    //declaracion de variables
	private JLabel etiquetaUno;
    private JTextField contenido;
   
    private JLabel resultado;
    private CustomEvent evento;
    private String resultadoVista;
    private JButton respuesta;
    
    public Prueba(){

        resultadoVista = " ";
        setLayout(null);
		//borde
		setBorder(BorderFactory.createTitledBorder("R"));

		//para que funcione etiqueta
		setLayout(null);
		etiquetaUno = new JLabel("Contraseña: ");
		etiquetaUno.setBounds(309,154,80,20);//ubicar en pantalla datos que se le piden al usuario
		add(etiquetaUno);

        contenido = new JTextField();
		contenido.setBounds(230, 80, 60,20 );
		add(contenido);

        

        resultado = new JLabel("Contraseña: : ");
		resultado.setBounds(10, 90, 200, 50);
		add(resultado);

        //boton para que de el resultado

		respuesta = new JButton("RESULTADO");
		respuesta.setBackground(Color.RED);
		respuesta.setBounds(15,70,120,20);
		respuesta.setActionCommand("Primer Boton");
		respuesta.addActionListener(this);
		add(respuesta);


    }
    public void mostrarResultado(int resultado) {
		
		resultadoVista = Integer.toString(resultado);
		
		
	}

    public CustomEvent getEvento() {
        return evento;
    }

    public void setEvento(CustomEvent evento) {
        this.evento = evento;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int primerNumero = Integer.parseInt(contenido.getText());
		

        evento.retornoSuma(primerNumero);
		resultado.setText(resultadoVista);
		resultado.enable();
		contenido.setText(" ");
		
        // TODO Auto-generated method stub
        
    }

}
