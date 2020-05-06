package es.makigas.hibernate.tests;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.makigas.hibernate.modelo.Autor;
import es.makigas.hibernate.modelo.Libro;

public class TestAutores {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		crearDatos();
		imprimirDatos();
	}

	private static void imprimirDatos() {
		EntityManager em = emf.createEntityManager();
		Autor autor = em.find(Autor.class, 1L);
		List<Libro> libros = autor.getLibros();
		//libros.size() // Es un pequeño hack que nos ayuda a mantener viva la instancia de la lista aunque se cierre  la instancia de entityManager
		// em.close(); //Si cierras la conexion los objetos o listas de tipo lazy tambien se pierden
		System.out.println(autor);
		System.out.println("Libros escritos (post-save): " + libros.size());
		for(Libro libro : libros) {
			System.out.println("* " + libro);
		}
		em.close();
	}

	private static void crearDatos() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		/*
		Autor autor1 = new Autor(1L, "Pablo Perez", "Española");
		Autor autor2 = new Autor(2L, "Elena Gomez", "Mexicana");
		Autor autor3 = new Autor(3L, "Miguel Lopez", "Chileno");
		
		em.persist(autor1);
		em.persist(autor2);
		em.persist(autor3);
		
		em.persist(new Libro(1L, "Programar en Java es Facil", autor2));
		em.persist(new Libro(2L, "Como vestirse con estilo", autor3));
		em.persist(new Libro(3L, "Como cocinar sin quemar la cocina", autor1));
		em.persist(new Libro(4L, "Programar en cobol es divertido", autor2));
		em.persist(new Libro(5L, "Programar en cobol no es divertido", autor2));
		
		*/
		
		Libro l1 = new Libro();
		l1.setId(1L);
		l1.setTitulo("JPA e Hibernate");
		em.persist(l1);
		
		Autor a1 = new Autor(1L, "Dani", "Española");
		a1.addLibro(l1);
		System.out.println("Libros escritos (pre saved) " + a1.getLibros().size());
		em.persist(a1);
		
		em.getTransaction().commit();
		em.close();
	}
	

}
