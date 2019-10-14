package sanchez.jay.ejercicios1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculoAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este programa calcula el area de diversas figuras \n"
				+ "Para saber que figura se debe de calcular, seleccione el numero que corresponda \n"
				+ "1.- Cuadrado \n"
				+ "2.- Rectangulo \n"
				+ "3.- Triangulo \n"
				+ "4.- Circulo");
		int figura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion"));
		
		Scanner entrada = new Scanner(System.in);	

		switch (figura) {
		case 1:
			System.out.println("Introduce la longitud del lado");
			double lado = entrada.nextDouble();
			System.out.println("El area de la figura es " + lado*lado);
			break;
		case 2:
			System.out.println("Introduce la longitud del lado");
			double ladoRec = entrada.nextDouble();
			System.out.println("El area del rectangulo es " + ladoRec*ladoRec);
			break;
		case 3:
			System.out.println("Introduce la base del triangulo");
			double base = entrada.nextDouble();
			System.out.println("Introduce la altura del triangulo");
			double altura = entrada.nextDouble();
			System.out.println("El area del triangulo es " + base*altura/2);
			break;
		case 4:
			System.out.println("Introduce el radio del circulo");
			double radio = entrada.nextDouble();
			System.out.println("El area del circulo es \n");
			System.out.printf("%1.0f", Math.PI*Math.pow(radio, 2));
			break;
		default:
			System.out.println("No se encontraron figuras relacionadas a la opcion");
		}
	}

}
