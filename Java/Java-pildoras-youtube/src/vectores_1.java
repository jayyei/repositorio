import java.util.Scanner;

public class vectores_1 {

    private int[] vector;

    public void cargar(){
        this.vector = new int[8];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 8; i++){
            System.out.println("Ingresa el valor " + i);
            this.vector[i] = entrada.nextInt();
        }
    }
    public int acumulado(){
        int acumulativo = 0;
        for (int j = 0; j< 8; j++){
            acumulativo = this.vector[j] + acumulativo;
        }
        return acumulativo;
    }

    public int condicion1(){
        int condicion1 = 0;
        for (int j = 0; j< 8; j++) {
            if (this.vector[j] > 36) {
                condicion1 = this.vector[j] + condicion1;
            }
        }
        return condicion1;
    }


    public static void main(String[] args){
        vectores_1 accion = new vectores_1();
        accion.cargar();
        System.out.println(accion.acumulado());
        System.out.println(accion.condicion1());
    }
}

