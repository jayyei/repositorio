package sanchez.jay.arreglos;

public class Ejemplo_Array_BI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [][] numeros = new int[5] [3];
//		
//		numeros[0][0] = 1;
//		numeros[0][1] = 2;
//		numeros[0][2] = 3;
//		
//		numeros[1][0] = 4;
//		numeros[1][1] = 5;
//		numeros[1][2] = 6;
//		
//		numeros[2][0] = 7;
//		numeros[2][1] = 8;
//		numeros[2][2] = 9;
//		
//		numeros[3][0] = 10;
//		numeros[3][1] = 11;
//		numeros[3][2] = 12;
//		
//		numeros[4][0] = 13;
//		numeros[4][1] = 14;
//		numeros[4][2] = 15;
		
		int [][] numeros = {{5,7,9}, {2,15,19}, {54,45,85}, {75,17,67}};
		
		for( int[] x: numeros) {
			for( int y : x) {
				System.out.print(y + " ");
			}
		}
//		for(int i = 0; i<5; i++) {
//			for(int z = 0; z<3; z++) {
//				System.out.print(numeros[i][z] + " ");
//			}
//			System.out.println();
//		}
	}

}
