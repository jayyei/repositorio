package sanchez.jay.ejercicios1;

import java.util.Scanner;

public class Almacenar_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros por consola");
		int [] numeros = new int[10];
		
			for (int i = 0; i< numeros.length ; i++) {
				System.out.println("introduce el numero");
				numeros[i] = entrada.nextInt();
			}
			int positivo = 0, negativo = 0, cero = 0;
		
			for (int numero: numeros) {
				System.out.println(numero);
				if(numero > 0) {
					positivo ++;
				}else if(numero < 0) {
					negativo ++;
				}else {
					cero++;
				}
			}
			System.out.println("Hay " + positivo + " numeros positivos");
			System.out.println("Hay " + negativo + " numeros negativos");
			System.out.println("Hay " + cero + " ceros");
			
			entrada.close();
	}

}
