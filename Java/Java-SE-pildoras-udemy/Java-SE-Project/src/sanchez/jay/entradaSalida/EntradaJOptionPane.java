package sanchez.jay.entradaSalida;
import javax.swing.*;

public class EntradaJOptionPane {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		//JoptionPane crea una mini gui que pedira la cadena de texto,su metodo showInputDialog es static y siempre devuelve un string
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
		System.out.println("Tu nombre es " + nombre);
		System.out.println("Tu edad es "+ edad);
	}
}

// La clase Integer realiza varios metodos utiles, uno de ellos static es el parseInt que analiza una cadena a entero