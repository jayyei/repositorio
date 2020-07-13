package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Juan";
		
		String acceso = "";
		
		while(!clave.equals(acceso)) {
			acceso = JOptionPane.showInputDialog("Introduce la clace de acceso por favor");
			if(!clave.equals(acceso)) {
				System.out.println("La clave es incorrecta");
			}
		}
		System.out.println("Bienvenido a la zona de usuarios");
	}

}
