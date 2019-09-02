package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_doWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida \n"
				+ "Para terminar escribe salir");
		
		String texto;
		
		do{
			texto = JOptionPane.showInputDialog("Introduce el texto");
			
			JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() +
					" caracteres");	
		}while(!texto.contentEquals("Salir")); // El bucle dowhile debe de almenos realizr una vez el ciclo
		System.out.println("Has salido del programa");
	}

}
