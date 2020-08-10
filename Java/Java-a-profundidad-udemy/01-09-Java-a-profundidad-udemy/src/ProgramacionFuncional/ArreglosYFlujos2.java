package ProgramacionFuncional;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArreglosYFlujos2 {
	public static void main(String[] args) {
		String[] cadenas = {"Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Indigo", "Violeta"};
		
		//Muestra las cadenas originales
		System.out.printf("Cadenas originales %%n", Arrays.asList(cadenas));
		
		//cadenas en mayusculas
		System.out.printf("cadenas en mayuscula: %s%n",
				Arrays.stream(cadenas)
					  .map(String::toUpperCase) //es equivalente esta expresion a esta s-> s.toUpperCase()
					  .collect(Collectors.toList()));
		
		System.out.printf("cadenas mayores que m en orden ascendente %s%n",
				Arrays.stream(cadenas)
					  .filter(s -> s.compareToIgnoreCase("m") > 0)
					  .sorted(String.CASE_INSENSITIVE_ORDER)
					  .collect(Collectors.toList()));
		
		System.out.printf("Cadenas mayores que m en orden descendiente: %s%n",
				Arrays.stream(cadenas)
					  .filter(s-> s.compareToIgnoreCase("m")>0)
					  .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
					  .collect(Collectors.toList()));
	}

}
