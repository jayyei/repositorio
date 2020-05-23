/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mrjay
 */

//Spring ahora tiene el control de implementar automaticamente esta interfaz sin necesidad de realizar una clase que la implemente como antes se hacia

public interface IPersonaDAO extends CrudRepository<Persona, Long> {
    
}
