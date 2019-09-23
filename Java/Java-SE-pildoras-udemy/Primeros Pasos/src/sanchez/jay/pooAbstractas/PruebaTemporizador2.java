package sanchez.jay.pooAbstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj reloj = new Reloj(3000, true);
		reloj.ejecutarTemporizador();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

	}

}

class Reloj{
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void ejecutarTemporizador() {
		// ActionListener oyente = new DameLaHora();
		Timer miTemporizador = new Timer(intervalo, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos " + ahora);
				if(sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		});
		miTemporizador.start();
	}
	
	//El modificador de acceso private solo se podra utilizar en una clase si esta se encuentra dentro de una clase
	/*private class DameLaHora implements ActionListener{ // esta clase interna puede acceder a metodos y variables
		//encapsualdas o privadas de la clase que la engloba
		@Override
		public void actionPerformed(ActionEvent e) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos " + ahora);
			if(sonido) Toolkit.getDefaultToolkit().beep();
			
		}
		
	}*/
}

