package net.itinajero.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import net.itinajero.model.Solicitud;

public interface ISolicitudesService {
	
	public void guardar(Solicitud solicitud, int idVacante, int idUsuario, MultipartFile archivoCV);

	public List<Object[]> getMyApplications(int idUsuario);
	
	public Solicitud encontrarPorId(int idSolicitud);
	
	public void eliminar(int idSolicitud);
}
