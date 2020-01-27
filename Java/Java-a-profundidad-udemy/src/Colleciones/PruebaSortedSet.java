package Colleciones;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colores = {"amarillo", "verde", "negro", "carne", "gris", "blanco", "naranja",
				"rojo", "verde"};
		
		SortedSet<String> arbol = new TreeSet<>(Arrays.asList(colores));
		
		System.out.print("Conjunto ordenado: ");
		imprimirConjunto(arbol);
		
		//obtiene subconjunto mediante headSet, con base en "naranja"
		System.out.print("headSet (\"naranja\")");
		imprimirConjunto(arbol.headSet("naranja")); //devuelve una lista de objetos los cuales sean menores que el argumento pasado como parametro
		
		//Se obtiene subconjunto mediante tailSet con base en "naranja"
		System.out.print("tailSet (\"naranja\")");
		imprimirConjunto(arbol.tailSet("naranja")); //devuelve una vista de rango o subconjunto en donde cada elemento debe de ser mayor o igual que el parametro dado
		
		
		//obtiene los elementos primero y ultimo
		System.out.printf("primero: %s%n", arbol.first());
		System.out.printf("ultimo: %s%n", arbol.last());
		
		
		
		
	}
	
	private static void imprimirConjunto(SortedSet<String> conjunto) {
		for(String s : conjunto) {
			System.out.printf("%s ", s);
		}
		
		System.out.println();
	}

}
