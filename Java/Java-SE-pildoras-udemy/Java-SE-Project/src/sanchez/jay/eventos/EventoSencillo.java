package sanchez.jay.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoSencillo {
	
	public static void main(String[] args) {
		MarcoBotonesColores mimarco = new MarcoBotonesColores();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotonesColores extends JFrame {
	
	public MarcoBotonesColores() {
		setTitle("Botones y Eventos");
		setBounds(400,200,500,300);
		LaminaBotonesColores milamina = new LaminaBotonesColores();
		add(milamina);
	}
}


//implements ActionListener si es que LaminabotonesColores fuera el oyente
class LaminaBotonesColores extends JPanel {
	
	private JButton botonAzul = new JButton("Azul");
	private JButton botonAmarillo = new JButton("Amarillo");
	private JButton botonRojo = new JButton("Rojo");
	private ColorDeFondo color = new ColorDeFondo(new Color(0));
	
	public LaminaBotonesColores() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		botonAzul.addActionListener(this.color);
		botonAmarillo.addActionListener(this.color);
		botonRojo.addActionListener(this.color);
	}	
	/*@Override  //El metodo que se tiene que definir si es que se implementa actionListener
	public void actionPerformed(ActionEvent e) {
		//otra condicional seria si e.getSource == botonAzul, o botonRojo o botonAmarillo, al parecer los objetos tienen bien implementado el metodo string
		switch (e.getActionCommand()) {
		case "Azul":
			super.setBackground(Color.BLUE);
			break;
		case "Amarillo":
			super.setBackground(Color.YELLOW);
			break;
		default:
			super.setBackground(Color.RED);
			break;
		}
	}*/
	
	class ColorDeFondo implements ActionListener {

		private Color colorFondo;
		
		
		public ColorDeFondo(Color color) {
			this.colorFondo = color;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Azul":
				setColorFondo(Color.BLUE);
				break;
			case "Amarillo":
				setColorFondo(Color.YELLOW);
				break;
			default:
				setColorFondo(Color.RED);
				break;
			}
			setBackground(getColorFondo());
		}

		public Color getColorFondo() {
			return colorFondo;
		}

		public void setColorFondo(Color colorFondo) {
			this.colorFondo = colorFondo;
		}

	}
}


