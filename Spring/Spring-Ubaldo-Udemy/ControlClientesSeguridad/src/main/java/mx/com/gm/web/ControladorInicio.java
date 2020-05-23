package mx.com.gm.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IPersonaDAO;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author mrjay
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    //Spring inyecta una instancia de la impl, solo indicando el tipo de la interface, spring busca impl de dicha interface
    //podriamos cambiar la implementacion sin afectar los controladores
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")//Por detras se esta utilizando la tecnologia de los servlets
    public String inicio (Model model, @AuthenticationPrincipal User user){
        Iterable<Persona> personas = personaService.listarPersonas();
        log.info("ejecutando el controlardor spring MVC");
        log.info("usuario que hizo login: " + user);
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}") //El objeto de tipo persona es inicializado con el id de la persona que viene en el parametro
    public String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }

}

// url para configurar conexion de zona horaria a mysql (si no se hace puede dar error)
//jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC 
