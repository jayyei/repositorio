
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author mrjay
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        List<Usuario> usuarios = null;
        
//        Usuario usuario = new Usuario("jayyei", "charolito");
//        usuarioDao.insertar(usuario);
        
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(System.out::println);
        
        Usuario usuarioActualizar = new Usuario(2, "jayyei", "charolito55694");
        usuarioDao.actualizar(usuarioActualizar);
        
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(System.out::println);
        
        Usuario usuarioBorrar = new Usuario(2);
        usuarioDao.eliminar(usuarioBorrar);
        
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(System.out::println);
        
        
    }
}
