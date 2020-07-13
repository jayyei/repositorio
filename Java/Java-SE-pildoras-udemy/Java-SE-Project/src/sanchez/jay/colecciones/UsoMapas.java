package sanchez.jay.colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();
		listaEmpleados.put("100", new Empleado("Juan"));
		listaEmpleados.put("101", new Empleado("Antonio"));
		listaEmpleados.put("102", new Empleado("Maria"));
		listaEmpleados.put("103", new Empleado("Lucia"));
		
		System.out.println(listaEmpleados);
		
		listaEmpleados.remove("101");
		System.out.println(listaEmpleados);
		
		for(Map.Entry<String, Empleado> personaEmpleado: listaEmpleados.entrySet()) {
			String clave = personaEmpleado.getKey();
			Empleado valor = personaEmpleado.getValue();
			System.out.println("Clave= " + clave + " Valor= " + valor);
		}
	}

}

class Empleado{
	
	private String nombre;
	private double salario;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.salario = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
}
