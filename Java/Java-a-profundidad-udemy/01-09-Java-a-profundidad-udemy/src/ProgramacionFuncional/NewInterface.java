package ProgramacionFuncional;

// todos los metodos de una interfaz en java deben de ser public y asbtract, peeero
//en java 8 se implementan los metodos por default

public interface NewInterface { //en java 8 
	public default void holaMundo() {
		System.out.println("Hola mundo");
	}
}


//las interfaces funcionales son aquellas que contieene un metodo asbtracto

// repito las interfaces funcionales son aquellas que contiene un metodo abstracto

// dentro de la api de java 8 se encuentra el paquete function que contiene todas las interfaces funcionales

//estas interfaces van a permitir las expresiones lambda

