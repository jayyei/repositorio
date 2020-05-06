package Colleciones;

import java.util.PriorityQueue;

public class PruebaPrioriryQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cola con capacidad de 11
		PriorityQueue<Double> cola = new PriorityQueue<>(); //los objetos de tipo priorityQueue tienen por defecto una capacidad inicial de 11 elementos
		
		//inserta elementos en la cola
		cola.offer(3.2);
		cola.offer(9.8);
		cola.offer(5.4);
		cola.offer(4.8);
		
		while(cola.size() > 0) {
			System.out.printf("Elementos en la cola %s %n", cola);
			
			System.out.println("peek: " + cola.peek()); //el metodo peek() devuelve la cabeza de la cola
			System.out.println("poll: " + cola.poll()); //remueve el elemento de la cola que tiene la mayor prioridad, es decir en queues comunes se quita la cabecera de la cola
		}
		
		System.out.println();
		
	}

}
