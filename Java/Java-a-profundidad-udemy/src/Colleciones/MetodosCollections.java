package Colleciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MetodosCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea y muestra un objeto List<Character>
		
		Character[] letras = {'P', 'C', 'M'};
		List<Character> listaLetras = Arrays.asList(letras);
		System.out.println("Lista contiene ");
		imprimir(listaLetras);
		
		//invierte y muestra el objeto lista<Character>
		Collections.reverse(listaLetras); //invierte el orden de la collecion
		
		System.out.println("Despues de llamar a reverse, lista contiene");
		imprimir(listaLetras);
		
		//Crea copiaLista a partir de un arreglo
		Character[] letrasCopia = new Character[3];
		List<Character> copiaLista = Arrays.asList(letrasCopia);
		
		//copia el contenido de la lista a copiaLista
		Collections.copy(copiaLista, listaLetras); //copia el segundo parametro lista en el primer parametro lista
		System.out.println("Despues de copiar, copiaLista contiene");
		imprimir(copiaLista);
		
		//Llena la lista con letras R
		Collections.fill(listaLetras, 'R'); //Reemplaza todos los elementos de lalista, con objetos especificados en el segundo parametro
		System.out.println("Despues de llmar a fill, lista contiene:");
		imprimir(listaLetras);
		
	}
	
	private static void imprimir(List<Character> refLista) {
		System.out.print("La lista es: ");
		
		for(Character elemento: refLista) {
			System.out.print(elemento);
		}
		
		System.out.printf("%nMax: %s", Collections.max(refLista)); //En base al metodo compare osea a la manera en que este se implemente determinara si es mayor o menor
		System.out.printf(" Min: %s%n", Collections.min(refLista));
	}

}
