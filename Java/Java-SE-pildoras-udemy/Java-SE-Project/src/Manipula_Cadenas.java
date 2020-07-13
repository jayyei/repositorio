
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Curso de Java de pildoras informaticas";
		System.out.println("Mi nombre es: " + nombre);
		System.out.println(nombre.length()); //El metodo length devulve la longitud de la cadena
		System.out.println(nombre.charAt(2)); //El metodo charAt devuelve el caracter que se encuentra en el indice solicitado
		
		//charAt comeinza a contar desde cero
		
		int ultimaLetra = nombre.length(); // El metodo length comienza a contar desde uno
		System.out.println("La primera letra de "+ nombre + " es la letra: " + nombre.charAt(0));
		System.out.println("La ultima letra de "+ nombre + " es la letra: " + nombre.charAt(ultimaLetra-1));
		
		String frase = "No hay nada mejor que levantarse un domingo para estudiar java";
		System.out.println(frase.substring(22, 43));
		
		String palabra1 = "casa";
		String palabra2 = "Casa";
		
		System.out.println(palabra1.equalsIgnoreCase(palabra2));
		
		
		
	}

}
