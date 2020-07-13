package net.itinajero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.model.Categoria;
import net.itinajero.service.ICategoriasService;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService categoriasService;
	
	//@GetMapping("/index")
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostrarIndex(Model model) {
		List<Categoria> categorias = categoriasService.buscarTodas();
		model.addAttribute("categorias", categorias);
		return "categorias/listCategorias";
	}
	
	//@GetMapping("/create")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear() {
		return "categorias/formCategoria";
	}
	
	//@PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error: result.getAllErrors()) {
				System.out.println("Ocurrio un error en el " + error.getDefaultMessage());
			}
			return "vacantes/formCategoria";
		}
		categoriasService.guardar(categoria);
		System.out.println(categoria);
		attributes.addFlashAttribute("msg", "Registro Guardado");
		return "redirect:/categorias/index";
	}
}
