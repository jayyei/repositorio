package sanchez.jay.ejercicios1;

import javax.swing.JOptionPane;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Intenta adivinar el numero ingresando cualquiera entre el 1 y 100");
		int valor = (int)(Math.random()*100);
		
		int valUsuario;
		int intentos = 0;
		do {
			valUsuario = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu numero??"));
			if(valUsuario > valor) {
				System.out.println("El valor que ingresaste es mas alto que el generado");
			}else if(valUsuario < valor) {
				System.out.println("El valor ingresado es menor del esperado");
			}
			intentos ++;
		}while(valor!=valUsuario);
		
		System.out.println("Correcto! ");
		System.out.println("No de intentos: " + intentos );
	}

}
