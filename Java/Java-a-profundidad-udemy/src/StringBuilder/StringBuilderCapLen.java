package StringBuilder;

public class StringBuilderCapLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder buffer = new StringBuilder("Hola, como estas");
		//El metodo length proporciona el tamano de la cadena de caracteres contenida en el objeto StringBuilder
		//El metodo capacity proporciona la capacidad de almacenamiento del objeto StringBuilder
		
		System.out.printf("buffer = %s%nlongitud = %d%ncapacidad = %d%n", buffer.toString(), buffer.length(), buffer.capacity());
		//
		
		buffer.ensureCapacity(75);
		System.out.printf("Nueva capacidad = %d%n%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("Nueva longitud = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
		
		
		
	}

}
