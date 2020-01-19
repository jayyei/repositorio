package StringBuilder;

import java.util.Scanner;

public class PrueabToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba un enunciado y oprima enter");
		String enunciado = scanner.nextLine();
		
		//Procesa el enunciado del usuario
		
		String[] tokens = enunciado.split(" ");
		
		System.out.printf("Numero de elementos: %d%nLos tokens son %n", tokens.length);
		
		for(String token: tokens) {
			System.out.println(token);
		}
	}

}
