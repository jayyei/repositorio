package sanchez.jay.programaciongenerica;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class UsoEmpleado {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleados Antonio = new Empleados("Antonio", 2300.5, 2019, 5, 18);*/
		
		/*Jefes Ana = new Jefes("Ana", 2900.5, 2018, 8, 9);
		Ana.setIncentivo(0.5);
		System.out.println(Ana.getSueldo());*/
		
		/*Empleados[] losEmpleados = new Empleados[4];
		losEmpleados[0] = new Empleados("Antonio", 2300.5, 2019, 7, 4);
		losEmpleados[1] = new Empleados("Carlos", 5000.5, 2018, 6, 3);
		losEmpleados[2] = new Empleados("Maria", 2500.5, 2017, 5, 2);
		losEmpleados[3] = new Empleados("Ana", 7000, 2016, 4, 1); */
		
		ArrayList <Empleados> listaEmpleados = new ArrayList <Empleados>();
		//listaEmpleados.ensureCapacity(12); De forma inicial el constructor de arraylist reserva en memoria una capacidad de 10 elementos, con este metodo esta capacidad inicial puede cambiar, puedes ajustarla pero si se excede la capacidad inicial, al momento de ejecucion se crean copias de arreglos ajustando el problema de exceso y ajustando de nueva cuenta la capacidad del arraylist
		listaEmpleados.add(new Empleados("Antonio", 2300.5, 2019, 7, 4));
		listaEmpleados.add(new Empleados("Carlos", 5000.5, 2018, 6, 3));
		listaEmpleados.add(new Empleados("Ana", 2800.5, 2007, 5, 2));
		listaEmpleados.add(new Empleados("Jose", 2100.5, 2009, 5, 7));
		//listaEmpleados.trimToSize();	//Con este metodo se ajusta el tamano de la arrayList a los elementos ingresados y asi evitar reservar memoria de mas
		//System.out.println(listaEmpleados.size());
		
		//Remplazo de elemento
		listaEmpleados.set(1, new Empleados("Jorge", 1900, 2003, 5,6)); //Set reemplaza un elemento dado en el inidce por otro dado en el segundo parametro
		listaEmpleados.add(new Empleados("Olga", 1900.5, 2019, 5, 7));
		listaEmpleados.remove(2);
		
		/*for(Empleados empleado : listaEmpleados) {
			System.out.println(empleado.getDatosEmpleado() + " y tiene un salario de: " + empleado.getSueldo());
		}*/     
		
		
		/*for (int i = 0; i < listaEmpleados.size(); i++) {
			Empleados e =  listaEmpleados.get(i);
			System.out.println(e.getDatosEmpleado() + " y tiene un salario de: " + e.getSueldo());
			
		}*/
		//System.out.println(listaEmpleados.get(3).getDatosEmpleado()); //Con get imprime el objeto directamente y no los datos del mismo
	
		/*Empleados empleadosArray[] = new Empleados[listaEmpleados.size()];
		listaEmpleados.toArray(empleadosArray);
		
		for (int i = 0; i< empleadosArray.length; i++) {
			System.out.println(empleadosArray[i].getDatosEmpleado());
		}*/
		
		Iterator<Empleados> IteradorEmpleados = listaEmpleados.iterator();
		
		while(IteradorEmpleados.hasNext()) {
			System.out.println(IteradorEmpleados.next().getDatosEmpleado());
		}
	}																						// Polimorfismo: dependiendo del contexto un objeto puede comportarse de una forma u otra, por ejemplo, en este caso, el ultimo dato en el arreglo es de tipo jefe, y java al detectarlo manda a llamar el getSueldo() de la clase jefe
}			//El enlazado dinamico es cuando el interprete java es capaz de identificar en cada caso que metodo llamar, ya sea el metodo getSueldo() de la clase Empleado (Cuando el elemento iterable es de tipo empleado) o el metodo getSueldo() de la clase jefe cuando el elemento de tipo empleado, en realidad es un elemento de tipo jefe;

class Directores extends Jefes{

	public Directores(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia);
		// TODO Auto-generated constructor stub
	} //Al heredar, java nos obliga a crear un constructor que llame al constructor de la clase padre 
	
}

class Jefes extends Empleados {  //La palabra final hace que se detenga la jerarquia de herencia de clases
	
	private double incentivo;
	
	public Jefes(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia); //La palabra super hace referencia a la clase padre o super
		// TODO Auto-generated constructor stub
	}  //Herencia se usa con extends, //El constructor tambien es heredado
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo(); //Con la palabra reservada se hace la llamada al metodo heredado y no al metodo de la clase
		return sueldoJefe + incentivo;
	}
}

class Empleados {  
	private final String nombre; // La palabra reservada final hace que los atributos que la posean sean constantes
	private int id;
	private double sueldo;
	GregorianCalendar  calendario;
	private static int idSiguiente = 1;  //Se crea una variable de clase, por la palabra reservada static que nos indica que esta variable pertenece a la clase y no sera generada en ninguna de las instancias que se hagan de la clase
	//Se puede modificar esta variable a gusto, pero solo en esta clase, dado el modificador de acceso private
	
	public Empleados(String nombre, double sueldo, int anio, int mes, int dia){
		this.nombre = nombre;
		this.sueldo = sueldo;
		calendario = new GregorianCalendar(anio, mes, dia); 
		id = idSiguiente;
		idSiguiente++;
	}
	
	public String getDatosEmpleado() {
		return "El empleado " + nombre + " y tiene el id " + id;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	final public GregorianCalendar getFechaAlta() { //La palabra final en un metodo hace que dicho metodo no pueda sobreescribirse en las subclases que lo hereden
		return calendario;
	}
	
	public void setSubeSalario(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public static String getIdSiguiente() {
		return "El id del siguiente empleado sera : " + idSiguiente;
	}
}


// Los metodos static no actuan sobre objetos
// No acceden a campos de ejemplar (variables o constantes declaradas en la clase), a menos que estas sean static
// No requieren de una instancia para ser llamada