package Colleciones;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// agrega elementos de colores a la lista
		String[] colores = {"negro", "amarillo", "verde", "azul", "violeta", "plateado"};
		List<String> lista1 = new LinkedList<>(); //diamante sin la declaracion de tipo, en java 7 se definio la inferencia de tipos
		// java utiliza el tipo de los diamantes del tipo que va a almacenar la referencia en el constructor
		
		for (String color: colores) {
			lista1.add(color);
		}

		//Agrega elementos de colores2 a lista2
		String[] colores2 = {"dorado", "blanco", "cafe", "azul", "gris", "plateado"};
		
		List<String> lista2 = new LinkedList<>();
		
		for(String color: colores2) {
			lista2.add(color);
		}
		
		lista1.addAll(lista2); //concatena las listas , basicamente addAll() se trae todo lo de una lista hacia el final de la otra
		lista2 = null; // igualar una referencia a null se realiza para librear los recursos
		imprimirLista(lista1);
		
		convertirCadenasAMayusculas(lista1);
		imprimirLista(lista1);
		
		System.out.printf("%nEliminando elementos 4 a 6...");
		eliminarElementos(lista1, 4, 7);
		imprimirLista(lista1);
		imprimirListaInversa(lista1);
		
	}
	
	private static void imprimirLista(List<String> lista) {
		System.out.printf("%nlista:%n");
		
		for(String color: lista) {
			System.out.printf("%s ", color);
		}
	}
	
	private static void convertirCadenasAMayusculas(List<String> lista) {
		ListIterator<String> iterador = lista.listIterator(); // de l;a coleccion lista, cada objeto que implemente lista desprende un metodo que devuelve un objeto de tipo List Iterador
		
		while(iterador.hasNext()) {
			String color = iterador.next();
			iterador.set(color.toUpperCase());
		} //establece el valor en la posicion en la cual el iterador se encuentre en ese momento
	}
	
	private static void eliminarElementos(List<String> lista, int inicio, int fin) {
		lista.subList(inicio, fin).clear(); //el metodo sublist devuelve una porcion de lista dado el contenido dado por los indices dados
		// como lo que devuelve es una lista, se puede aplicar el metodo tipico de la lista llamado clear(), que la borra por completo
	}
	
	//imprime la lista inversa
	private static void imprimirListaInversa(List<String> lista) {
		
		//un listIterator a diferencia del iterator, tiene funcionamiento bidireccional en la lista
		ListIterator<String> iterador = lista.listIterator(lista.size()); // en este ejemplo se le pasa como parametro al metodo el indice en el cual debe de empezar a iterar
		
		System.out.printf("%nLista inversa: %n");
		
		//imprime la lista en orden inverso
		
		while(iterador.hasPrevious()) {
			System.out.printf("%s ", iterador.previous());
		}
	}

}
