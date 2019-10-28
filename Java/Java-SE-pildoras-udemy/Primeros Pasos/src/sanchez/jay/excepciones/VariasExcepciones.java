package sanchez.jay.excepciones;

import javax.swing.JOptionPane;

public class VariasExcepciones {
	
	public static void main(String[] args) {
		try {
			division();
		}catch(ArithmeticException e) {  //Para capturar varias excepciones se deben enlazar varias catch
			System.out.println("Se ha producido un error de tipo aritmetico");
		}catch(NumberFormatException e) {
			//System.out.println("Haz introducido un valor numerico no valido");
			System.out.println("Se ha lanzado una excepcion de tipo " + e.getClass().getName());
		}
	}
	
	static void division() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		System.out.println("El resultado es " + num1/num2);
	}

}
