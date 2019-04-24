import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Prueba_Scanner2 {
    public static void main(String[] args){
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre pedazo de ...");
        double edad_usuario = parseDouble(JOptionPane.showInputDialog("Introduce tu edad "));
        System.out.println("Hola " + nombre_usuario + " El año que viene tendras  " + (edad_usuario + 1) + " años");
        System.out.printf("%3.0f", edad_usuario);
    }
}
