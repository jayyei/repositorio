package es.sanchez.estructuras.listasencilla;

public class Lista {

	
	private Nodo cabeza = null; // este es el elemento inicial
	private int longitud = 0;
	
	public void insertarPrincipio(Libro libro) {
		Nodo nodo = new Nodo(libro);
		nodo.siguiente = cabeza; //para insertar antes de todo, el siguiente del nodo entrante debe de apuntar a la cabeza
		cabeza = nodo; //debido a que la cabeza es el primer elemento, entonces se cambia su referencia
		longitud++;
	}
	
	public void insertarFinal(Libro libro) {
		if(cabeza == null) {
			cabeza = new Nodo(libro);
			return;
		}
		Nodo actual = cabeza;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
		}
		actual.siguiente = new Nodo(libro);
		longitud++;
	}
	
	public void insertarEnMedio(int indice, Libro libro) {
		Nodo nodoInsertar = new Nodo(libro);
		if(this.cabeza == null) {
			cabeza = nodoInsertar;
		}else {
			Nodo referencia = cabeza;
			int index = 0;
			while(indice > index && referencia.siguiente != null) {
				referencia = referencia.siguiente;
				index ++;
			}
			nodoInsertar.siguiente = referencia.siguiente;
			referencia.siguiente = nodoInsertar;
		}
		longitud++;
	}
	
	public Libro obtener(int n) {
		int indice = 0;
		if(n == indice) {
			return this.cabeza.libro;
		}else {
			Nodo referencia = cabeza;
			while (indice < n && referencia.siguiente != null) {
				referencia = referencia.siguiente;
				indice++;
			}
			return  indice != n ? null: referencia.libro;
		}
	}
	
	public int contar() {
		return this.longitud;
	}
	
	public boolean estaVacia() {
		return cabeza == null;
	}
	
	public void eliminarPrincipio() {
		if(!estaVacia()) {
			Nodo primero = cabeza;
			cabeza = cabeza.siguiente;
			primero.siguiente = null;
			longitud--;
		}
	}
	
	public void eliminarUltimo() {
		if(!estaVacia()) {
			if(cabeza.siguiente == null) {
				cabeza = null;
			}else {
				Nodo referencia = cabeza;
				while(referencia.siguiente.siguiente != null) {
					referencia = referencia.siguiente;
				}
				referencia.siguiente = null;
			}
		}
		longitud--;
	}
	
	
	public void eliminarLibro(int n) {
		if(cabeza != null ) {
			if(n == 0) {
				Nodo primero = cabeza;
				cabeza = cabeza.siguiente;
				primero.siguiente = null;
				longitud--;
			}else if(n < longitud){
				Nodo puntero = cabeza;
				int contador = 0;
				while(contador < (n-1)) {
					puntero = puntero.siguiente;
					contador++;
				}
				Nodo temp = puntero.siguiente;
				puntero.siguiente = temp.siguiente;
				temp.siguiente = null; 
				longitud--;
			}
		}
	}
}


class Nodo {
	public Libro libro;
	public Nodo siguiente = null;
	
	public Nodo(Libro libro) {
		this.libro = libro;
	}
}
