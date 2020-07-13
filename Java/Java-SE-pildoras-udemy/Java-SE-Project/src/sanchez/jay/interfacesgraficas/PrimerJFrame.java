package sanchez.jay.interfacesgraficas;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class PrimerJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame miVentana = new JFrame();
//		miVentana.setSize(600, 350);
//		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		miVentana.setLocation(300, 100);
//		miVentana.setVisible(true); //Favor de ponerla en ultimo lugar
		MiJFrame miVentana = new MiJFrame();
	}

}

class MiJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiJFrame() {
		//super.setSize(600,350);
		//super.setLocation(300,100);
		//super.setLocationRelativeTo(null);
		//setResizable(false); //Para definir si se puede cambiar el tamaño o no
		//super.setExtendedState(JFrame.MAXIMIZED_BOTH); para colocar el jFrame a maxima escala
		super.setBounds(350, 150, 450, 450); //combinado de setSize y setLocation
		super.setTitle("Ventana de pruebas");
		Toolkit mySystem = Toolkit.getDefaultToolkit();
		Image miIcono = mySystem.getImage("../nalgotas.jpg");
		super.setIconImage(miIcono);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
}
