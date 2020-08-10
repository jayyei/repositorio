package sanchez.jay.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclado {
	public static void main(String[] args) {
		MarcoEventoTeclado mimarco = new MarcoEventoTeclado();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.addKeyListener(new EventoDeTeclado());
	}
}

class MarcoEventoTeclado extends JFrame{
	
	public MarcoEventoTeclado() {
		setBounds(300, 300, 600,350);
		setVisible(true);
	}
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Has pulsado una tecla " + e.getKeyChar() + " " + e.getKeyCode());
		if(e.getKeyCode() == KeyEvent.VK_J) {
			System.out.println("Apachurraste la J ");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Has soltado una tecla " + e.getKeyChar() + " " + e.getKeyCode());
		System.out.println("Has presionado la tecla : " + e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Has tecleado una tecla " + e.getKeyChar() + " " + e.getKeyCode());
	}
	
}