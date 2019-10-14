package sanchez.jay.pooAbstractas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Temporizador oyente = new Temporizador();
		Timer temporizador = new Timer(5000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola alumnos");
			}});
		temporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
	}

}

	//Para evitar toda esta implementacion de codigo, se utiliza una clase anonima, que es una clase sin nombre
	// y que por lo general se implementa dentro de una clase, por lo que tambien es clase interna
 /*class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Hola alumnos");
	} */
	
//}