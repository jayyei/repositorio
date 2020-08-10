import java.util.Scanner;

public class Prueba_Scanner {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre bastardo");
        String nombre_usuario = Entrada.nextLine();
        System.out.println("Introduce tu edad pedazo de ..");
        int edad_usuario = Entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " la edad que tienes es " + edad_usuario + " años");
    }
}
