package sanchez.jay.ejercicios1;

import javax.swing.JOptionPane;

public class DirrecionEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirrecion;
		boolean validate = false;
		do {
		dirrecion = JOptionPane.showInputDialog("Introduce la direccion de email");
		int countArroba =0, countPoint = 0;
		for (int i = 0; i < dirrecion.length(); i ++) {
			if(dirrecion.charAt(i)=='@') { //Recuerda que en java, las comillas simples son para caracteres y las dobles para cadena
				countArroba++;
			}
			if(dirrecion.charAt(i)=='.') {
				countPoint++;
			}
		}
		if(dirrecion.length() < 4 || countArroba != 1 || countPoint != 1) {
			JOptionPane.showMessageDialog(null, "La dirrecion de correo es incorrecta");
		}else {
			System.out.println("La dirrecion es correcta");
			validate = true;
		}
		}while(!validate);
}}
