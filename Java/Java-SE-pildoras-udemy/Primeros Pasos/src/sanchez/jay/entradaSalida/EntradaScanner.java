package sanchez.jay.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// El metodo scanner cuenta con varios metodos que requieren una instancia de la clase para ser creados
		// El ser un metodo Static implica que no necesita una instancia para hacer uso del mismo
		// Los metodos mas comunes de Scanner son nextLine, nextInt y nextDouble aunque tambien tiene el nextFloat y el nextLong
		// instanciar y crear un objeto son sinonimos
		
		Scanner entrada = new Scanner(System.in); //La consola es el system o sistema que puede servir de entrada o salida
		// para que funcione como entrada es System.in ypara salida es Sysyem.out
		//System.out.println("Introduce tu nombre, porfavor");
		//String nombre = entrada.nextLine();
		//System.out.println("Hola " + nombre);
		
		//System.out.println("Introduce el primer numero");
		//int numero = entrada.nextInt();
		
		//System.out.println("Introduce el segundo numero");
		//int numero2 = entrada.nextInt();
		
		//System.out.println("El resultado es " + (numero + numero2)); //Para evitar la concatenacion se debe de colocar parentesis
		//entrada.close(); //Cuando se realiza la instancia de un objeto que realiza una via de comunicacion, es ideal cerrarlo con esta instruccion para evitar consumir recursos
		
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		System.out.println("Introduce tu nombre por favor");
		entrada.nextLine(); //NextLine Salta a la siguiente linea y nos guarda el enter anterior y no se queda a la espera
		String nombre = entrada.nextLine(); //Captura el salto de linea \n avanza una linea mas y devuelve la pulsacion omitida 
		
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años");
	}
	

}
