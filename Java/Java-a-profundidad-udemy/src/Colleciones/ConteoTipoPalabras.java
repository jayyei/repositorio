package Colleciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConteoTipoPalabras {

	public static void main(String[] args) {
		//hashing es la tecnica que emplean las clases hasTable y hashmap para convertir las claves dadas en indices de arreglo y de esta manera buscarlo en la tabla
		//esto es para fines practicos, una tecnica para ganar mayor velocidad al momento de insertar datos
		// TODO Auto-generated method stub
		Map<String, Integer> miMap = new HashMap<>(); //la capacidad inicial de un hasMap es de 16
		
		crearMap(miMap); //crea un mapa con base en la entrada del usuario
		mostrarMap(miMap); //muestra el contenido del map
		
		//Factor de carga: proporcion entre el numero de celdas ocupadas de una tabla Hash y las
		// celdas con respecto al numero total de celdas de dicha tabla
		
		
	}
	
	private static void crearMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba una cadena");
		
		String entrada = scanner.nextLine();
		
		//divide la entrada en tokens
		
		String[] tokens = entrada.split(" ");
		
		//procesamiento del texto de entrada
		for(String token: tokens) {
			String palabra = token.toLowerCase();
			
			if(map.containsKey(palabra)) {
				int cuenta = map.get(palabra);
				map.put(palabra, cuenta+1);
			}else {
				map.put(palabra, 1);
			}
		}
		
	}
	
	private static void mostrarMap(Map<String, Integer> map) {
		Set<String> claves = map.keySet(); //se obtienen las claves mediante el metodo de los maps keySet();
		
		//Ordena las claves
		TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
		
		System.out.printf("%nEl mapa contiene: %nClave\t\tValor%n");
		
		//genera la salida para cada clave en el mapa
		
		for( String clave : clavesOrdenadas) {
			System.out.printf("%-10s%10s%n", clave, map.get(clave));
		}
		
		System.out.printf("Tamano: %d%nVacio?: %b%n", map.size(), map.isEmpty());
	}

}
