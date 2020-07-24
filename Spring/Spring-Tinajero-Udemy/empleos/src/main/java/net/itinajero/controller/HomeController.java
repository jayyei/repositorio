package net.itinajero.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;
import net.itinajero.service.ICategoriasService;
import net.itinajero.service.IUsuariosService;
import net.itinajero.service.IVacantesService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	@Qualifier("vacantesServiceImplJpa")
	private IVacantesService serviceVacantes;
	
	@Autowired
	private IUsuariosService serviceUsuarios;
	
	@Autowired
	@Qualifier("categoriasServiceImplJpa")
	private ICategoriasService serviceCategorias;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de Comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		return "listado";
	}

	@GetMapping("/")
	public String mostrarHome(Model model, HttpSession session) {
		if(session.getAttribute("usuario") == null) {
		return "redirect:/index";
		}
		return "home";
	}
	
	
	/*Login: esta ruta posee dos metodos http, al hacer get deberia de renderizar la vista de formulario 
	 * o similar, al hacer post, deberia de enviar las credenciales de acceso en el cuerpo de la peticion*/
	
	@GetMapping("/login") 
	public String mostrarLogin() {		
		return "formLogin";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		SecurityContextLogoutHandler logoutHandler =
				new SecurityContextLogoutHandler();
		logoutHandler.logout(request, null, null);
		return "redirect:/login";
	}
	
	@GetMapping("/index")
	public String mostrarIndex(Authentication auth, HttpSession session) {
		String username = auth.getName();
		for (GrantedAuthority rol : auth.getAuthorities()) {
			logger.info("Rol: {} ", rol.getAuthority());
		};
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = serviceUsuarios.buscarPorUsername(username);
			usuario.setPassword(null); //Para evitar almacenar la contraseña en la session
			session.setAttribute("usuario", usuario);
		}
		return "redirect:/";
	}
	
	@RequestMapping(value="/usuarios/index", method=RequestMethod.GET)
	public String indexUsuarios(Model model) {
		List<Usuario> usuarios = serviceUsuarios.buscarTodos();
		model.addAttribute("usuarios", usuarios);
		return "/usuarios/listUsuarios";
	}
	
	@GetMapping("/usuarios/create")
	public String createUsuarios(Usuario usuario) {
		return "/usuarios/formRegistro";
	}
	
	@GetMapping("/usuarios/eliminar/{id}")
	public String deleteUsuarios(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {
		serviceUsuarios.eliminar(idUsuario);
		attributes.addFlashAttribute("msg", "Usuario Eliminado");
		return "redirect:/usuarios/index";
	}
	
	@RequestMapping(value="/usuarios/save", method=RequestMethod.POST)
	public String guardarUsuario(Usuario usuario, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error: result.getAllErrors()) {
				System.out.println("Ocurrio un error en el " + error.getDefaultMessage());
			}
			return "/usuarios/formRegistro";
		}
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		serviceUsuarios.guardar(usuario);
		attributes.addFlashAttribute("msg", "Usuario Guardado");
		return "redirect:/usuarios/index";
	}
	
	@GetMapping("/search")
	public String buscar(@ModelAttribute("search") Vacante vacante, Model model) { //Aqui se aplica implicitamente data binding
		System.out.println("Buscando por " + vacante);
		
		//TODO realizar esta busqueda por jpql
		//List<Vacante> lista = serviceVacantes.buscarByExample(example);
		List<Vacante> lista = serviceVacantes.buscarByJpql(vacante);
		model.addAttribute("vacantes", lista);
		return "home";
	}
	
	//Init binder para strings, si los detecta vacios los setea a null
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	@ModelAttribute //A nivel de metodo de un controlador, esta anotacion sirve para agregar atributos al modelo, pero todos estaran disponibles para todos los metodos declarados en el controller 
	public void setGenericos(Model model) {
		Vacante vacanteSearch = new Vacante();
		vacanteSearch.setImagen(null);;
		model.addAttribute("search", vacanteSearch);
		model.addAttribute("categorias", serviceCategorias.buscarTodas());
		model.addAttribute("vacantes", serviceVacantes.buscarDestacadas());
	}
	
}
