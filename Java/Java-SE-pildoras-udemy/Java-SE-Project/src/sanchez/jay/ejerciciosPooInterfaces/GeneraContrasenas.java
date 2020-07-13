package sanchez.jay.ejerciciosPooInterfaces;

import java.util.Random;

public class GeneraContrasenas {
	private String contrasena;
	private int longitud;
	
	
	public GeneraContrasenas(int longitud) {
		this.longitud = longitud;
		this.contrasena = "";
	}
	
	public String getContrasena() {
		return this.contrasena;
	}
	
	public int getLengthContrasena() {
		return this.contrasena.length();
	}
	
	public String generaContrasena() {
		Random objetoAleatorio = new Random();
		for (int i = 0; i < this.longitud; i++) {
			int aleatorio = objetoAleatorio.nextInt(3);
			char mander;
			switch (aleatorio) {
				case 0: /*Caso de los numeros*/
					mander = (char)(48 + objetoAleatorio.nextInt(10));
					this.contrasena +=mander;
					break;
				case 1: /*Caso de las mayusculas */
					mander = (char)(65 + objetoAleatorio.nextInt(26));
					this.contrasena +=mander;
					break;
				case 2: /* Caso de las minusculas*/
					mander = (char)(97 + objetoAleatorio.nextInt(26));
					this.contrasena +=mander;
					break;
			}
		}
		return this.contrasena;
	}
	
	public String seguridadContrasena() {
		int mayusculas = 0, minusculas = 0, numeros = 0;
		char[] milion = this.contrasena.toCharArray();
		for(char acter: milion) {
			if(Character.isLowerCase(acter) ) {
				mayusculas++;
			}else if(Character.isUpperCase(acter)) {
				minusculas++;
			}else {
				numeros ++;
			}
		}
		if(numeros>5 && minusculas >1 && mayusculas >2) {
		return "Es segura la contrasena";
	}
		return "Es insegura la contrasena";
	}
}