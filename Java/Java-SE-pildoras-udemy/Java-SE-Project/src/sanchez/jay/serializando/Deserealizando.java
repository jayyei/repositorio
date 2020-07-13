package sanchez.jay.serializando;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserealizando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("C:/Users/mrjay/Desktop/Repositorio/Java/Java-SE-pildoras-udemy/Escritura/aladodeLasNalgotas.txt"));
			Empleado [] entradaObjeto = (Empleado[])flujoEntrada.readObject();
			
			for(Empleado elemento: entradaObjeto) {
				System.out.println(elemento);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
