package sanchez.jay.cadenas;

public class HabilidadesBasicasString {

	public void mostrarCadenas() {
		String mensaje1 = "El caracter especial retorno de caro \n es algo asi";
		String mensaje2 = "El caracter especial tabulacion \t caso de prueba uno";
		String mensaje3 = "El Algunos caracteres como las comillas, las barras invertidas se deben de escapar";
		String mensaje4 = "     Ejemplos son \\ y tambien \" y la simple \'";

		if (!mensaje4.isEmpty())
			System.out.println("Esta vacia");

		if (!mensaje4.startsWith("Caca"))
			System.out.println("Empieza con caca");
		
		if(mensaje4.endsWith("\'"))
			System.out.println("Empieza con la comilla sencilla");
		
		if(mensaje4.length()>0) 
			System.out.println("El tamaño de la cadena es " + mensaje4.length());
		
		if(mensaje4.indexOf("\'")>1)
			System.out.println("El indice de la comilla sencilla en el mensaje4 es " + mensaje4.indexOf("\'"));
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(mensaje4);
		System.out.println("El caracter en la posicion x del mensaje 4 " + mensaje4.charAt(39));
		System.out.println("Para limpiar la cadena del mensaje 4 \n" + mensaje4.trim());
		
		String mensaje5 = "Para poder extraer partes de una cadena";
		System.out.println(mensaje5.substring(2, 7));
	}

	public void ejemplosUnicode() {
		char especial1 = '\u00A6';
		char especial2 = '\u00CF';
		char especial3 = '\u0100';

		int atraducir = 0x45;
		char atraducirInt = (char) atraducir;
		System.out.print(atraducirInt);
	}

}
