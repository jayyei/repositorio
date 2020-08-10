package StringBuilder;

public class ConstructoresStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor sin argumentos tiene una capacidad inicial de 16 caracteres (Valor predeterminado)
		StringBuilder buffer1 = new StringBuilder();
		
		//El constructor quye recibe un numero entero crea un StringBuilder que no contiene caracteres y su capacidad inicial es la mencionada en el parametro
		StringBuilder buffer2 = new StringBuilder(10);
		
		//Este constructor recibe un objeto String para crear un objeto StringBuilder que contiene los caracteres en el argumento String, la capacidad es el numero de caracteres en el argumento String mas 16
		StringBuilder buffer3 = new StringBuilder("Hola");
		
		System.out.printf("buffer1 = \"%s\"%n", buffer1);
		System.out.printf("buffer2 = \"%s\"%n", buffer2);
		System.out.printf("buffer3 = \"%s\"%n", buffer3);
	}

}
