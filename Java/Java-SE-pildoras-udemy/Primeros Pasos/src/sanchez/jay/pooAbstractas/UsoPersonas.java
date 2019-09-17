package sanchez.jay.pooAbstractas;

import java.util.Date;

public class UsoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Personas Juan = new Personas("Juan"); //NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTAR
											  // INSTANCIAR : LLAMAR AL CONSTRUCTOR
		Personas Juan = new Empleados("Juan", new Date(), 2500);
		System.out.println(Juan.getNombre());
		System.out.println(Juan.getDescripcion());
		
		Personas Ana = new Jefes("Ana", new Date(), 3500);
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion());
		
		Personas Maria = new Alumnos("Maria", "Dibujo", "Aula 5");
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescripcion());
	}

}
