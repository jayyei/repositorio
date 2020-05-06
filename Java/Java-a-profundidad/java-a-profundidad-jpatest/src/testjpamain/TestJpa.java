package testjpamain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import testJPA.Categoria;
import testJPA.Producto;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("java-a-profundidad-jpatest");
		
		EntityManager manager = factory.createEntityManager();
		
		String query = "UPDATE Producto p SET p.descripcion = 'Cambio desde JPA' WHERE p.productoid = 1";
		
		String queryDelete = "DELETE from Producto p  WHERE p.productoid = 2";
		Query tq = manager.createQuery(query);
		
		manager.getTransaction().begin();
		
		int filasAfectadas = tq.executeUpdate();
		manager.getTransaction().commit();
		
		System.out.println("Filas afectadas " + filasAfectadas);
		/*String jpql = "SELECT p.descripcion FROM Producto p";
		
		TypedQuery<String> query = manager.createQuery(jpql, String.class);
		
		query.getResultList().stream().
		forEach(producto -> System.out.println(producto));*/
		/*TypedQuery<Categoria> listaCategorias = 
				manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
		
		listaCategorias.getResultList().stream()
			.forEach(categoria -> System.out.println(categoria.toString()));*/
	}

}
