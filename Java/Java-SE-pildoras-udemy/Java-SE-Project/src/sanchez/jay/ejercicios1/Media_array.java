package sanchez.jay.ejercicios1;

import java.util.Scanner;

public class Media_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce 10 numeros ");
		int [] numeros = new int[10];
		
		for (int i =0; i < numeros.length; i++) {
			System.out.println("Introduce el primer numero");
			numeros[i] = entrada.nextInt();
		}
		int suma = 0;
		for (int i =0; i< numeros.length; i+=2) {
			suma += numeros[i];
		}
		
		int media = suma % numeros.length/2;
		System.out.println("La media de las posiciones pares es " + media);
	}

}
