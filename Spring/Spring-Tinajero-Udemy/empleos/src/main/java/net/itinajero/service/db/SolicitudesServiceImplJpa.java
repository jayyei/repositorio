package net.itinajero.service.db;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import net.itinajero.model.Solicitud;
import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;
import net.itinajero.repository.SolicitudesRepository;
import net.itinajero.repository.UsuariosRepository;
import net.itinajero.repository.VacantesRepository;
import net.itinajero.service.ISolicitudesService;
import net.itinajero.util.Utileria;

@Service	
public class SolicitudesServiceImplJpa implements ISolicitudesService {

	Logger logger = LoggerFactory.getLogger(SolicitudesServiceImplJpa.class);
	
	@Autowired
	VacantesRepository repoVacantes;
	
	@Autowired
	UsuariosRepository repoUsuarios;
	
	@Autowired
	SolicitudesRepository repoSolicitudes;
	
	@Value("${empleos.ruta.archivosCV}")
	private String rutaCVS;
	
	@Override
	public void guardar(Solicitud solicitud, int idVacante, int idUsuario, MultipartFile archivoCV) {
		Optional<Vacante> oVacante = repoVacantes.findById(idVacante);
		Optional<Usuario> oUsuario = repoUsuarios.findById(idUsuario);
		if(oVacante.isPresent() && oUsuario.isPresent()) {
			solicitud.setVacante(oVacante.get());
			solicitud.setUsuario(oUsuario.get());
		}
		solicitud.setArchivo(Utileria.guardarArchivo(archivoCV, rutaCVS));
		repoSolicitudes.save(solicitud);
	}

	@Override
	public List<Object[]> getMyApplications(int idUsuario) {
		// TODO Auto-generated method stub
		//Date initialDate = new Date();
		//repoSolicitudes.findByIdUsuario(idUsuario); Con esta accion da dos milisegundos
		//Usuario usuario = repoUsuarios.findById(idUsuario).get(); //Con esta otra 15
		//repoSolicitudes.findByUsuario(usuario);
		//Date finalDate = new Date();
		//long difference = finalDate.getTime() - initialDate.getTime(); //en ms
		//long difSeconds = TimeUnit.MINUTES.convert(difference, TimeUnit.MILLISECONDS);
		//logger.info("La diferencia de tiempo es de : {}, {} ", difference, difSeconds);
		return  repoSolicitudes.findByIdUsuario(idUsuario);
	}

	@Override
	public Solicitud encontrarPorId(int idSolicitud) {
		// TODO Auto-generated method stub
		return repoSolicitudes.findById(idSolicitud).get();
	}

	@Override
	public void eliminar(int idSolicitud) {
		repoSolicitudes.deleteById(idSolicitud);
		
	}

}
