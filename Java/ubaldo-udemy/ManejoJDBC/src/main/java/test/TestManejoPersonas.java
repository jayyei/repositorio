
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author mrjay
 */
public class TestManejoPersonas {
    public static void main(String[] args){
        
        PersonaDAO personaDao = new PersonaDAO();
        
        List<Persona> personas = personaDao.seleccionar();
        for(Persona persona: personas){
            System.out.println("persona " + persona);
        }
        
        //Insertando un nuevo objeto de tipo persona
        Persona persona = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "0099887766");
        personaDao.insertar(persona);
        
        //Listado de personas actualizada
        personas = personaDao.seleccionar();
        
        personas.forEach(System.out::println);
        
        //Acutalizando una persona existente en la base de datos
        Persona personaActualizar = new Persona(2, "Karlita", "Larita", "klarita@gmail.com", "1010101010");
        personaDao.actualizar(personaActualizar);
        
        //Vuelve a mostrar el listado de personas actualizadas
        personas = personaDao.seleccionar();
        personas.forEach(System.out::println);
        
        //Eliminando personas
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        personaEliminar.setIdPersona(5);
        personaDao.eliminar(personaEliminar);
        personaEliminar.setIdPersona(6);
        personaDao.eliminar(personaEliminar);
        
        //Mostrar el listado ya borrado
        personas = personaDao.seleccionar();
        personas.forEach(System.out::println);
    }
}
