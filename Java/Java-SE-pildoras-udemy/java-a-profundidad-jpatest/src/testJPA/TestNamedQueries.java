package testJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestNamedQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("java-a-profundidad-jpatest");
		
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Categoria> findCategorias = manager.createNamedQuery("Categoria.findAll", Categoria.class);
		
		TypedQuery<Categoria> categoriaPorId =
				manager.createNamedQuery("Categoria.findByCategoriaId", Categoria.class);
		
		categoriaPorId.setParameter("categoriaid", 100);
		
		Categoria catEncontrada = categoriaPorId.getSingleResult();
		
		List<Categoria> categorias = findCategorias.getResultList();
		
		for (Categoria categoria: categorias) {
			System.out.println(categoria.getNombrecat());
		}

		System.out.println("categoria encontrada: " + catEncontrada.getNombrecat());
	}

}
