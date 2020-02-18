package genericos;

import java.util.ArrayList;

public class Stack<T> {
	
	private final ArrayList<T> elementos;
	
	//Constructor que crea una pila de un numero especifico de elementos
	public Stack() {
		this(10);
	}
	public Stack(int capacidad) {
		int capacidadInicial = capacidad > 0 ? capacidad : 10;
		elementos = new ArrayList<T>(capacidadInicial);
	}
	
	// empujar elemento dentro de la lista
	public void push(T valorPush) {
		elementos.add(valorPush);
	}
	
	public T pop() {
		if(elementos.isEmpty()) {
			throw new EmptyStackException();
		}
		
		return elementos.remove(elementos.size() -1);
	}
	
}
