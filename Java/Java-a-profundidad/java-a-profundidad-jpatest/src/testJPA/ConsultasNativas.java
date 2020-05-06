package testJPA;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ConsultasNativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("java-a-profundidad-jpatest");
		
		EntityManager manager = factory.createEntityManager();
		
		String sql = "SELECT * FROM productos";
		
		Query q = manager.createNativeQuery(sql, Producto.class);
		
		List<Producto> productos = q.getResultList();
		
		for (Producto producto : productos) {
			System.out.println(producto.getDescripcion());
		}
		
	}

}
