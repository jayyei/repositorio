package sanchez.jay.interfacesgraficas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManejoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagenes mimarco = new MarcoImagenes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagenes extends JFrame{
	public MarcoImagenes() {
		setBounds(150,150,600,750);
		LaminaImagenes milamina = new LaminaImagenes();
		add(milamina);
		setVisible(true);
		
	}
}

class LaminaImagenes extends JPanel{
	
	private Image imagen;
	private int contador = 0;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miImagen = new File("../logo.png");
		try {
			imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int ancho = imagen.getWidth(this);
		int altura = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for(int i = 0; i<this.getWidth(); i+=ancho) {
			for(int j = 0; j<this.getHeight(); j+=altura) {
				System.out.println("El contador" + contador++ +" Tiene un ancho " + this.getWidth() 
				+ " Tiene un alto " + this.getHeight());
				g.copyArea(0, 0, ancho, altura, i, j);
			}
		}
	}
}