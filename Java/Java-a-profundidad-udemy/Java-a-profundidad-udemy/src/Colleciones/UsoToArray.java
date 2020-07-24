package Colleciones;

import java.util.Arrays;
import java.util.LinkedList;

public class UsoToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lenguajes = {"java", "c++", "c"};
		
		LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(lenguajes)); //El metodo de la clase Arrays aslList() convierte el arreglo a lista
		
		enlaces.addLast("ruby"); //adLast agrega un elemento al final de la lista
		enlaces.add("phyton"); // el metodo add sin un segundo parametro hace lo mismo que addLast
		enlaces.add(3, "c#"); // el primer parametro de add permite especificar el indice
		enlaces.addFirst("Erlang"); //por ultimo, addFirst() coloca el elemento al principio de la lista
		
		//Obtiene los elementos de LinkedList como un arreglo
		
		lenguajes = enlaces.toArray(new String[enlaces.size()]);
		
		for (String lenguaje : lenguajes) {
			System.out.println(lenguaje);
		}
	}

}
