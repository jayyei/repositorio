package es.sanchez.estructuras.cola;

public interface IColaProceso {
	
	void encolar(Trabajo t);
	
	void eliminar();
	
	Trabajo obtener();

}
