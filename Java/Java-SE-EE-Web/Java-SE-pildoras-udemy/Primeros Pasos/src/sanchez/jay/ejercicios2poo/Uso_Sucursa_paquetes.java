package sanchez.jay.ejercicios2poo;

import java.util.Scanner;

public class Uso_Sucursa_paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Este es el programa de sucursal y paquetes");
		System.out.println("Introduce a Continuacion los siguientes datos");
		System.out.print("N# Sucursal");
		int numSucursal = entrada.nextInt();
		System.out.print("Direccion");
		String direccion = entrada.next();
		System.out.print("Ciudad");
		String ciudad = entrada.next();
		ClaseSucursal sucursal = new ClaseSucursal(numSucursal, direccion, ciudad);
		System.out.print("El numero de paquetes a enviar");
		int numPaquetes = entrada.nextInt();
		
		ClasePaquete [] paquetes = new ClasePaquete[numPaquetes];
		String referencia; 
		double peso;
		int DNI, prioridad;
		
		for (int i = 0; i < numPaquetes; i++) {
			System.out.print("Introduce la referencia del paquete " + i);
			referencia = entrada.next();
			System.out.print("Introduce el peso del paquete " + i);
			peso = entrada.nextDouble();
			System.out.print("Introduce el DNI del paquete " + i);
			DNI = entrada.nextInt();
			System.out.print("Introduce la prioridad del paquete " + i);
			prioridad = entrada.nextInt();
			
			paquetes[i] = new ClasePaquete(referencia, peso, DNI, prioridad);
		}
		
		System.out.println("Datos de la sucursal");
		System.out.println(sucursal.toString());
		
		for (ClasePaquete paquete: paquetes) {
			System.out.println("Datos del paquete");
			System.out.println(paquete.toString());
			
		}
		
	}

}
