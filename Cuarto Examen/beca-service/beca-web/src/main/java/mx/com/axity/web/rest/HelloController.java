package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IbecaFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("beca")
@Api(value="beca", description="Operaciones con beca")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    IbecaFacade IbecaFacade;



    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllUsers() {
        LOG.info("Se invoca /users");
        List<UserTO> users = this.IbecaFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UserTO userTO) {
        LOG.info(userTO.getName());
        LOG.info(userTO.getAge());
        LOG.info(userTO.getId());
        LOG.info(userTO.getLastName());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/use", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity findUser(@RequestParam(value = "id") int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity test() {
        LOG.info("Se invoca /test");
        return new ResponseEntity<>("Prueba Ok", HttpStatus.OK);
    }

    @RequestMapping(value = "/operation", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity operation() {
        LOG.info("Se invoca /operation");
        int result = this.IbecaFacade.operation(5,10);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity create(@RequestBody UserTO userTO) {
        LOG.info(userTO.getId());
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getAge());
        this.IbecaFacade.create(userTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@RequestParam(value = "id")long id) {
        this.IbecaFacade.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity update(@RequestBody UserTO userTO) {
        this.IbecaFacade.update(userTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity read(@RequestParam(value = "id") long id) {
        UserTO user = this.IbecaFacade.find(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //Comienzan los request para el login
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity find(@RequestParam(value = "id") long id, @RequestParam(value = "password") String password) {
        LoginTO login = this.IbecaFacade.findLogin(id, password);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity create(@RequestBody LoginTO loginTO) {
        LOG.info(loginTO.getId());
        LOG.info(loginTO.getUser());
        LOG.info(loginTO.getPassword());
        this.IbecaFacade.createLogin(loginTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity update(@RequestBody LoginTO loginTO) {
        this.IbecaFacade.updateLogin(loginTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteLogin(@RequestParam(value = "id")long id) {
        this.IbecaFacade.deleteLogin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
