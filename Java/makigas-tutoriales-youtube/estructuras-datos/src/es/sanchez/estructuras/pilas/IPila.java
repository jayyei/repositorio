package es.sanchez.estructuras.pilas;

public interface IPila {

	void apilar(URL url);
	
	void desapilar();
	
	URL obtener();
	
	int longitud();
	
	boolean vacia();
}
