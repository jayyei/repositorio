package sanchez.jay.colecciones;

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
		
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>();
		Productos pr3 = new Productos(3, "Tercer Producto");
		Productos pr7 = new Productos(7, "Septimo Producto");
		Productos pr2 = new Productos(2, "Segundo Producto");
		
		ordenaProductos.add(pr3);
		ordenaProductos.add(pr7);
		ordenaProductos.add(pr2);
		
		for(Productos p: ordenaProductos) {
			System.out.println(p.getDescripcion());
		}
	}

}

class Productos implements Comparable <Productos>{

	private int numeroProducto;
	
	private String descripcion;
	
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
	
	
	
	
}
