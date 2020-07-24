package ExpresionesRegulares;

import java.util.Arrays;

public class SustitucionRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String primeraCadena = "Este enunciado termina con 5 estrellas *****";
		String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";
		
		System.out.printf("Cadena1 original: %s%n", primeraCadena);
		
		//Sustituye '*' con '^'
		
		primeraCadena = primeraCadena.replaceAll("\\*", "^");
		
		System.out.printf("^ sustituyen a *: %s%n", primeraCadena);
		
		//Sustituye la palabra 'estrellas' por  'intercaladores'
		
		primeraCadena = primeraCadena.replaceAll("estrellas", "intercaladores");
		
		System.out.printf("Cada palabra se sustituye por \"palabra\": %s%n%n",
				primeraCadena.replaceAll("\\w+", "palabra"));
		
		System.out.printf("Cadena 2 original: %s%n", segundaCadena);
		
		//sustituye los primeros tres digitos con 'digito'
		
		for(int i = 0; i < 3; i++) {
			segundaCadena = segundaCadena.replaceFirst("\\d", "digito");
		}
		
		System.out.printf("Los primeros tres digitos se sustituyeron por \"digito\": %s%n",
				segundaCadena);
		
		System.out.print("cadena dividida en commas: ");
		String [] resultados = segundaCadena.split(",\\s*");
		System.out.println(Arrays.toString(resultados));

	}

}
