package sanchez.jay.ejercicios1;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para factorizar"));
		int resultado = 1;
		for(int i = dato+1; i>1; i--) {
			resultado *= (i-1);
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
