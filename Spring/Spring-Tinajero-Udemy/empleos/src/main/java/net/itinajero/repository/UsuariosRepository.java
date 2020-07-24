package net.itinajero.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByUsername(String username);
	
	@Query("SELECT u FROM Usuario u where u.username = :username")
	Usuario findByUsernameJpql(@Param("username") String username);
	
	//No se pueden usar algunos wildcards de sql en jpql
	@Query("select v, c from Vacante v left outer join Categoria c on v.categoria.id = c.id ")
	Collection<Object[]> findVacantesAndUser();
	
	//Cuando tu query trae mas de una cosa, se suele utilizar un object[]
	@Query("select v.nombre, c.id from Vacante v left outer join Categoria c on v.categoria.id = c.id ")
	Collection<Object[]> findVacantesNameAndUserId();
}
