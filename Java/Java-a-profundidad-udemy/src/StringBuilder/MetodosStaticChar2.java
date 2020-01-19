package StringBuilder;

import java.util.Scanner;

public class MetodosStaticChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Obtiene la raiz
		System.out.println("Escriba una raiz");
		int raiz = scanner.nextInt();
		
		System.out.printf("Seleccione una opcion: %n1 -- %s%n2 -- %s%n", "Convertir digito a caracter", "Convertir caracter a digito");
		int opcion = scanner.nextInt();
		
		//procesa la peticion
		
		switch(opcion) {
		case 1:
			System.out.println("Escriba un digito");
			int digito = scanner.nextInt();
			System.out.printf("Convertir digito a caracter: %s%n", Character.forDigit(digito, raiz));
			break;
		case 2:
			System.out.println("Escriba un caracter:");
			char caracter = scanner.next().charAt(0);
			System.out.printf("Convertir caracter a digito: %s%n", Character.digit(caracter, raiz));
			break;
		}

	}

}
