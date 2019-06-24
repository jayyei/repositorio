/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java_produndidad;

/**
 *
 * @author mrjay
 */
public class Arreglo_Multidimensional {
    public static void main(String[] args){
        //int [] c = {}; //Forma de definir un arreglo unidimensional vacio
        //int [][] arregloMulti = {{}{}}; forma de definir un arreglo multidimensional vacio
        int [][] arregloMultidimensional = {{1,2}, {3,4}}; //Forma de definir un arreglo multidimensional con argumentos
        int [][] b = new int[3][4]; //Forma de crear arreglos multidimensionales con la palabra new
        
        int [][] arregloDosDimensiones = {{5,6,7},{8,9,10}};
        
        for(int fila = 0; fila < arregloDosDimensiones.length; fila++){
            for (int columna = 0; columna < arregloDosDimensiones[fila].length; columna ++){
                System.out.println(arregloDosDimensiones[fila][columna]);
            }
        }
        
    }
    
}
