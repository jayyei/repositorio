package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IPersonaDAO;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String inicio (Model model){
        Iterable<Persona> personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }
}

// url para configurar conexion de zona horaria a mysql (si no se hace puede dar error)
//jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC 
