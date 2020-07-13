package sanchez.jay.flujo;

import javax.swing.JOptionPane;

public class Condiucional_if_Ejemplo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distanciaColegio;
		double rentaFamiliar;
		byte hermanos;
		
		distanciaColegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la desitancia al colegio en km"));
		rentaFamiliar = Double.parseDouble(JOptionPane.showInputDialog("Introduce en salario que se ingresa en tu familia"));
		hermanos = Byte.parseByte(JOptionPane.showInputDialog("Introudce cuantos hermanos tienes"));
		
		if(rentaFamiliar < 20000 || distanciaColegio >10 || hermanos >= 2 ) {
			System.out.println("El alumno tiene beca");
		} else {
			System.out.println("El alumno no tiene la beca");
		}
	}
	
	// El | y &  se toman la molestia de evaluar las condiciones una a una que en cambio las || y && no hacen
	// Los comparadores && y || son llamados de corto circuito por el AND y OR respectivamente
	// al final del dia los | y & se utilizan para comparar bit a bit una trama algo muy poco comun
	
}
