package es.sanchez.estructuras.cola;

public class ColaProcesoImpl implements IColaProceso {
	
	private Nodo cabeza, ultimo;

	@Override
	public void encolar(Trabajo t) {
		if (cabeza == null) {
			Nodo encola = new Nodo(t);
			cabeza = encola;
			ultimo = encola;
		}else {
			ultimo.siguiente = new Nodo(t);
			ultimo = ultimo.siguiente;
		}

	}

	@Override
	public void eliminar() {
		if(cabeza != null) {
			Nodo eliminar = cabeza;
			cabeza = cabeza.siguiente;
			eliminar.siguiente = null;
			if(cabeza==null) {
				ultimo = null;
			}
		}
	}

	@Override
	public Trabajo obtener() {
		return  cabeza != null? cabeza.trabajo: null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColaProcesoImpl [cabeza=");
		builder.append(cabeza.trabajo);
		builder.append(", ultimo=");
		builder.append(ultimo.trabajo);
		builder.append("]");
		return builder.toString();
	}

	
}





class Nodo {
	
	public Trabajo trabajo;
	public Nodo siguiente;
	
	public Nodo(Trabajo trabajo) {
		this.trabajo = trabajo;
		this.siguiente  = null;
	}
}
