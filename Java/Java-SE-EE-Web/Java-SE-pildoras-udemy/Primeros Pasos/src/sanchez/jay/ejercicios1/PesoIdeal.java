package sanchez.jay.ejercicios1;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este programa te ayuda a calcular el peso idela de acuerdo \n a la estatura y genero");
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu estatura en cm"));
		String genero = JOptionPane.showInputDialog("Eres hombre o mujer");
		int peso = 0;
		if(genero.equalsIgnoreCase("mujer")) {
			peso = altura - 120;
		}else if(genero.equalsIgnoreCase("hombre")) {
			peso = altura - 110;
		}
		System.out.println("Tu peso ideal es de " + peso);
		
	}

}
