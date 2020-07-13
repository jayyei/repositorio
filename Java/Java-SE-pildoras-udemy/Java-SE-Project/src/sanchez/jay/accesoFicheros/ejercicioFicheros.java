package sanchez.jay.accesoFicheros;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class ejercicioFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nDirectorio = JOptionPane.showInputDialog("Introduce el nombre de directorio");
		String nArchivo = JOptionPane.showInputDialog("Introduce el nombre del archivo");
		String frase = JOptionPane.showInputDialog("Introduce la frase a guardar en el archivo");
		
		File directorio = new File("D:"+ File.separator + "imagenes" +  File.separator +"Meg" + File.separator 
				+ "nalguitas"+ File.separator + nDirectorio);
		
		//Creacion de directorio
		
		directorio.mkdir();
		
		File ruta_archivo = new File("D:"+ File.separator   + "imagenes" + File.separator + "Meg" + File.separator 
				+ "nalguitas"+ File.separator + nDirectorio + File.separator + nArchivo + ".txt");
		
		// Creacion y Escritura de la frase 
		
		try {
			ruta_archivo.createNewFile();
			//Escritura
			FileWriter escritura = new FileWriter("D:"+ File.separator + "imagenes"+ File.separator + "Meg" + File.separator 
				+ "nalguitas"+ File.separator + nDirectorio + File.separator + nArchivo + ".txt", true);
			
			for(int i = 0; i< frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
				
			escritura.close();
			
		}catch(Exception e) {
			
		}
	}

}
