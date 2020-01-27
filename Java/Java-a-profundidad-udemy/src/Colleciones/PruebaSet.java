package Colleciones;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PruebaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne", "blanco", "cyan"
				, "durazno", "gris", "naranja"};
		
		List<String> lista = Arrays.asList(colores);
		System.out.printf("Lista de colores: %s%n", lista);
		
		//elimina duplicados y luego imprime los valores unicos
		imprimirSinDuplicados(lista);
		
	}
	
	private static void imprimirSinDuplicados(Collection<String> valores) {
		//crea un objeto hashSet
		
		HashSet<String> conjunto = new HashSet<>(valores);
		System.out.printf("%nLos valores sin duplicados son: ");
		
		for (String valor: conjunto) {
			System.out.printf("%s ", valor);
		}
	}

}
