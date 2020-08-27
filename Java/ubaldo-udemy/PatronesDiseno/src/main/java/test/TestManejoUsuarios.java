
package test;

import datos.Conexion;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mrjay
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDaoJDBC usuarioDao = new UsuarioDaoJDBC(conexion);
            
            List<UsuarioDTO> usuarios = usuarioDao.seleccionar();
            usuarios.forEach(System.out::println);
            
            
            conexion.commit();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
}
