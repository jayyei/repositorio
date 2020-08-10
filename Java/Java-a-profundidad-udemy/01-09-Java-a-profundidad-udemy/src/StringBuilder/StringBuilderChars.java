package StringBuilder;

public class StringBuilderChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder buffer = new StringBuilder("Hola a todos");
		
		System.out.printf("Buffer = %s%n", buffer.toString()); //El metodo toString devuelve u objeto de tipo string
		System.out.printf("Caracter en 0 %s%nCaracter en 3: %s%n%n", buffer.charAt(0), buffer.charAt(3)); //El metodo charAt devuelve el caracter que se encuentra en el indice dado por argumento
		
		char[] arregloChars = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), arregloChars, 0);
		System.out.print("Los caracteres son: ");
		
		for (char caracter : arregloChars) {
			System.out.print(caracter);
		}
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(7, 'T');
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		
		buffer.reverse();
		
		System.out.printf("%n%nbuffer = %s%n", buffer.toString());

	}

}
