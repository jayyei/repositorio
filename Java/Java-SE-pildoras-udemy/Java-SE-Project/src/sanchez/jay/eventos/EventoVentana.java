package sanchez.jay.eventos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		MarcoEventoVentana mimarco = new MarcoEventoVentana();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.addWindowStateListener(new EventosDeVentana());
	}
}

class MarcoEventoVentana extends JFrame{
	
	public MarcoEventoVentana() {
		setBounds(300,300,600,350);
		setVisible(true);
	}
}

class EventosDeVentana implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado");
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("Ambos lados maximizados");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("Minimizado");
		}
	}

	
}
