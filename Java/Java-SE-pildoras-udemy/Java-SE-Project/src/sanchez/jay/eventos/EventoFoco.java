package sanchez.jay.eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setBounds(500,300,400,250);
		add(new LaminaMarcoFoco());
	}
}

class LaminaMarcoFoco extends JPanel{
	
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	
	private JLabel label1, label2, label3;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		campoTexto1 = new JTextField();
		campoTexto2 = new JTextField();
		campoTexto3 = new JTextField();
		label1 = new JLabel("Usuario");
		label2 = new JLabel("contraseña");
		label3 = new JLabel("email");
		campoTexto1.setBounds(150,10,150,20);
		campoTexto2.setBounds(150,50,150,20);
		campoTexto3.setBounds(150,90,150,20);
		label1.setBounds(70,10,150,20);
		label2.setBounds(70,50,150,20);
		label3.setBounds(70,90,150,20);
		add(campoTexto1);
		add(campoTexto2);
		add(campoTexto3);
		add(label1);
		add(label2);
		add(label3);
		EventosDeFoco eventos = new EventosDeFoco();
		campoTexto1.addFocusListener(eventos);
		campoTexto2.addFocusListener(eventos);
		campoTexto3.addFocusListener(eventos);
	}
	
	
	class EventosDeFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("El cuadro ha ganado el foco");
		}

		@Override
		public void focusLost(FocusEvent e) {
			if(e.getSource() == campoTexto1) {
				JTextField texto1 = (JTextField) e.getSource();
				String text1 = texto1.getText();
				System.out.println("El cuadro1 ha perdido el foco");
			}else if(e.getSource() == campoTexto2) {
				System.out.println("El cuadro2 ha perdido el foco");
			}
		}
		
	}
}

