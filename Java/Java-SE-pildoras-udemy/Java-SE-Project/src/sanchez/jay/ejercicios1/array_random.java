package sanchez.jay.ejercicios1;

public class array_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[100];
		
		System.out.println("Rellena un arreglo de 100 posiciones ");
		for (int i =0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 100);
		}
		
		for( int numero : numeros) {
			System.out.print(numero + " ");
		}
	}

}
