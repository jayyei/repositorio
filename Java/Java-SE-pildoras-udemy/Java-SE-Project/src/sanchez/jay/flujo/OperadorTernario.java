package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioT1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer salario"));
		double salarioT2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo salario"));
		
		double salarioMayor;
		salarioMayor =(salarioT1>salarioT2)? salarioT1: salarioT2;
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		String mayor = edad>18? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayor);
	}

}
