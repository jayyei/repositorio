package net.itinajero.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.model.Categoria;

@Service
public class CategoriasServiceImpl implements ICategoriasService {

	private LinkedList<Categoria> categorias;
	
	public CategoriasServiceImpl() {
		categorias = new LinkedList<>();
		
		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNombre("Finanzas");
		categoria1.setDescripcion("Categoria relacionada con las finanzas");
		
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNombre("Turismo");
		categoria2.setDescripcion("Categoria relacionada con turismo");
		
		categorias.add(categoria1);
		categorias.add(categoria2);
	}
	
	@Override
	public void guardar(Categoria categoria) {
		this.categorias.add(categoria);
		
	}

	@Override
	public List<Categoria> buscarTodas() {
		return this.categorias;
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		for(Categoria categoria: this.categorias) {
			if( categoria.getId() == idCategoria) {
				return categoria;
			}
		}
		return null;
	}

}
