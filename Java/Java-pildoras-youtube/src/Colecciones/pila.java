package Colecciones;

import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        Stack<String> pila1 = new Stack<String>();
        System.out.println("Insertamos tres elementos en la pila: juan, ana y luis");
        pila1.push("juan");
        pila1.push("ana");
        pila1.push("luis");
        System.out.println("Cantidad de elementos en la pila:" + pila1.size()); // size() nos devuelve el tamano de una pila
        System.out.println("Extraemos un elemento de la pila:" + pila1.pop()); // pop() nos devuelve el ultimo elemento de la pila a la vez que lo quita
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Consultamos el primer elemento de la pila sin extraerlo:" + pila1.peek()); // devueleve el primer elemento de la pila sin extraerlo
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Extraemos uno a un cada elemento de la pila mientras no este vacía:");


        while (!pila1.isEmpty()) //El metodo isEmpty() devuelve true or false si es que la pila esta o no vacia
            System.out.print(pila1.pop() + "-");
        System.out.println();

        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(145);
        pila2.push(120);
        pila2.push(6);
        System.out.println("Imprimimos la pila de enteros");
        for (Integer elemento : pila2)  //Un foreach para obervar y recorer el dinamico
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la pila");
        pila2.clear(); //borra toda la pila
        System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());
    }
}
