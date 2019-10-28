package sanchez.jay.excepciones;

import javax.swing.JOptionPane;

public class EjercicioExcepcion1 {
	public static void main(String[] args) {
		
		try {			
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese algun numero para determinar si es par o impar"));		
			if(numero%2>0) {
				JOptionPane.showMessageDialog(null, "El numero es impar");
			}else {
				JOptionPane.showMessageDialog(null, "El numero es par");
			}
		} catch(RuntimeException e) {
			JOptionPane.showMessageDialog(null, "El dato ingresado no es un numero");
			
		}
	}

}
