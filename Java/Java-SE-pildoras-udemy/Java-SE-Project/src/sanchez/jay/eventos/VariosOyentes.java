package sanchez.jay.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {

		Marco_Principal mimarco=new Marco_Principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);	

	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal(){
		
		setTitle("Múltiples oyentes");
		
		setBounds(1300,100,300,200);
		
		Lamina_Principal lamina=new Lamina_Principal();
		
		add(lamina);
	}	
	
}

class Lamina_Principal extends JPanel{
	
	JButton boton_cerrar;
	
	public Lamina_Principal(){
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar todo");
		
		boton_nuevo.addActionListener(new CreaMarco());
		add(boton_cerrar);	
				
	}		
	
	private class CreaMarco implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			MarcoNuevo miMarco = new MarcoNuevo(boton_cerrar);
			miMarco.setVisible(true);
		}
		
	}
	
}

class MarcoNuevo extends JFrame{
	
	private static int contador=0;
	
	public MarcoNuevo(JButton boton) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(50*contador, 50* contador, 200, 200);
		boton.addActionListener(new CierraTodos());
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			
		}
		
	}
}