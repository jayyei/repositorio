package net.itinajero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import net.itinajero.model.Categoria;

//public interface Categoriasrepository extends CrudRepository<Categoria, Integer> {
public interface Categoriasrepository extends JpaRepository<Categoria, Integer> {
	
}
