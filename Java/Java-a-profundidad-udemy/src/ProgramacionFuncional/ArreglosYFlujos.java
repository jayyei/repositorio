package ProgramacionFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArreglosYFlujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La interfaz Stream es una interfaz generica que permite realizar operaciones de Streams sobre
		// cualquier tipo de datos, siempre y cuando, no sean primitivos
		
		Integer [] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
		
		//Muestra los valores originales
		System.out.printf("Valores originales: %s%n", Arrays.asList(valores));
		
		//ordena los valores en forma ascendente con flujos
		System.out.printf("Valores ordenados: %s%n",
				Arrays.stream(valores) //Devuelve un Stream del tipo apropiado, en este caso Stream<Integer>(Stream)
					  .sorted() //Devuelve un stream<Integer> con los valores en orden ascendente.
					  .collect(Collectors.toList())); //Se crea una nueva coleccion con los resultados
		
		// valores mayores que 4
		List<Integer> mayorQue4 = 
				Arrays.stream(valores)
				.filter(value -> value > 4)
				.collect(Collectors.toList()); //collect pide como parametro de tipo collectors, este puede almacenar el Stream producido en una coleccion de tipo list o de cualquier otro tipo
		
		System.out.printf("Valores mayores que 4: %s%n", mayorQue4);
		
		//filtra los valores mayores que 4 y luego ordena los resultados
		System.out.printf("Valores ordenados mayores que 4: %s%n",
					Arrays.stream(valores)
					.filter(value -> value > 4)
					.sorted()
					.collect(Collectors.toList()));
		
		//objeto List mayorQue4 ordenado con flujos
		System.out.printf("Valores mayores que 4 (ascendente con flujos): %s%n",
				mayorQue4.stream()  //Al parecer cada instancia de cualquier collecion puede aplicar el metodo Stream()
						 .sorted()
						 .collect(Collectors.toList()));
	}

}
