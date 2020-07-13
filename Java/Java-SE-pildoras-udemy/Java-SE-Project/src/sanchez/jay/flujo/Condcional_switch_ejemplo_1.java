package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Condcional_switch_ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el # de hijos"));
		
		switch (hijos) {
		case 0:
			System.out.println("La natalidad es baja, tengo en cuenta");
			break;
		case 1:
			System.out.println("Por algo se empieza");
			break;
		case 2:
			System.out.println("Tienes la pareja");
			break;
		case 3:
			System.out.println("Veo que te estas animando");
			break;
		case 4:
			System.out.println("Ya tienes familia numerosa");
			break;
		default:
			System.out.println("Vas a tener que trabajar durp");
		}
		// fall through ejecuta a partir del punto de entrada en donde cae la condicion, de ahi para abajo
	}	// aunque las condiciones de abajo no se cumplan, al no tener el break entonces seguira ejecuntando los condicionales de abajo

}
