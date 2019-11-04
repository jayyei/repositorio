package sanchez.jay.accesoFicheros;

import java.io.File;

public class AccesoRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//La constante fie separator nos ayuda a colocar el separador de rutas por defecto del sistema para tener compatibilidad en todos los sistemas
		File directorio = new File("D:"+File.separator+"imagenes"+File.separator+"Meg"); //La ruta en donde se realiza la busqueda de es la ruta del workspace
		
		
		System.out.println(directorio.getAbsolutePath());//Te otorga un path a partir de la ruta del workspace y el String del constructor de File
		System.out.println(directorio.exists()); //Devuelve true, si el archivo mencionado en el constructor existe en el path por defecto
		String [] nombre = directorio.list();
		for(String archivo : nombre) {
			System.out.println(archivo);
			File f = new File(directorio.getAbsolutePath(), archivo);
			if(f.isDirectory()) {
				String [] archivos_subcarpeta = f.list();
				for(String subArchivos : archivos_subcarpeta) {
					System.out.println(subArchivos);
				}
			}
		}
	}

}
