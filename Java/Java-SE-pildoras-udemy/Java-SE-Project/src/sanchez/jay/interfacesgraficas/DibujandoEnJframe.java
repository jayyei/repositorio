package sanchez.jay.interfacesgraficas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DibujandoEnJframe {

	public static void main(String[] args) {
		MarcoDibujos marco = new MarcoDibujos();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoDibujos extends JFrame {
	
	public MarcoDibujos() {
		setBounds(250, 100, 800, 450);
		LaminaDibujos miLamina = new LaminaDibujos();
		miLamina.setBackground(Color.YELLOW);
		add(miLamina);
		setVisible(true);
	}
}

class LaminaDibujos extends JPanel{
	
	private String fuenteElegida;
	private boolean isPresent;
	private String [] misFuentes;
	
	public LaminaDibujos() {
		this.fuenteElegida = JOptionPane.showInputDialog("Escribe la fuente que quieres utilizar");
		this.isPresent = false;
		this.misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment()
					.getAvailableFontFamilyNames();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.drawRect(20, 20, 50, 75);
//		g.drawLine(20, 20, 70, 95);
//		g.fillRect(20, 200, 50, 75);
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		float midash[] = {10.0f};
		BasicStroke milapiz = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, midash, 0);
		g2.setPaint(Color.BLUE);
		g2.setStroke(milapiz);
		g2.draw(rectangulo);
		g2.setPaint(new Color(125, 188, 230));
		g2.fill(rectangulo);
		Font miletra;
		for (String nombreFuente: misFuentes) {
			if(nombreFuente.equals(fuenteElegida)) isPresent = true;
		}
		if(isPresent) miletra = new Font(fuenteElegida, Font.BOLD, 26);
		else {
			g2.setPaint(Color.RED);
			g2.drawString("No se encontro el tipo especificado, se escribira en otra letra", 10, 10);
			miletra = new Font("Arial", Font.BOLD, 26);
		}
		g2.setFont(miletra);
		g2.setPaint(Color.BLACK);
		g2.drawString("Hola hola", 50, 50);
	}
}