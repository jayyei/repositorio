/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mrjay
 */
public interface IUsuarioDAO {
    public List<UsuarioDTO> seleccionar() throws SQLException;
    
    public int insertar(UsuarioDTO usuario) throws SQLException;
    
    public int actualizar(UsuarioDTO usuario) throws SQLException;
    
    public int eliminar(UsuarioDTO usuario) throws SQLException;
}
