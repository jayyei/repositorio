package mx.com.gm.dao;

import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mrjay
 */
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
