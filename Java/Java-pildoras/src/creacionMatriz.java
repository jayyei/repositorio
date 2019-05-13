import java.util.Scanner;

public class creacionMatriz {
    private Scanner teclado;
    private int[][] matriz;


    public void cargar(){
        teclado = new Scanner(System.in);
        matriz = new int[3][5];
        for(int f = 0; f < 3 ; f++){
            for( int c = 0; c < 5; c++){
                System.out.println("Ingrese conmponente");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimir(){
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 5; c++){
                System.out.println(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        creacionMatriz ma = new creacionMatriz();
        ma.cargar();
        ma.imprimir();
    }
}
