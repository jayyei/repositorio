package sanchez.jay.accesoFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escritura creaFichero = new Escritura();
		creaFichero.escribiendo();
	}

}

class Escritura{
	
	public void escribiendo() {
		String texto = ". Esta es la segunda frase";
		try {
			//Con la clase FileWriter puedes abrir un flujo en la ruta dada para comenzar a escribir en un fichero, por ejemplo una cadena
			FileWriter escritura = new FileWriter("C:\\Users\\mrjay\\Desktop\\Repositorio\\Java\\Java-SE-pildoras-udemy\\primerFicheroEscritura.txt", true);
			for(int i = 0; i< texto.length(); i++) {
				escritura.write(texto.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
