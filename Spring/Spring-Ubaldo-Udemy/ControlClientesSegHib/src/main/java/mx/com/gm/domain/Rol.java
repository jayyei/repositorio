package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author mrjay
 */ 
@Entity
@Data  //Patrocinada por lombok, esta anotacion te permite omitir getters, setters de tu entidad, ella la genera por ti
@Table(name="role")
public class Rol implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
    private Long idRol;
    
    @NotEmpty
    @Column(name="nombre")
    private String nombre;
}
