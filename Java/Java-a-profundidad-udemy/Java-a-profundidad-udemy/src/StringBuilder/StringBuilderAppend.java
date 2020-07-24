package StringBuilder;

public class StringBuilderAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object refObject = "Hola";
		String cadena = "Adios";
		char[] arregloChar = {'a', 'b', 'c','d', 'e', 'f'};
		boolean valorBoolean = true;
		char valorChar = 'Z';
		int valorInt = 7;
		long valorLong = 100000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.33;
		
		StringBuilder ultimoBuffer = new StringBuilder("ultimo buffer");
		StringBuilder buffer = new StringBuilder();
		
		//Cada metodo append lo que hace con su argumento es convertirlo en cadena y despues anexarlo al final de la cadena
		
		buffer.append(refObject).append("\n").append(cadena).append("\n")
			.append(arregloChar, 0,3).append("\n").append(valorBoolean)
			.append("\n").append(valorChar).append("\n").append(valorInt)
			.append("\n").append(valorLong).append("\n").append(valorFloat)
			.append("\n").append(valorDouble).append("\n").append(ultimoBuffer); //incluso se pueden concatenar objetos de tipo stringBuilder
 	
		System.out.printf("buffer contiene%n%s%n", buffer.toString()); //%s significa que imprimira el argumento de a lado, sin el %s no imprimira este
		
		// El compilador puede usar StrinGuilder y metodos append para implementar los operadores de
		// + y += de concatenacion String
		
		String cadena1 = "Hola";
		String cadena2 = "BC";
		int valor = 22;
		
		//La instruccion String s = cadena1 + cadena2 + valor;
		//Puede ser realizada con un constructor StringBuilder de la siguiente manera
		
		String s = new StringBuilder().append("Hola").append("BC").append(22).toString();
		
		//Es decir realizar todas la operaciones de concatenmacion con una instancia de Stringbuilder y al final devolver una cadena con el metodo toString() 
		System.out.printf("%s%n%n", s);
		
		//La instruccion s += "!";
		//Puede ser realizada en StringBuilder de la siguiente manera
		s = new StringBuilder().append(s).append("!").toString();
		System.out.printf("%s", s);
	}

}
