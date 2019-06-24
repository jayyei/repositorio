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
public class Ejercicio_Multidimensionales {
    private String nombreDelCurso;
    private int[][] calificaciones;
    
    public Ejercicio_Multidimensionales(String nombreDelCurso, int[][] calificaciones){
    	this.nombreDelCurso = nombreDelCurso;
    	this.calificaciones = calificaciones;
    	
    }
    
    public void setNombreDelCurso(String nombreDelCurso) {
    	this.nombreDelCurso = nombreDelCurso;
    }
    
    public String getNombreDelCurso() {
    	return this.nombreDelCurso;
    }

    public void procesaCalificaciones(){
        //Imprime el arreglo de calificaciones
        imprimirCalificaciones();

        //Llama a los metodos obtenerMinima y obtenerMaxima
        System.out.printf("%n%s %d%n%s %d",
                        "La calificacion mas baja en el libro de calificaciones es: ",
                        obtenerMinima());
        System.out.println("");

        //Imprime grafico de distribucion de todas las calificaciones para todas las pruebas
        imprimirGraficoBarras();


    }

    public int obtenerMinima(){
        int califBaja = calificaciones[0][0];

        for (int[] califEstudiantes: calificaciones){

            for(int calificacion: califEstudiantes){
                if(califcacion < califAlta){
                    califAlta = calificacion;
                }
            }
        }
        return califAlta;
    }

    public int obtenerMaxima(){
        int califAlta = calificaciones[0][0];

        for (int[] califEstudiantes: calificaciones){

            for(int calificacion: califEstudiantes){
                if(califcacion < califBaja){
                    califBaja = calificacion;
                }
            }
        }
        return califBaja;
    }
}
