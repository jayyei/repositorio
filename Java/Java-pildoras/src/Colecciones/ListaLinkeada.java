package Colecciones;

import java.util.LinkedList;

public class ListaLinkeada {
    public static void imprimir(LinkedList<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + "-");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<String>(); //Lista generica sin limite
        lista1.add("juan"); //add anade los elementos al final de la lista
        lista1.add("Luis"); //add lo que realiza es anadir un elemento a la lista
        lista1.add("Carlos");
        imprimir(lista1);
        lista1.add(1, "ana"); // o bien se puede especificar en que posicion con un segundo elemento
        imprimir(lista1);
        lista1.remove(0);  //Elimina un nodo de la lista, indicando la posicion del mismo dentro del argumento
        imprimir(lista1);
        lista1.remove("Carlos"); //Remove tambien puede funcionar con coincidiencias de busqueda
        imprimir(lista1);
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());
        if (lista1.contains("ana"))
            System.out.println("El nombre 'ana' si esta almacenado en la lista");
        else
            System.out.println("El nombre 'ana' no esta almacenado en la lista");
        System.out.println("El segundo elemento de la lista es:" + lista1.get(1)); //Para visualizar un elemento de la lista se utiliza el metodo get(posicion);
        lista1.clear();
        if (lista1.isEmpty())
            System.out.println("La lista se encuentra vacía");
    }
}
