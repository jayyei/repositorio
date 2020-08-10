import java.util.Scanner;

public class MatricesFilasColumnas {
    private Scanner teclado;
    private int[][] matriz;

    // Cantidad de filas en la matriz: matriz.length;
    // Cantidad de columnas en la matriz: matriz[0].length;

    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Cuantas filas tiene el teclado ");
        int filas = teclado.nextInt();
        System.out.println("Cuantas columnas tiene el teclado ");
        int columnas = teclado.nextInt();
        matriz = new int[filas][columnas];
        for(int f = 0; f < matriz.length; f++){
            for(int c = 0; c < matriz[f].length; c++){
                System.out.println("Ingrese componente ");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimirUltima(){
        System.out.println("Ultima fila ");
        for(int c = 0; c < matriz[matriz.length-1].length; c++){
            System.out.print(matriz[matriz.length-1][c] + " ");
        }
    }

    public void imprimirMayor(){
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;
        for(int f = 0; f < matriz.length; f++){
            for(int c = 0; c < matriz[f].length; c++){
                if(matriz[f][c] > mayor){
                    mayor = matriz[f][c];
                    filaMayor = f;
                    columnaMayor = c;
                }
            }
        }
        System.out.println("El mayor elemento es: " + mayor);
        System.out.println("Se encuentra en la fila: " + filaMayor + " Y en la columna: " + columnaMayor);
    }

    public static void main(String [] args){
        MatricesFilasColumnas ma = new MatricesFilasColumnas();
        ma.cargar();
        ma.imprimirUltima();
        ma.imprimirMayor();
    }
}
