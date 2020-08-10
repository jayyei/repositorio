package Colecciones;

import java.util.ArrayList;

//La diferencia entre arraylist y linkedlist es que linkedlist  emplea una lista doblemente encadenada y la clase ArrayList utiliza un arreglo que se redimensiona en forma automática según se efectúan inserciones y extracciones de datos.
public class ArregloLinkeado {
    public static void imprimir(ArrayList<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + "-");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<String>();

        lista1.add("juan");
        lista1.add("Luis");
        lista1.add("Carlos");

        imprimir(lista1);
        lista1.add(1, "ana");
        imprimir(lista1);
        lista1.remove(0);
        imprimir(lista1);
        lista1.remove("Carlos");
        imprimir(lista1);
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());
        if (lista1.contains("ana")) //uso de contains para devolver un true en caso de haber coincidencias
            System.out.println("El nombre 'ana' si esta almacenado en la lista");
        else
            System.out.println("El nombre 'ana' no esta almacenado en la lista");
        System.out.println("El segundo elemento de la lista es:" + lista1.get(1));
        lista1.clear();
        if (lista1.isEmpty())
            System.out.println("La lista se encuentra vacía");
    }
}
