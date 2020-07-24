package net.itinajero.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.itinajero.model.Categoria;
import net.itinajero.model.Vacante;

public interface ICategoriasService {
	
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	void guardar(Categoria categoria);
	void eliminar(Integer idVacante);
	Page<Categoria> buscarTodas(Pageable page);

}
