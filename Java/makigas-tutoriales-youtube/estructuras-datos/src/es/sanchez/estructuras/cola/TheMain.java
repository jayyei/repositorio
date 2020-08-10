package es.sanchez.estructuras.cola;

public class TheMain {
	public static void main(String[] args) {
		ColaProcesoImpl cola = new ColaProcesoImpl();
		cola.encolar(new Trabajo("Calvario", "Jose", true));
		cola.encolar(new Trabajo("Calvicie", "Josefa", false));
		System.out.println(cola);
		cola.eliminar();
		System.out.println(cola);
	}

}
