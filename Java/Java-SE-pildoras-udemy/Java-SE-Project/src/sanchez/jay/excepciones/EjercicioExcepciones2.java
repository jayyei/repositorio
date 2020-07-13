package sanchez.jay.excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class EjercicioExcepciones2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			pedirNumero();
		} catch (ExcepcionPropia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void pedirNumero() throws ExcepcionPropia{
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 100"));
		if(0>numero || numero>100) {
			throw new ExcepcionPropia("Ha ocurrido un error con tu numero");
		}else {
			System.out.println("Tu numero es correcto");
		}
	}

}
 
class ExcepcionPropia extends IOException{
	public ExcepcionPropia() {
		
	}
	
	public ExcepcionPropia(String mensaje) {
		super(mensaje);
	}
}