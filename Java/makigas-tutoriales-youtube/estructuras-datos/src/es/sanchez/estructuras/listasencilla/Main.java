package es.sanchez.estructuras.listasencilla;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		lista.insertarFinal(new Libro("Titulo1", "Autor1", "ISBN1"));
		lista.insertarFinal(new Libro("Titulo2", "Autor2", "ISBN2"));
		lista.insertarFinal(new Libro("Titulo3", "Autor3", "ISBN3"));
		lista.insertarFinal(new Libro("Titulo4", "Autor4", "ISBN4"));
		lista.eliminarUltimo();
		System.out.println(lista.obtener(0));
		System.out.println(lista.obtener(1));
		System.out.println(lista.obtener(2));
		System.out.println(lista.obtener(3));
	}

}
