package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
		
		if (edad >=18) {
			String carnet = JOptionPane.showInputDialog("Tienes licencia de conducir ?");
			
			if ( carnet.contentEquals("si")) {
				JOptionPane.showMessageDialog(null, "Eres apto para comprar un carro");
			}else {
				JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Como eres menor de edad no puedes tener un carro");
		}

	}

}
