package StringBuilder;

import java.util.Scanner;

public class MetodosStaticChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba un caracter y oprima intro");
		String entrada = scanner.next();
		
		char c = entrada.charAt(0); //obtiene el caracter de entrada
		//muestra informacion sobre los caracteres
		System.out.printf("Esta definido: %b%n", Character.isDefined(c)); //%b esta especificado para boolleans //isDefined() si esta dentro de los caracteres unicode
		System.out.printf("es digito: %b%n", Character.isDigit(c)); //isDigit() si esta definido dentro del unicode
		System.out.printf("Es el primer caracter e un identificador de java %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("Es parte de un identificador de Java %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("es letra: %b%n", Character.isLetter(c));
		System.out.printf("es letra o digito %b%n", Character.isLetterOrDigit(c));
		System.out.printf("es minuscula %b%n", Character.isLowerCase(c));
		System.out.printf("Es mayuscula %b%n", Character.isUpperCase(c));
		System.out.printf("conversion a mayuscula %s%n", Character.toUpperCase(c));
		System.out.printf("Conversion a minuscula %s%n", Character.toLowerCase(c));
		
	}

}
