package net.itinajero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.itinajero.model.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer>{

	List<Vacante> findByEstatus(String estatus);
	
	List<Vacante> findByDestacadoAndEstatusOrderByIdDesc(int destacado, String estatus);
	
	List<Vacante> findBySalarioBetweenOrderBySalarioDesc(double r1, double r2);
	
	List<Vacante> findByEstatusIn(String [] estatus);
	
	@Query("SELECT v FROM Vacante v INNER JOIN Categoria c ON v.categoria.id = c.id "
			+ "WHERE v.descripcion LIKE %:descripcion% and v.categoria.id = :idCategoria")
	List<Vacante> findByJpql(@Param("descripcion") String descripcion, 
			@Param("idCategoria") int idCategoria);
}
