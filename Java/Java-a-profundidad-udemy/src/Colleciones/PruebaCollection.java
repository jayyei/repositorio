package Colleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PruebaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Agrega los elementos en el arreglo colores a la lista
		String[] colores = { "MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
		
		// Se crea objeto ArrayList a la referencia lista. ArrayList es una clase generica
		//Por lo que podemos especificar un "argumento tipo" mediante los diamantes <> para indicar el tipo que contendra la coleccion
		//Este objeto ArrayList contendra los mismos elementos que el arreglo colores
		
		List<String> lista = new ArrayList<String>();
		
		//Este ciclo for llena "lista" con los String del arreglo colores
		for(String color: colores) {
			//El metodo add de list agrega elementos a la lista al final de este
			lista.add(color);
		}
		
		//Agrega los elementos en el arreglo eliminarColores a eliminarLista
		//El arreglo eliminarColores contiene los colores que se van a eliminar en el arreglo colores
		
		String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
		
		//Se crea un objeto arrayList y se asigna a la referencia eliminarLista
		//Este objeto contendra los elementos del arreglo eliminarColores
		List<String> eliminarLista = new ArrayList<String>();
		
		//Este ciclo for llena "eliminarLista" con los Strings del arreglo "eliminarColores"
		for (String color: eliminarColores) {
			eliminarLista.add(color);
		}
		
		//imprime en pantalla el contenido de la lista
		System.out.println("ArrayList: ");
		
		//Se imprime en pantalla cada elemento de la lista 
		// Se muestra el uso de los metodos size y get de List
		for(int cuenta = 0; cuenta < lista.size(); cuenta++) {
			System.out.printf("%s ", lista.get(cuenta));
		}
		
		// elimina de la lista los colores contenidos en eliminarLista
		eliminarColores(lista, eliminarLista);
		
		//imprime en pantalla el contenido de la lista
		System.out.println("\n\nArrayList despues de llamar al metodo eliminarColores: ");
		
		for (String color: lista) {
			System.out.printf("%s ", color);
		}
	}

	private static void eliminarColores(Collection<String> coleccion1, Collection<String> coleccion2) {
		
		//Se obtiene el iterator de coleccion1
		Iterator<String> iterador1 = coleccion1.iterator();
		
		// itera mientras la coleccion tenga elementos mediante el metodo hasNext() de Iterator
		
		while(iterador1.hasNext()) { //hasNext() devuelve true en tanto que encuentra elementos para seguir iterando en la coleccion asociada
			//llama al metodo next de Iterator para obtener una referencia al siguiente elemento
			//Despues se utiliza contains de collecion2 para determinar si contiene el elemento devuelto por iterador
			if(coleccion2.contains(iterador1.next())) { //contains devuelve true si el elemento dado se encuentra dentro de la coleccion
				iterador1.remove(); //remove elimina de la coleccion asociada dicho elemento al cual esta referenciado en el preciso momento el iterator
			}
		}
	}
}
