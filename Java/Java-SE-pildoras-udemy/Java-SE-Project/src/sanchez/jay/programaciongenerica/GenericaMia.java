package sanchez.jay.programaciongenerica;

public class GenericaMia<T> { //Ese parametro T en la clase es mas bien un comodin para determinar el tipo de dato y extenderlo en toda la clase

	private T objeto;

	public GenericaMia() {
		objeto=null;
	}
	
	public void setObjeto(T nuevoValor) {
		objeto= nuevoValor;
	}
	
	public T getObjeto() {
		return objeto;
	}
}
