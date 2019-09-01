package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_Ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
		
		if ( edad  >= 18) {
			System.out.println("Eres mayor de edad, puedes pasar");
		} else {
			System.out.println("Eres menor, no puedes pasar");
		}
	}

}
