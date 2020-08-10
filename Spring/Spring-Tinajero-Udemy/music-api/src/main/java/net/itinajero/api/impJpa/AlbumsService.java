package net.itinajero.api.impJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.api.entity.Album;
import net.itinajero.api.repository.AlbumsRepository;
import net.itinajero.api.service.IAlbumService;


@Service
public class AlbumsService implements IAlbumService {

	@Autowired
	AlbumsRepository  repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		this.repoAlbums.save(album);
	}

	@Override
	public void eliminar(int idAlbum) {
		this.repoAlbums.deleteById(idAlbum);
		
	}

}
