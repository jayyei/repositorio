package net.itinajero.service.db;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.model.Categoria;
import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;
import net.itinajero.repository.PerfilesRepository;
import net.itinajero.repository.UsuariosRepository;
import net.itinajero.service.IUsuariosService;

@Service
public class UsuariosServiceImplJpa implements IUsuariosService {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuariosServiceImplJpa.class);
	
	
	@Autowired
	private UsuariosRepository repoUsuarios;
	
	@Autowired
	private PerfilesRepository repoPerfiles;

	@Override
	public void guardar(Usuario usuario) {
		usuario.agregar(repoPerfiles.findByPerfil("USUARIO"));
		repoUsuarios.save(usuario);

	}

	@Override
	public void eliminar(Integer idUsuario) {
		repoUsuarios.deleteById(idUsuario);

	}

	@Override
	public List<Usuario> buscarTodos() {
		return repoUsuarios.findAll();
	}

	@Override
	public Usuario buscarPorUsername(String username) {
		// TODO Auto-generated method stub
		/*Collection<Object[]> busquedaLeftJoin = repoUsuarios.findVacantesAndUser();
		for(Object[] element :busquedaLeftJoin) {
			//logger.info("El element {}", element instanceof Object[]);
			//logger.info("El element {}", element);
			//logger.info("El element 0 {}", element[0]);
			//logger.info("El element 1 {}", element[1]);
			Vacante vacanteleft = (Vacante)element[0];
			logger.info("EL element 0 casteado a vacante {}", vacanteleft.getNombre());
			Categoria categorialeft = (Categoria)element[1];
			logger.info("El element 1 casteado a usuario {}", categorialeft.getNombre());
		}*/
		/*Collection<Object[]> busquedaLeftIncomplete = repoUsuarios.findVacantesNameAndUserId();
		for(Object[] element: busquedaLeftIncomplete) {
			logger.info("El element incompleto 0 {}", element[0]);
			logger.info("El element incompleto 1 {}", element[1]);
		}*/
		return repoUsuarios.findByUsernameJpql(username);
	}

}
