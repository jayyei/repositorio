import java.util.Scanner;

public class vector_3 {
    public float[] curso1;
    public float[] curso2;
    Scanner entrada = new Scanner(System.in);

    public void obtenerCurso(){
        curso1 = new float[5];
        curso2 = new  float[5];
        for (int i = 0; i < curso2.length ; i++){
            System.out.println("Ingrese el puntaje " + i + " del curso 1");
            curso1[i] = entrada.nextInt();
            System.out.println("Ingrese el puntaje " + i + " del curso 2");
            curso2[i] = entrada.nextInt();
        }
    }

    public void obtenerPromedio(){
        float promedio1 = 0, promedio2 = 0;
        for (int i = 0; i< curso1.length ; i++){
            promedio1 = curso1[i] + promedio1;
            promedio2 = curso2[i] + promedio2;
        }
        promedio1 = promedio1/curso1.length;
        promedio2 = promedio2/curso1.length;
        if (promedio1 > promedio2){
            System.out.println("El curso 1 tiene mas promedio que el curso 2\n" + promedio1);
        } else {
            System.out.println("El curso 2 tiene mas promedio que el curso 1 \n" + promedio2);
        }
    }

    public static void main(String[] args){
        vector_3 vectorcito = new vector_3();
        vectorcito.obtenerCurso();
        vectorcito.obtenerPromedio();
    }
}
