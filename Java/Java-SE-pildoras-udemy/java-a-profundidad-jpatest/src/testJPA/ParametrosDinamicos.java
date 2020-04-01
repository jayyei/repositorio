package testJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ParametrosDinamicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("java-a-profundidad-jpatest");

		EntityManager manager = factory.createEntityManager();
		
		String query = "SELECT a FROM Producto a WHERE a.productoid = :idProd";
		TypedQuery<Producto> prods = manager.createQuery(query, Producto.class);
		
		prods.setParameter("idProd", 11);
		
		prods.getResultList().stream()
			.forEach(prod -> System.out.println(prod.getDescripcion()));
	}

}
