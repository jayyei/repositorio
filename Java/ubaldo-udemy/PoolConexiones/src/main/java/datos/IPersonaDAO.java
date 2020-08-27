/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mrjay
 */
public interface IPersonaDAO {
    
    public List<PersonaDTO> seleccionar() throws SQLException;
    
    public int insertar(PersonaDTO persona) throws SQLException;
    
    public int actualizar(PersonaDTO persona) throws SQLException;
    
    public int eliminar(PersonaDTO persona) throws SQLException;
    
}
