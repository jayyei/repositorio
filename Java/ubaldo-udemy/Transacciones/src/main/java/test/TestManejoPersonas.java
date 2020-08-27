
package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            PersonaDAO personaDao = new PersonaDAO(conexion);
            personaDao.actualizar(
                    new Persona(2, "Karlota", "Larota", "klarota@gmail.com", "1234567890"));
            
            personaDao.insertar(
                    new Persona("Jay", "Sanchez", "mrjay9628@gmail.com", "5581669223"));
            
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
