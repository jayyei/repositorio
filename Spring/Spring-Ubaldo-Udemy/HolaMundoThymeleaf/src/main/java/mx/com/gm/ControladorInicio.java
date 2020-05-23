package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
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
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")//Por detras se esta utilizando la tecnologia de los servlets
    public String inicio (Model model){
        log.info("Ejecutando el controlador Spring MVC");
        String mensaje = "Hola con thymeleaf";
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("55443322");
        
        Persona persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@gmail.com");
        persona2.setTelefono("13229900");
        
        /*List<Persona> personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);*/
        
        List<Persona> personas = Arrays.asList(persona, persona2);
        model.addAttribute("mensaje",mensaje );
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    }
}

// url para configurar conexion de zona horaria a mysql (si no se hace puede dar error)
//jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC 
