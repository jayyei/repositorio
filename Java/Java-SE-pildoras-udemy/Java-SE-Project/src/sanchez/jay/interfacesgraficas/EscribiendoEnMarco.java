package sanchez.jay.interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primero ajustas el contenido del panel y del icono y al final seteas el frame
		//Todo es estatico, por lo que no hay instancias de MarcoTexto
		MarcoTexto.setJpanel("Hola con texto");
		MarcoTexto.setToolkitImage("../nalgotas.jpg");
		MarcoTexto.setFrame("Titulo de la ventana");
	}

}

class MarcoTexto {
	
	private static JFrame jframe;
	private static JPanel jpanel;
	private static Toolkit mySystem;
	private static Image myIcon;
	
	public static JFrame getFrame() {
		if(jframe == null) {
			jframe = new JFrame();
		}
		return jframe;
	}
	
	public static void setFrame(String titulo) {
		if(jframe == null) {
			jframe = new JFrame();
		}
		jframe.setBounds(400, 200, 600, 450);
		jframe.setTitle(titulo);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.add(jpanel);
		jframe.setIconImage(myIcon);
	}
	
	public static void setToolkitImage(String urlIcon) {
		if( mySystem == null || myIcon == null) {
			mySystem = Toolkit.getDefaultToolkit();
			myIcon = mySystem.getImage(urlIcon);
		}
	}
	
	public static JPanel getJpanel() {
		if(jpanel == null) {
			jpanel = new JPanel();
		}
		return jpanel;
	}
	
	public static void setJpanel(String message) {
		if(jpanel == null) {
			jpanel = new JPanel() {
				private Color miColor;
				private Font miFondo;
				{ //Forma de realizar un constructor en una clase anonima
					super.setBackground(new Color(195));
				}
				
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					if(this.miColor == null) {
						miColor = new Color(205,118,5);
					}
					if(this.miFondo == null) {
						miFondo = new Font("Verdana", Font.BOLD, 30);
					}
					g.setColor(miColor);
					g.setFont(miFondo);
					g.drawString(message, 20, 20);
				}
			};
		}
	}
}