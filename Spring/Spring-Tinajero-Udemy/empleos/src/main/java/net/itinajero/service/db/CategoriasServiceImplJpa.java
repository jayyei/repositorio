package net.itinajero.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.itinajero.model.Categoria;
import net.itinajero.repository.Categoriasrepository;
import net.itinajero.service.ICategoriasService;

//@Primary //Con esta anotacion, se considera esta implementacion como la principal a utilizar
@Service
public class CategoriasServiceImplJpa implements ICategoriasService {

	@Autowired
	Categoriasrepository repoCategoria;
	
	@Override
	public void guardar(Categoria categoria) {
		repoCategoria.save(categoria);

	}

	@Override
	public List<Categoria> buscarTodas() {
		return repoCategoria.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		Optional<Categoria> oCategoria = repoCategoria.findById(idCategoria);
		return  oCategoria.isPresent() ? oCategoria.get() : null;
	}

	@Override
	public void eliminar(Integer idVacante) {
		repoCategoria.deleteById(idVacante);
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoCategoria.findAll(page);
	}

}
