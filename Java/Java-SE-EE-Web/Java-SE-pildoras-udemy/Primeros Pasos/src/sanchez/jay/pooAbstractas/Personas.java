package sanchez.jay.pooAbstractas;

import java.util.Date;

public abstract class Personas {
	
	private String nombre;
	
	public Personas(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String getDescripcion();
}

class Empleados extends Personas implements Comparable, ParaTrabajadores{
	
	private double sueldo;
	private Date fechaAlta;
	
	public Empleados(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta = fechaAlta;
		this.sueldo = sueldo;
		
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El empleado " + this.getNombre() + " tiene un sueldo de " + this.sueldo
				+ " y cuenta con una fecha de alta de " + this.fechaAlta;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Empleados empleado = (Empleados)o;
		if(this.sueldo < empleado.sueldo) {
			return -1;  //El return hace que se salga del flujo de ejecuccion sin leer lo dema del flujo
		} if (this.sueldo > empleado.sueldo) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		return ParaTrabajadores.bonus + gratificacion;
	}
}

class Jefes extends Empleados implements ParaJefes{
	private double incentivo;
	private String cargo;
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	                              
	public Jefes(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	} //Jefes heredara el metodo getDescription a partir del metodo de empleado
								// por lo que ya no se requiere sobreescribir el getDescripcion, aunque se puede hacer

	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo = cargo;
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "\n Ademas tiene el cargo de " + cargo;
	}

	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		double prima = 2000;
		return prima + gratificacion + ParaJefes.bonus; // La constante bonus puede traerse de ParaTrabajadores y ParaJefes
		
	}
	
	
}

class Alumnos extends Personas{
	
	private String optativas;
	private String aula;
	
	public Alumnos(String nombre, String optativas, String aula) {
		super(nombre);
		//El this no es necesario utilizarlo a menos que el parametro y el atributo se llamen igual
		this.optativas = optativas;
		this.aula = aula;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return " El alumno " + this.getNombre() + " tiene las materias optativas de " + optativas
				+ " y esta en el aula " + aula;
	}
	
}
