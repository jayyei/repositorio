package genericos;

public class TestMaximo {

	public static void main(String[] args) {
		System.out.printf("Maximo de %d, %d y %d es %d%n%n", 3, 4, 5, maximo(3,4,5));
		System.out.printf("Maximo de %.1f %.1f  y %.1f es %.1f%n%n", 6.6, 8.8, 56.5, maximo(6.6, 8.8, 56.5));
		System.out.printf("Maximo de %s, %s y %s es %s%n", "pera", "manzana", "naranja", maximo("pera", "manzana", "naranja"));
	}
	
	public static <T extends Comparable<T>> T maximo(T x, T y, T z) { //tipo superior del tipo T o upperBund, es el limite definido por nosotros
		T max = x; //por ejemplo si el tipo T viene solo, el limite de herencia debe de ser object, pero cuando se lo defines entonces debe de ser del tipo que obligatoriamente de be de extender de otro tipo
		if(y.compareTo(max) > 0) { //al especificar el extendes le permites abrir un abanico mas amplio de los metodos que puede tener el tipo
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
		
	}
}
