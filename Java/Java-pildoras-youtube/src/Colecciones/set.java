package Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>(); //El conjunto de datos no se almacena en un orden especifico, si bien se garantiza que no hay duplicados
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto1.add(20);
        // La impresión no asegura un orden específico
        for (int elemento : conjunto1)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto2 = new TreeSet<Integer>(); // los elementos del conjunto se almacenan de menor a mayor
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto2.add(20);
        // Los elementos se muestran de menor a mayor
        for (int elemento : conjunto2)
            System.out.print(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>(); //Los elementos se ordenan de acuerdo al orden que se inserta, similar a una lista pero sin repetidos
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto3.add(20);
        // Los elementos se muestran en el orden que se insertaron
        for (int elemento : conjunto3)
            System.out.print(elemento + " - ");
        System.out.println();

    }
}
