package sanchez.jay.ejerciciosPooInterfaces;

import javax.swing.JOptionPane;

public class UsoContrasenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Bienvenido al generador de contrasenas");
		
		int numContrasenas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de contrasenas a generar"));
		int longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la longitud de las contrasenas"));
		
		
		for(int i = 1; i<= numContrasenas; i++) {
		GeneraContrasenas contrasena = new GeneraContrasenas(longitud);
		System.out.print(contrasena.generaContrasena());
		System.out.println(" " + contrasena.seguridadContrasena());
		}
	}

}
