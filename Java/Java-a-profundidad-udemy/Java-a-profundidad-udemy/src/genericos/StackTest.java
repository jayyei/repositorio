package genericos;

import java.util.EmptyStackException;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		int[] elementosInt = {1,2,3,4,5,6,7,8,9,10};
		
		//Crear un arreglo de elementos Double e Integer
		
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> intStack = new Stack<>();
		
		testPushDouble(doubleStack, elementosDouble);
		testPopDouble(doubleStack);
		
		testPushInteger(intStack, elementosInt);
		testPopInteger(intStack);
		
	}
	
	//test el metodo push con valores de tipo double
	
	private static void testPushDouble(Stack<Double> stack, double[] valores) {
		System.out.printf("%nHacer push a los elementos dentro de la pila double %n");
		
		for(double valor: valores) {
			System.out.printf("%.1f ", valor);
			stack.push(valor);
		}
	}
	
	private static void testPopDouble (Stack<Double> stack) {
		try {
			System.out.printf("%nAccion de popo en el stack de double%n");
			double popValue;
			while(true) {
				popValue = stack.pop();
				System.out.printf("%.1f ", popValue);
			}
		}catch(EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	private static void testPushInteger(Stack<Integer> stack, int[] valores) {
		System.out.printf("%nHacer push a los elementos dentro de la pila integer %n");
		
		for(Integer valor: valores) {
			System.out.printf("%d ", valor);
			stack.push(valor);
		}
	}
	
	private static void testPopInteger (Stack<Integer> stack) {
		try {
			System.out.printf("%nAccion de popo en el stack de integer%n");
			Integer popValue;
			while(true) {
				popValue = stack.pop();
				System.out.printf("%d " , popValue);
			}
		}catch(EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}

}
