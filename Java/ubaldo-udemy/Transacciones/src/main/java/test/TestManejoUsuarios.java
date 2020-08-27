
package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
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
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            
            usuarioDao.insertar(new Usuario("juarecita", "jguzman123"));
            usuarioDao.actualizar(new Usuario(3, "Juarezota", "jguzman567"));
            
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
