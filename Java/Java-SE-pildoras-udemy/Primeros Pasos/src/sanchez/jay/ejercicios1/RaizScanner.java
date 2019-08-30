package sanchez.jay.ejercicios1;

import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero para la raiz");
		double valor =entrada.nextDouble();
		System.out.println("La raiz cuadrada de " + valor + " es " + Math.sqrt(valor));
	}

}
