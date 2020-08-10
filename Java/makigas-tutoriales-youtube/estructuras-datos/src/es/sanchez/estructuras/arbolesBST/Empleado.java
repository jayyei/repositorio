package es.sanchez.estructuras.arbolesBST;

public class Empleado implements Comparable<Empleado>{

	private int id;
	
	private String nombre;
	
	private String puesto;
	
	private String despacho;

	public Empleado(int id, String nombre, String area, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puesto = area;
		this.despacho = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return puesto;
	}

	public void setArea(String area) {
		this.puesto = area;
	}

	public String getDepartamento() {
		return despacho;
	}

	public void setDepartamento(String departamento) {
		this.despacho = departamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", area=");
		builder.append(puesto);
		builder.append(", departamento=");
		builder.append(despacho);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Empleado empl) {
		if(id == empl.id ) {
			return 0;
		}else if (id < empl.id) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
