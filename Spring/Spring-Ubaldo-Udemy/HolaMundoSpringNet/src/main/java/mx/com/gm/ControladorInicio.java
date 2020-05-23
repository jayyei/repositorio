package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mrjay
 */
@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio (){
        log.info("Ejecutando el controlador rest");
        log.debug("Mas detalle de nuestra aplicacion");
        return "Hola Mundo con Spring Boot";
    }
}
