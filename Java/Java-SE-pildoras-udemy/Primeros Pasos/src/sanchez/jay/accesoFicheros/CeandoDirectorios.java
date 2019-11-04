package sanchez.jay.accesoFicheros;

import java.io.File;
import java.io.IOException;

public class CeandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directorio = new File("D:"+File.separator+"imagenes"+File.separator+"Meg"+File.separator+"nalguitas"+ File.separator + "nalguita1.jpg" );
		//directorio.mkdir(); //Teniendo una instancia de File, con una ruta especificada, puedes agregar o crear un directorio con el comando mkdir(), te creara una carpeta en la ruta
		try {
			directorio.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
