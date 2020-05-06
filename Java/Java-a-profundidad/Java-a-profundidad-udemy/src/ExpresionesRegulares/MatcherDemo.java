package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatcherDemo {
	private static final String REGEX = "\\bdog\\b";
	private static final String INPUT = "dog dog dog doggie dogg";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile(REGEX); //compila la expresion regular dada en un patron
		
		Matcher matcher = pattern.matcher(INPUT); //este metodo devuelve un objeto de tipo matcher que contendra sus metodos propios
		
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Match number" + count);
			System.out.println("start(): " + matcher.start());
			System.out.println("end(): " + matcher.end());
			System.out.printf(" %n%s%n", matcher.group()); //encuentra el grupo que encontro con la coincidencia dada
		}
		
		System.out.println("lookingAt(): " + matcher.lookingAt()); //si la cadena contiene la expresion regular
		
		
	
	}

}
