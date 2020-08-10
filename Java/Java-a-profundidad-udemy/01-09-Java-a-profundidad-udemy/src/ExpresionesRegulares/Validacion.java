package ExpresionesRegulares;

import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//pide el primer nombre
		System.out.println("Escriba el primer nombre");
		String primerNombre = scanner.nextLine();
		
		System.out.println("Escriba el apellido paterno");
		String apellidoPaterno = scanner.nextLine();
		
		System.out.println("Escriba la direccion");
		String direccion = scanner.nextLine();
		
		System.out.println("Escriba la ciudad");
		String ciudad = scanner.nextLine();
		
		System.out.println("Escriba el estado");
		String estado = scanner.nextLine();
		
		System.out.println("Escriba el codigo postal");
		String cp = scanner.nextLine();
		
		System.out.println("Escriba el telefono");
		String telefono = scanner.nextLine();
		
		System.out.printf("\nValidar resultado:");
		
		if(!ValidacionEntrada.validarPrimerNombre(primerNombre)) {
			System.out.println("Primer nombre invalido");
		}else if(!ValidacionEntrada.validarApellidoPaterno(apellidoPaterno)) {
			System.out.println("Apellido paterno invalido");
		}else if(!ValidacionEntrada.validarDireccion(direccion)) {
			System.out.println("Direccion invalida");
		}else if(!ValidacionEntrada.validarCiudad(ciudad)) {
			System.out.println("Ciudad invalida");
		}else if(!ValidacionEntrada.validarEstado(estado)) {
			System.out.println("Estado invalido");
		}else if(!ValidacionEntrada.valodarCP(cp)) {
			System.out.println("Codigo postal invalido");
		}else if(!ValidacionEntrada.validarTelefono(telefono)) {
			System.out.println("Numero telefonico invalido");
		}else {
			System.out.println("La entrad es valida gracias");
		}
		
		
	}

}
