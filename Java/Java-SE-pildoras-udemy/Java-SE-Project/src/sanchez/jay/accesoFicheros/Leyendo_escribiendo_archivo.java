package sanchez.jay.accesoFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Leyendo_escribiendo_archivo {
	
	
	//Las clase fileInputStream se utiliza para abrir un puerto de conexion y poder leer byte a byte algunfichero dentro de la ruta especificada en el cosntructor 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int[] bytesImagen = new int[296173];
		try {
			FileInputStream lectura_archivo = new FileInputStream("C:/Users/mrjay/Desktop/Repositorio/Java/Java-SE-pildoras-udemy/Bonus (14).jpg");
			boolean finalArchivo = false;
			while(!finalArchivo) {
				int byteImagenEntrada = lectura_archivo.read();
				if(byteImagenEntrada != -1) {
					bytesImagen[contador] = byteImagenEntrada;
				}
				else{
					finalArchivo = true;
				}
				System.out.println(bytesImagen[contador]);
				contador++;
			}
			lectura_archivo.close();
			generaImagen(bytesImagen);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generaImagen(int[] arreglo) throws IOException {
		//La clase fileOutputStream se utliza para abrir un flujo de datos deescritura a partir de la ruta dada en el constructor;
		FileOutputStream fichero_externo = new FileOutputStream("C:/Users/mrjay/Desktop/Repositorio/Java/Java-SE-pildoras-udemy/Escritura/nalgotas_duplicadas.jpg");
		for(int element : arreglo) {
			fichero_externo.write(element);
		}
		fichero_externo.close();
	}

}
