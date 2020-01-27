package Colleciones;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Number> pila = new Stack<>();
		
		pila.push(12L);
		System.out.println("Se metio 12L");
		imprimirPila(pila);
		
		pila.push(34567);
		System.out.println("Se metio 34567");
		imprimirPila(pila);
		
		pila.push(1.0F);
		System.out.println("Se metio el 1.0F");
		imprimirPila(pila);
		
		//elimina los elementos de la pila
		
		try {
			Number objetoEliminado = null;
			
			//saca elementos de la pila
			while(true) {
				objetoEliminado = pila.pop();
				System.out.printf("Se saco %s%n", objetoEliminado);
				imprimirPila(pila);
			}
		}catch(EmptyStackException e) {
			e.printStackTrace();
		}
		
	}
	
	//muestra el contenido de la pila
	private static void imprimirPila(Stack<Number> pila) {
		if(pila.isEmpty()) {
			System.out.printf("La pila esta vacia %n%n");
		}else {
			System.out.printf("El elemento superior es: %s%n", pila.peek()); //peeck() muestra el ultimo elemento, no lo saca
			System.out.printf("La pila contiene %s (cima) %n", pila);
		}
	}

}
