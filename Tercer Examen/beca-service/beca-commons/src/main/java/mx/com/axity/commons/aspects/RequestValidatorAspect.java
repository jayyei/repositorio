package mx.com.axity.commons.aspects;

import com.oracle.jrockit.jfr.InvalidValueException;
import mx.com.axity.commons.exceptions.BusinessException;
import mx.com.axity.commons.to.ErrorTo;
import org.apache.catalina.webresources.EmptyResource;
import org.apache.catalina.webresources.EmptyResourceSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.omg.CORBA.DynAnyPackage.InvalidValue;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.nio.file.NoSuchFileException;
import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

@Aspect
@Configuration
public class RequestValidatorAspect {

    static final Logger LOG = LogManager.getLogger(RequestValidatorAspect.class);

    @Around(value = "execution(* mx.com.axity.web.rest.*.*(..))  && args(..)")
    public ResponseEntity execute(ProceedingJoinPoint joinPoint) {
        ResponseEntity result;
        try {
            LOG.info("Access");
            LOG.info(String.format("Execution: %s", joinPoint.getSignature()));
            result = (ResponseEntity) joinPoint.proceed();
            return result;
        }catch (Throwable e) {
            ErrorTo errorTo = new ErrorTo();
            if (e instanceof NoSuchFileException){
                errorTo.setErrorCode(1);
                errorTo.setErrorMessage("Error uno");
                return new ResponseEntity<>(errorTo, HttpStatus.FORBIDDEN);
            }
             else if (e instanceof IllegalArgumentException){
                errorTo.setErrorCode(404);
                errorTo.setErrorMessage("No existe registro");
                return new ResponseEntity<>(errorTo, HttpStatus.NOT_FOUND);
            }

            else if (e instanceof NullPointerException){
                errorTo.setErrorCode(3);
                errorTo.setErrorMessage("Error uno prueba put update");
                return new ResponseEntity<>(errorTo, HttpStatus.FORBIDDEN);
            }


            LOG.info("Exception Ocurred");
            LOG.info("Execution: {}", joinPoint.getSignature());
            LOG.info("Exception: {}", e.getMessage());
            LOG.info(e.toString());
            return new ResponseEntity<>(errorTo, HttpStatus.NOT_FOUND);
            //throw new BusinessException("Error", e);
        }
    }
}
