package Colecciones;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("rojo", "red"); //Con el metodo put ingresamos una llave al mapa
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        mapa1.put("blanco", "white");
        System.out.println("Listado completo de valores");
        for (String valor : mapa1.values())   //mapa.values() es un arreglo con puros valores del mapa
            System.out.print(valor + "-");
        System.out.println();
        System.out.println("Listado completo de claves"); //mapa.keyset() es un arreglo con puras claves del mapa (izquierda)
        for (String clave : mapa1.keySet())
            System.out.print(clave + "-");
        System.out.println();
        System.out.println("La traducción de 'rojo' es:" + mapa1.get("rojo")); //mapa1.get("clave") devuelve el valor5 de la clave
        if (mapa1.containsKey("negro"))
            System.out.println("No existe la clave 'negro'");
        System.out.println("La traducción de 'marron' es:" + mapa1.getOrDefault("marrón", "No existe la clave marrón"));
        mapa1.remove("rojo");
        System.out.println(mapa1);
    }
}

//La clase TreeMap es identica al hashmap con la excepcion de que mantiene los datos ordenados por la clave
//Finalmente la clase LinkedHashMap mantiene el orden de los elementos de la tabla segun el orden de insercion
