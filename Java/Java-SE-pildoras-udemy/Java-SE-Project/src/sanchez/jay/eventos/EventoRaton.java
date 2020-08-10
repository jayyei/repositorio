package sanchez.jay.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventoRaton {
	public static void main(String[] args) {
		MarcoEventoRaton mimarco = new MarcoEventoRaton();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.addMouseListener(new EventosDeRaton());
		mimarco.addMouseMotionListener(new EventosDeRaton2());
	}
}

class MarcoEventoRaton extends JFrame{
	
	public MarcoEventoRaton() {
		setBounds(300, 300, 600,350);
		setVisible(true);
	}
}

class EventosDeRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Has entrado");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Has salido");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("has presionado");
		System.out.println("X " + e.getX());
		System.out.println("X " + e.getY());
		System.out.println(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("has salido");
	}
	
}

class EventosDeRaton2 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Arrastrando el raton");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el raton");
	}
	
}
