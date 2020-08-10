import java.util.Scanner;

public class vector_4 {
    public int[] vector;
    Scanner entrada = new Scanner(System.in);

    public void cargar() {
        vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }
    }
    public void ordenamiento(){
        int dato = 0;
        for (int j = 0 ; j < vector.length -1; j++){
            if(vector[j]>vector[j+1]){
                dato++;
            }
        }
        if(dato!=0){
            System.out.println("El arreglo no esta ordenado");
        } else {
            System.out.println("El arreglo esta ordenado correctamente");
        }
    }

    public static void main (String args[]){
        vector_4 vet = new vector_4();
        vet.cargar();
        vet.ordenamiento();
    }
}