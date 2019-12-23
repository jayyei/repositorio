package sanchez.jay.programaciongenerica;

public class VariosTipos <T> {
	
	private T primero;
	
	public VariosTipos() {
		primero= null;
	}
	
	public static void imprimirTrabajador(VariosTipos<? extends Empleado> e) { //El parametro comodin ? nos ayuda a aplicar correctamente la herencia en un metodo que recibe genericos
		Empleado primero = e.getPrimero();
		System.out.println(primero);
	}
	
	public void setPrimero(T nuevoValor) {
		primero= nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}

}
