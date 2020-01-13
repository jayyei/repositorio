package sanchez.jay.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

class ColeccionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaGente = new TreeSet<String>();
		
		ordenaGente.add("Oscar");
		ordenaGente.add("Maria");
		ordenaGente.add("Ana");
		
		for(String gente: ordenaGente) {
			System.out.println(gente);
		}*/
		
		Productos comparadorPr = new Productos();
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>(comparadorPr);
		Productos pr3 = new Productos(3, "Esta es la descripcion del Tercer Producto");
		Productos pr7 = new Productos(7, "Septimo");
		Productos pr2 = new Productos(2, "Segundo Producto");
		
		ordenaProductos.add(pr3);
		ordenaProductos.add(pr7);
		ordenaProductos.add(pr2);
		
		for(Productos p: ordenaProductos) {
			System.out.println(p.getDescripcion());
		}
	}

}
//Comparable ordena de forma natural, numericamente, alfabeticamente
//Comparator ordena de forma no natural, cualquier tipo de ordenamiento que se desee 
class Productos implements Comparable <Productos>, Comparator<Productos>{

	private int numeroProducto;
	
	private String descripcion;
	
	public Productos() {
	}
	
	public Productos(int numeroProducto, String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Productos producto) {
		// TODO Auto-generated method stub
		return this.numeroProducto - producto.numeroProducto;
	}

	@Override
	public int compare(Productos o1, Productos o2) {
		// TODO Auto-generated method stub
		int carac1 = o1.getDescripcion().length();
		int carac2 = o2.getDescripcion().length();
		
		if(carac1<carac2) return -1;
		else if(carac1>carac2) return 1;
		else return 0;
	}
	
	
	
	
}
