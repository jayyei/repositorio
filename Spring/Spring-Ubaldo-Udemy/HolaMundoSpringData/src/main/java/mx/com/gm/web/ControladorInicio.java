package mx.com.gm.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IPersonaDAO;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    
    @Autowired
    private IPersonaDAO personaDAO;
    
    @GetMapping("/")//Por detras se esta utilizando la tecnologia de los servlets
    public String inicio (Model model){
        Iterable<Persona> personas = personaDAO.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }
}

// url para configurar conexion de zona horaria a mysql (si no se hace puede dar error)
//jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC 
