
package test;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author mrjay
 */
public class TestManejoPersonas {
    public static void main(String[] args){
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            IPersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            
            personas.forEach(System.out::println);
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
                System.out.println("Error al hacer rollback");
            }
        }
        
    }
}
