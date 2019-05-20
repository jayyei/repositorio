package Colecciones;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//FIFO
public class cola {
    public static void main(String[] args) {
        Queue<String> cola1 = new LinkedList<String>(); // para implementar una cola se utiliza el constructor de tipo linkedList
        System.out.println("Insertamos tres elementos en la cola: juan, ana y luis");
        cola1.add("juan");
        cola1.add("ana");
        cola1.add("luis");
        cola1.add("Pedro");
        cola1.add("Ricardo");
        System.out.println("Cantidad de elementos en la cola:" + cola1.size()); //Para saber el tamano de la cola
        System.out.println("Extraemos un elemento de la cola:" + cola1.poll()); // poll() extrae un elemento de la cola y lo muestra
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo:" + cola1.peek()); //Peck() consulta el primer elemento de la cola sin extraerlo
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty()) //El metodo isEmpty() retorna true or false si es que la cola esta vacia
            System.out.print(cola1.poll() + "-");
        System.out.println();

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
        cola2.clear(); // Borra la cola completa
        System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());

        PriorityQueue<Integer> cola3 = new PriorityQueue<Integer>(); //PriorityQueue solo organiza los elementos de acuerdo a su valor
        cola3.add(70);
        cola3.add(120);
        cola3.add(6);
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!cola3.isEmpty())
            System.out.print(cola3.poll() + "-");

    }



}
