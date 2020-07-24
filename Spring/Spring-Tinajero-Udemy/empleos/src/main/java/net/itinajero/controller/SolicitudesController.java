package net.itinajero.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.model.Solicitud;
import net.itinajero.model.Usuario;
import net.itinajero.model.Vacante;
import net.itinajero.service.ISolicitudesService;
import net.itinajero.service.IVacantesService;
import net.itinajero.util.Utileria;

@Controller
@RequestMapping(value="/solicitudes")
public class SolicitudesController {
	
	Logger logger = LoggerFactory.getLogger(SolicitudesController.class);
	
	@Value("${empleos.ruta.archivosCV}")
	private String ruta;
	
	@Autowired
	@Qualifier("vacantesServiceImplJpa")
	private IVacantesService serviceVacante;
	
	@Autowired
	private ISolicitudesService serviceSolicitudes;
	
	@RequestMapping(value="/create/{id}", method=RequestMethod.GET)
	public String crearSolicitud(Solicitud solicitud, @PathVariable("id") int id, Model model) {
		logger.info("El id de la vacante es {}", id );
		Vacante vacante = serviceVacante.buscarPorId(id);
		model.addAttribute("vacante", vacante);
		return "solicitudes/formSolicitud";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView salvarSolicitud(Solicitud solicitud, @RequestParam("vacanteId") int idVacante, 
			@RequestParam("archivoCV") MultipartFile multiPart, HttpSession session, HttpServletResponse response,
			RedirectAttributes attributes) {
		Usuario usuario = (Usuario) session.getAttribute("usuario");
		logger.info("El objeto solicitud {}", solicitud);
		logger.info("la vacante id {} ", idVacante);
		logger.info("el archivoCV {}", multiPart.getOriginalFilename());
		logger.info("El usuario Id {}", usuario.getId());
		serviceSolicitudes.guardar(solicitud, idVacante, (int)usuario.getId(), multiPart);
		attributes.addFlashAttribute("msg", "La solicitud fue enviada, revisa tus solicitudes en la opción del menu");

		return new ModelAndView("redirect:/"); //Para que funcione el addFlashAttibute,
		//En caso contrario utiliza la linea siguiente, solo puede redireccionar a urls sin agregarles el flashattribute
		//response.sendRedirect("/");
		
	}
	
	@RequestMapping(value="/myself", method=RequestMethod.GET)
	public String indexSolicitudes(Model model, HttpSession session) {
		Usuario usuario = (Usuario)session.getAttribute("usuario");
		List<Object[]> resultados = serviceSolicitudes.getMyApplications(usuario.getId());
		resultados.forEach(resultado ->{
			logger.info("La Categoria de solicitud es {}", resultado[0]);
			logger.info("La Vacante de solicitud es {}", resultado[1]);
			logger.info("El cantidato de la solicitud es {}", resultado[2]);
			logger.info("La fecha de la solicitud es {}", resultado[3]);
		});
		model.addAttribute("solicitudes", resultados);
		return "solicitudes/listSolicitudes";
	}
	
	@GetMapping("/editar/{id}/{idVacante}")
	public String editar(@PathVariable("id") int idSolicitud, @PathVariable("idVacante") int idVacante, Model model) {
		Solicitud solicitud = serviceSolicitudes.encontrarPorId(idSolicitud);
		model.addAttribute("solicitud", solicitud);
		Vacante vacante = serviceVacante.buscarPorId(idVacante);
		model.addAttribute("vacante", vacante);
		return "solicitudes/formSolicitud";
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView eliminar(@PathVariable("id") int idSolicitud, RedirectAttributes attributes) {
		Solicitud solicitud = serviceSolicitudes.encontrarPorId(idSolicitud);
		String rutaFile = new StringBuilder()
				.append(this.ruta)
				.append(solicitud.getArchivo())
				.toString();
		boolean isDeleteAFile = Utileria.eliminarArchivo(rutaFile);
		serviceSolicitudes.eliminar(idSolicitud);
		if(isDeleteAFile) {			
			attributes.addFlashAttribute("msg", "La solicitud fue eliminada, junto con el cv");
		}else {			
			attributes.addFlashAttribute("msg", "La solicitud fue eliminada");
		}
		return new ModelAndView("redirect:/");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, "fecha", new CustomDateEditor(dateFormat, true));
 	}

}
