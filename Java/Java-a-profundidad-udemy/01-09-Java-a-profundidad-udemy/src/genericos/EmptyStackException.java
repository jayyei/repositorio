package genericos;

public class EmptyStackException  extends RuntimeException{

	public EmptyStackException() {
		this("La pila esta vacia");
	}

	public EmptyStackException(String mensajeError) {
		// TODO Auto-generated constructor stub
		super(mensajeError);
	}
}
