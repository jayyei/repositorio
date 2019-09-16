package sanchez.jay.poo;

public class UsoEmpleado {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado1 = new Empleados("Ana");
		
		Empleados empleado2 = new Empleados("Antonio");
		
		Empleados empleado3 = new Empleados("Maria");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSecccion("Recursos humanos");
		System.out.println(empleado1.getDatosEmpleado());
		
		System.out.println(empleado2.getDatosEmpleado());
		System.out.println(empleado3.getDatosEmpleado());
		
		System.out.println(Empleados.getIdSiguiente());
	}

}

class Empleados {  
	private final String nombre; // La palabra reservada final hace que los atributos que la posean sean constantes
	private String seccion;
	private int id;
	
	private static int idSiguiente = 1;  //Se crea una variable de clase, por la palabra reservada static que nos indica que esta variable pertenece a la clase y no sera generada en ninguna de las instancias que se hagan de la clase
	//Se puede modificar esta variable a gusto, pero solo en esta clase, dado el modificador de acceso private
	
	public Empleados(String nombre){
		this.nombre = nombre;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void setSecccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatosEmpleado() {
		return "El empleado " + nombre + " pertenece a la seccion de " + seccion + " y tiene el id " + id;
	}
	
	public static String getIdSiguiente() {
		return "El id del siguiente empleado sera : " + idSiguiente;
	}
}


// Los metodos static no actuan sobre objetos
// No acceden a campos de ejemplar (variables o constantes declaradas en la clase), a menos que estas sean static
// No requieren de una instancia para ser llamada