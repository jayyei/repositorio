package net.itinajero;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import net.itinajero.model.Categoria;
import net.itinajero.model.Perfil;
import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;
import net.itinajero.repository.Categoriasrepository;
import net.itinajero.repository.PerfilesRepository;
import net.itinajero.repository.UsuariosRepository;
import net.itinajero.repository.VacantesRepository;

@SpringBootApplication //Las clases marcadas con esta anotacion son las clases principales
public class JpaDemoApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(JpaDemoApplication.class);
	
	@Autowired
	private Categoriasrepository repoCategorias; //TODO cambiar el tipo por CrudRepository y observar si se pueden ejecutar metodos de Categoriasrepository
	
	@Autowired
	private VacantesRepository repoVacantes;
	
	@Autowired
	private PerfilesRepository repoPerfiles;
	
	@Autowired
	private UsuariosRepository repoUsuarios;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		buscarVacantesVariosEstatus();
	}
	
	public void buscarVacantesVariosEstatus() {
		List<Vacante> vacantes = repoVacantes.findByEstatusIn(new String[]{"Eliminada", "Creada"});
		logger.info("Registros encontrados {} ", vacantes.size());
		vacantes.forEach(vacante -> {
			logger.info("Vacantes con estos estatus:  {} :- {}", vacante.getNombre(), vacante.getEstatus());
		});
	}
	
	public void buscarVacantesConRangoSalario() {
		List<Vacante> vacantes = repoVacantes.findBySalarioBetweenOrderBySalarioDesc(7000.0, 9000.0);
		logger.info("Registros encontrados {} ", vacantes.size());
		vacantes.forEach(vacante -> {
			logger.info("Vacantes con este rango:  {} :- {}", vacante.getNombre(), vacante.getSalario());
		});
	}
	
	private void buscarVacantesPorDestacadoYEstatusOrdenDesc() {
		List<Vacante> vacantes = repoVacantes.findByDestacadoAndEstatusOrderByIdDesc(1, "Creada");
		logger.info("Registros encontrados {} ", vacantes.size());
		vacantes.stream().forEach(vacante -> {
			logger.info("Vacantes con estatus creada  y  estatus 1 {}, {}, {} ", vacante.getNombre(),
					vacante.getDestacado() , vacante.getEstatus());
		});
	}
	
	private void buscarVacantesPorEstatus() {
		List<Vacante> vacantes = repoVacantes.findByEstatus("Creada");
		logger.info("Registros encontrados {}", vacantes.size());
		vacantes.forEach(vacante -> {
			logger.info("Vacantes con estatus creada {}", vacante.getNombre() );
			logger.info("Vacantes con estatus creada {}", vacante.getEstatus() );
		});
	}
	private void buscarUsuario() {
		Optional<Usuario> ouser =repoUsuarios.findById(1);
		if(ouser.isPresent()) {
			Usuario usuario = ouser.get();
			logger.info("Usuario {}", usuario.getNombre());
			logger.info("Perfiles asignados -> " );
			//usuario.getPerfiles().stream().forEach(System.out::println);
			for(Perfil p : usuario.getPerfiles()) {
				logger.info("Pefil: {} ",p.getPerfil());
			}
		}else {
			logger.info("Usuario no encontrado");
		}
	}
	
	private void crearUsuarioConDosPerfiles() {
		Usuario user = new Usuario();
		user.setNombre("Ivan Tinajero");
		user.setEmail("ivanite@gmail.com");
		user.setFechaRegistro(new Date());
		user.setUsername("itinajero");
		user.setPassword("12345");
		user.setEstatus(1);
		user.agregar(repoPerfiles.findById(1).get());
		user.agregar(repoPerfiles.findById(2).get());
		
		repoUsuarios.save(user);
	}
	
	private void guardarPerfilesAplicacion() {
		repoPerfiles.saveAll(this.getPerfilesAplicacion());
	}
	
	private void guardarVacante() {
		Vacante vacante = new Vacante();
		vacante.setNombre("Profesor de Matematica");
		vacante.setDescripcion("Escuela primaria solicita profesor para curso de Matematicas");
		vacante.setFecha(new Date());
		vacante.setSalario(8500.0);
		vacante.setEstatus("Aprobada");
		vacante.setDestacado(0);
		vacante.setImagen("escuela.png");
		vacante.setDetalles("<h1>Los requisitos para profesor de matematicas</h1>");
		Optional<Categoria> categoriaBuscada = repoCategorias.findById(15);
		if(categoriaBuscada.isPresent()) {
			vacante.setCategoria(categoriaBuscada.get());
			repoVacantes.save(vacante);
		}
	}
	
	private void buscarVacantes() {
		List<Vacante> lista = repoVacantes.findAll();
		lista.stream().forEach(vacante -> {
			String concatenado = new StringBuilder()
					.append(vacante.getId())
					.append(" ")
					.append(vacante.getNombre())
					.append("-> ")
					.append(vacante.getCategoria().getNombre())
					.toString();
			logger.info("El resultado {}", concatenado );;
		});
	}
	
	
	private void buscarPorId() {
		Optional<Categoria> oCategoria = repoCategorias.findById(1);
		if(oCategoria.isPresent()) {
			System.out.println(oCategoria.get());
		}else {
			System.out.println("Categoria no encontrada");
		}
	}

	private void guardar() {
		Categoria cat = new Categoria();
		cat.setNombre("Finanzas");
		cat.setDescripcion("Trabajos relacionados con finanzas y contabilidad");
		repoCategorias.save(cat);
		System.out.println(cat);
	}
	
	private void modificar() {
		Optional<Categoria> oCategoria = repoCategorias.findById(2);
		if(oCategoria.isPresent()) {
			Categoria catTmp = oCategoria.get();
			catTmp.setNombre("Finanzas");
			catTmp.setDescripcion("Desarrollo de sistemas financieros");
			repoCategorias.save(catTmp);
		}else {
			System.out.println("Categoria no encontrada");
		}
	}
	
	private void eliminar() {
		int idCategoria = 3;
		repoCategorias.deleteById(idCategoria);
	}
	
	private void conteo() {
		long count = repoCategorias.count();
		System.out.println("El total de categorias es " + count);
	}
	
	private void eliminarTodos() {
		repoCategorias.deleteAll(); //Ejecuta una sentencia delete por cada registro
	}
	
	private void encontrarPorIds() {
		List<Integer> ids = new LinkedList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(10);
		Iterable<Categoria> categorias = repoCategorias.findAllById(ids);
		categorias.forEach(categoria -> {
			System.out.println(categoria);
		});
	}
	
	private void buscarTodos() {
		List<Categoria> categorias = (List<Categoria>)repoCategorias.findAll();
		categorias.stream().forEach(System.out::println);
	}
	
	private void existeId() {
		boolean existe = repoCategorias.existsById(5);
		System.out.println("La categoria existe? " + existe);
	}
	
	private void guardarTodo() {
		repoCategorias.saveAll(getListaCategorias());
	}
	
	private List<Categoria> getListaCategorias(){
		List<Categoria> lista = new LinkedList<Categoria>();
		
		Categoria cat1 = new Categoria();
		cat1.setNombre("Programador de BlockChain");
		cat1.setDescripcion("Trabajos relacionados con bitcoin y criptomonedas");
		
		Categoria cat2 = new Categoria();
		cat2.setNombre("Programador Phyton");
		cat2.setDescripcion("Trabajos relacionados con Django y Phyton");
		
		Categoria cat3 = new Categoria();
		cat3.setNombre("Programador Javascript");
		cat3.setDescripcion("Trabajos relacionados con Angular y React");
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;
	}
	
	private void buscarTodosJpa() {
		List<Categoria> categorias = repoCategorias.findAll();
		categorias.stream().forEach(System.out::println);
	}
	
	
	private void borrarTodoEnBloque() {
		repoCategorias.deleteAllInBatch(); //Un solo delete y nada mas
	}
	
	// Metodo findAll [ordenados por un campo] -Interface PagingAndSortingRepository
	private void buscarTodosOrdenados() {
		List<Categoria> categorias = (List<Categoria>)repoCategorias.findAll(Sort.by("nombre").descending());
		categorias.stream().forEach(System.out::println);
	}
	
	private void buscarTodosPaginacion() {
		Page<Categoria> categoriaPage = repoCategorias.findAll(PageRequest.of(1, 5));
		System.out.println("Total registros " + categoriaPage.getTotalElements());
		System.out.println("Total Paginas " + categoriaPage.getTotalPages());
		categoriaPage.stream().forEach(categoria->{
			System.out.println("El nombre " + categoria.getNombre());
		});
	}
	
	private void buscarTodosPaginacionOrdenados() {
		Page<Categoria> categoriaPage = repoCategorias.findAll(PageRequest.of(1, 5, Sort.by("descripcion").descending()));
		System.out.println("Total registros " + categoriaPage.getTotalElements());
		System.out.println("Total Paginas " + categoriaPage.getTotalPages());
		categoriaPage.stream().forEach(categoria->{
			System.out.println("El id " + categoria.getId() + " \n La Descripcion " + categoria.getDescripcion());
		});
	}
	
	private List<Perfil> getPerfilesAplicacion(){
		List<Perfil> lista = new LinkedList<Perfil>();
		
		Perfil per1 = new Perfil();
		per1.setPerfil("SUPERVISOR");
		
		Perfil per2 = new Perfil();
		per2.setPerfil("ADMINISTRADOR");
		
		Perfil per3 = new Perfil();
		per3.setPerfil("USUARIO");
		
		lista.add(per1);
		lista.add(per2);
		lista.add(per3);
		
		return lista;
	}
}
