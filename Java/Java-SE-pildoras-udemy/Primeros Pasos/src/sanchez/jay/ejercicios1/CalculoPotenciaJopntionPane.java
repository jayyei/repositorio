package sanchez.jay.ejercicios1;

import javax.swing.JOptionPane;

public class CalculoPotenciaJopntionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduza la base del numero"));
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponencial del numero"));
		double resultado = Math.pow(base, potencia);
		System.out.println("El numero " + base + " elevado a la " + potencia + " da como resultado " + resultado);
	}

}
