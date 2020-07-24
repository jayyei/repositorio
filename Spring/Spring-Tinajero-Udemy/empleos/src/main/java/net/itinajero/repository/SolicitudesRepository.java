package net.itinajero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.itinajero.model.Solicitud;
import net.itinajero.model.Usuario;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

	public List<Solicitud> findByUsuario(Usuario idUsuario);
	
	
	@Query("SELECT v.categoria.nombre, v.nombre, u.nombre, s.fecha, s.id, v.id "
			+ "FROM Solicitud s INNER JOIN Usuario u ON s.usuario.id = u.id "
			+ "INNER JOIN Vacante v ON s.vacante.id = v.id "
			+ "WHERE s.usuario.id = :idUsuario")
	public List<Object[]> findByIdUsuario(@Param("idUsuario") int idUsuario);
}
