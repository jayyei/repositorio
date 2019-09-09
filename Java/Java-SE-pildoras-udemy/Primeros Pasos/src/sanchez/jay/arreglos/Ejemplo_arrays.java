package sanchez.jay.arreglos;

public class Ejemplo_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Como especificar un arreglo??
		int[] valores = new int[5];
		valores[0] = 1;
		
		int [] valoresImp = {1,2,3,4,5}; // otra forma de implementar valores
		
		for (int i =0; i<valores.length; i++) {
			System.out.print(valoresImp[i] + " ");
		}
		
		for(int elemento : valoresImp) {
			System.out.print(elemento + " ");
		}
		
		String [] cadenas = {"Juan", "Maria", "Antonio", "Laura"};
		
		for(String cadena : cadenas) {
			System.out.println(cadena);
		}
	}

}
