import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad maricotas");
        int edad = entrada.nextInt();

        if (edad <= 2){
            System.out.println("Eres un bebe");
        } else if (edad <= 13){
            System.out.println("Eres un maricotas");
        } else  if (edad <= 18){
            System.out.println("Eres un adolescente");
        } else if (edad <= 50){
            System.out.println("Eres un don");
        } else if (edad <= 75){
            System.out.println("Eres un anciano");
        } else {
            System.out.println("Ya estas muertos by apu");
        }
    }
}
