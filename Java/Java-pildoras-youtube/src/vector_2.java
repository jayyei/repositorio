import java.util.Scanner;

public class vector_2 {
    public int[] vector1;
    public int[] vector2;
    public int[] resultado;
    Scanner entrada;

    public void carga1(){
        entrada = new Scanner(System.in);
        vector1 = new int[4];
        vector2 = new int[4];
        for(int i  = 0 ; i < vector1.length; i ++ ){
            System.out.println("Ingresa el dato " + i + " del vector 1");
            vector1[i] = this.entrada.nextInt();
            System.out.println("Ingresa el dato " + i + " del vector 2");
            vector2[i] = this.entrada.nextInt();
        }
    }



    public void suma (){
        resultado = new int[4];
        for(int k  = 0 ; k < resultado.length; k ++ ){
            resultado[k] = this.vector1[k] + this.vector2[k];
            System.out.println(resultado[k]);
        }
    }

    public static void main(String[] args){
        vector_2 accion = new vector_2();
        accion.carga1();
        accion.suma();
    }
}
