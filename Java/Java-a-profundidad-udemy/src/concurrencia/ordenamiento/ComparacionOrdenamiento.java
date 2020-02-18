package concurrencia.ordenamiento;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class ComparacionOrdenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		
		int[] array1 = random.ints(15_000_000).toArray();
		int[] array2 = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		//tiempo de ordenamiento del array1 con el metodo sort de arrays
		
		Instant sortStart = Instant.now();
		Arrays.sort(array1);
		Instant sortEnd = Instant.now();
		
		long sortTime = Duration.between(sortStart, sortEnd).toMillis();
		System.out.printf("Total de milisegundos: %d%n%n", sortTime);
		
		System.out.println("Comineza el ordenamiento paralelo");
		Instant parallelSortStart = Instant.now();
		Arrays.parallelSort(array2);
		Instant parallelSortEnd = Instant.now();
		
		//Tiempo de ordenamiento del array2 con el metodo parallelSort de arryas
		long parallelSortTime = Duration.between(parallelSortStart, parallelSortEnd).toMillis();
		System.out.printf("Total de milisegundos: %d%n%n", parallelSortTime);
		
		String porcentaje = NumberFormat.getPercentInstance().format((double)sortTime/parallelSortTime);
		
		System.out.printf("%nsort toma %s mas tiempo que parallelSort%n", porcentaje);
		
	}

}
