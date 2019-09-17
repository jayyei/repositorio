package sanchez.jay.poo;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleados Antonio = new Empleados("Antonio", 2300.5, 2019, 5, 18);*/
		
		/*Jefes Ana = new Jefes("Ana", 2900.5, 2018, 8, 9);
		Ana.setIncentivo(0.5);
		System.out.println(Ana.getSueldo());*/
		
		Jefes Juan = new Jefes("El jefe", 100000, 2010, 8, 5);
		
		Empleados[] losEmpleados = new Empleados[6];
		losEmpleados[0] = new Empleados("Antonio", 2300.5, 2019, 7, 4);
		losEmpleados[1] = new Empleados("Carlos", 5000.5, 2018, 6, 3);
		losEmpleados[2] = new Empleados("Maria", 2500.5, 2017, 5, 2);
		losEmpleados[3] = new Empleados("Ana", 7000, 2016, 4, 1);
		Juan.setIncentivo(1200);
		losEmpleados[4] = Juan; // Principio de sustitucion: Al ser jefe heredado de las clase Empleados, este puede ser utilizado como si fuese un empleado, por ejemplo, al agregarse en un arreglo de empleados
		losEmpleados[5] = new Jefes("Isabel", 8000, 2007,4,2);
		
		((Jefes)losEmpleados[5]).setIncentivo(500); //Jajaja aqui se castea el array 5 porque el array es de tipo empleado y no se puede acceder a los metodos de tipo jefe
		
		Jefes Patricia = new Jefes("Patricia", 2500, 2007,5,6);
		Empleados PatriciaSecretaria = Patricia; //Upcasting, guardar un tipo de dato en un contenedor de tipo clase padre
		
		Empleados Paty = new Jefes("Paty", 2000,2007,5,6);  //Gracias al principio de sustitucion dentro del contenedor de tipo empleado hay un jefe, si esto no es asi entonces el cating siguiente arroja una excepcion
		//En resumen para que el downCasting funcione correctamente, debemos de aplicar el constructor de la clase a castear
		//En este caso jefes, para que al almacenarla en un tipo empleado, posteriormente poder castearla a Jefe
		
		Jefes PatyDirectora = (Jefes)Paty; //Down Casting Guardar un tipo de dato en un contenedor de tipo clas hija
		
		for(Empleados empleado : losEmpleados) {
			System.out.println(empleado.getDatosEmpleado() + " y tiene un salario de: " + empleado.getSueldo());
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