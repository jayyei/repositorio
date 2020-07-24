package net.itinajero.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.itinajero.model.Vacante;
import net.itinajero.repository.VacantesRepository;
import net.itinajero.service.IVacantesService;

@Service
public class VacantesServiceImplJpa implements IVacantesService {

	@Autowired
	private VacantesRepository repoVacante;
	
	@Override
	public List<Vacante> buscarTodas() {
		return repoVacante.findAll();
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		return repoVacante.findById(idVacante).isPresent() ? 
				repoVacante.findById(idVacante).get() : null;
	}

	@Override
	public void guardar(Vacante vacante) {
		repoVacante.save(vacante);
	}

	@Override
	public List<Vacante> buscarDestacadas() {
		return repoVacante.findByDestacadoAndEstatusOrderByIdDesc(1, "Aprobada");
	}

	@Override
	public void eliminar(Integer idVacante) {
		repoVacante.deleteById(idVacante);
	}

	@Override
	public List<Vacante> buscarByExample(Example<Vacante> example) {
		// TODO Auto-generated method stub
		return repoVacante.findAll(example);
	}

	@Override
	public List<Vacante> buscarByJpql(Vacante vacante) {
		if(vacante.getDescripcion() != null && vacante.getCategoria().equals(null)) {			
			return repoVacante.findByJpql(vacante.getDescripcion(), vacante.getCategoria().getId());
		}
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withMatcher("descripcion", ExampleMatcher.GenericPropertyMatchers.contains());
		return buscarByExample(Example.of(vacante, matcher));
	}

	@Override
	public Page<Vacante> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return repoVacante.findAll(page);
	}

}
