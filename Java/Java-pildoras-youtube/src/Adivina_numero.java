import java.lang.Math;
import java.util.Scanner;

public class Adivina_numero {
    public static void main(String[] args){
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero del 0 al 100");
        int dato_usuario = entrada.nextInt();
        int intentos = 0;

        while ( aleatorio != dato_usuario){
            if(intentos < 1) {
                System.out.println("La cagaste maestro, vuelve a intentarlo");
            }
            dato_usuario = entrada.nextInt();
            if (dato_usuario > aleatorio){
                System.out.println("Bajala a tu pedo maestro");
            } else if ( dato_usuario < aleatorio){
                System.out.println("Subele a tu desmadre maestro");
            }
            intentos ++;
        }
        System.out.println("Le atinaste maestro, tuviste " + intentos + " Intentos");
    }
}
