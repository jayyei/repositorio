import javax.swing.*;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Areas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n 1: Cuadrado \n 2: Rectangulo \n 3: Triangulo \n 4: Circulo");
        int opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El área del cuadrado es " + pow(lado, 2));
                break;
            case 2:
                int largo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo"));
                int ancho = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho"));
                System.out.println("El area del rectangulo es " + largo*ancho);
                break;
            case 3:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triangulo es: " + (base*altura)/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es: ");
                System.out.printf("%3.3f", Math.PI*pow(radio, 2));
            default:
                break;
        }
    }
}
