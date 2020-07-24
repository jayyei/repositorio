package Colleciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PruebaProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties(); //similar a un hashmap o aun hstable<k,v>
		
		//establece las propiedades
		props.setProperty("color", "azul");
		props.setProperty("anchura", "200");
		
		System.out.println("Despues de establecer las propiedades");
		listarPropiedades(props);
		
		//reemplaza el valor de una propiedad
		props.setProperty("color", "rojo");
		
		System.out.println("Despues de reemplazar propiedades");
		listarPropiedades(props);
		
		guardarPropiedades(props);
		
		props.clear();
		
		System.out.println("Despues de borrar propiedades");
		listarPropiedades(props);
		
		cargarPropiedades(props);
		
		//obtiene el valor de la propiedad color
		Object valor = props.getProperty("color");
		
		if(valor != null) {
			System.out.printf("El valor de la propiedad color es: %s%n", valor);
		}else {
			System.out.println("La propiedad color no esta en la tabla");
		}
		}
	
	private static void listarPropiedades(Properties props) {
		Set<Object> claves = props.keySet();  //obtiene las claves de un mapa atendiendo cambios reflejados en el y viceversa
	
		for (Object clave : claves) {
			System.out.printf("%s\t%s%n", clave, props.getProperty((String) clave));
		}
		
		System.out.println();
	}
	
	private static void guardarPropiedades(Properties props) {
		//guarda el conteido de un objeto properties
		
		try {
			FileOutputStream salida = new FileOutputStream("props.properties");
			props.store(salida, "Propiedades de ejemplo"); //guarda las propiedades
			salida.close();
			System.out.println("Despues de guardar las propiedades");
			listarPropiedades(props);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private static void cargarPropiedades(Properties props) {
		try {
			FileInputStream entrada = new FileInputStream("props.properties");
			props.load(entrada); //carga las propiedades a traves de un fileinputstream
			entrada.close();
			System.out.println("Despues de cargar las propiedades");
			listarPropiedades(props);
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

}
