package es.makigas.hibernate.tests;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import es.makigas.hibernate.modelo.Direccion;
import es.makigas.hibernate.modelo.Empleado;

import javax.persistence.EntityManagerFactory;

public class TestEmpleados {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear el gestor de persistencia (EM) */
		
		EntityManager manager = emf.createEntityManager();
		Empleado e = new Empleado(10L, "Perez", "Pepito", LocalDate.of(1979, 6, 10));
		e.setDireccion(new Direccion(15L, "Calle Falsa 123", "SpringField", "SpringField", "EEUU"));
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();
		imprimirTodo();
		
		//manager = emf.createEntityManager();
		//manager.getTransaction().begin();
		//e = manager.merge(e); //Antes de cambiar la instancia de e
		//e.setNombre("Dani");
		//manager.merge(e); //O se puede realizar despues del cambio haciendo merge del manager con e
		// manager.remove(e); //Para elimiar una instancia en la intancia del entityManager
 		//manager.getTransaction().commit();
		//manager.close();
		//imprimirTodo();
		
		// Empleado e = manager.find(Empleado.class, 10L );	para encontrar una instancia de empleado se utiliza el manager.find
		//e.merge() acepta una entidad que no tiene que estar administrada, devuelve el objeto administrado digamos que mezcla el manager con la instancia de empleado
		 // manager.close(); para cerrrar instancias de manager utilizamos close, al utilizar close, la entidad administrada tambien es cerrada y no puede ser cambiada
	}

	private static void insertInitial() {
		EntityManager manager = emf.createEntityManager();
		Empleado e = new Empleado(10L, "Perez", "Pepito", LocalDate.of(1979, 06, 10));
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();
	}
	
	private static void imprimirTodo() {
		@SuppressWarnings("unchecked")
		EntityManager manager = emf.createEntityManager();
		List<Empleado> emps = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("Hay " + emps.size() + " empleados en el sistema");
		
		for(Empleado emp: emps) {
			System.out.println(emp.toString());
		}
		manager.close();
	}
}
