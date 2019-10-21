package sanchez.jay.accesoFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Stream = flujo de datos en java, que pueden ser bytes o caracteres
//La clase reader ayuda a leer flujos de caracteres (osea letras)
public class AcessoLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero accesoExterno = new LeerFichero();
		accesoExterno.leeDatos();

	}

}

class LeerFichero{
	public void leeDatos() {
		try {
			FileReader entrada = new FileReader("C:\\Users\\mrjay\\Desktop\\Repositorio\\Java\\Java-SE-pildoras-udemy\\primerFichero.txt");
			int caracter = entrada.read();
			char letra = (char)caracter;
			while(caracter!=-1) {
				System.out.print(letra);
				caracter= entrada.read();
				letra = (char)caracter;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
