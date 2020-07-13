package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
		
		if (edad<18) { //Todas estas condiciones estan a medias, lo correcto seria anadir la condicion que la variable este entre x edad y x edad
			System.out.println("Eres muy joven");
		}else if(edad < 40){   //Todas las condidiones forman parte de un mismo bloque, evita que caiga en dos condiciones, que primero caiga en una y si no, que caiga en la otra
			System.out.println("Eres algo joven");
		}else if(edad < 65) {
			System.out.println("Eres maduro");
		}else {
			System.out.println("Cuidate!!!");
		}
	}

}
