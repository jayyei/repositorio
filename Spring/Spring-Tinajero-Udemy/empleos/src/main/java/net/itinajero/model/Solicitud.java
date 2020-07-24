package net.itinajero.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="solicitudes")
public class Solicitud {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Date fecha = new Date();
	
	private String archivo;
	
	private String comentarios;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="idUsuario") //TODO ver que hace sin los joinColumn
	private Usuario usuario;
	
	//cascade = CascadeType.ALL, permite que al eliminar una entidad de este tipo se borren ademas
	//las entidades pertenecientes al modelo, por ejemplo en este caso si se colocase este parametro
	//al borrar o actualizar una solicitud, se actualizaria o borraria tambien la vacante asociada
	//Esto tambien pasaria con el usuario asociado, siempre y cuando no sea este llave foranea en otra tabla
	@ManyToOne(optional = false,  fetch = FetchType.EAGER)
	@JoinColumn(name="idVacante")
	private Vacante vacante;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Vacante getVacante() {
		return vacante;
	}
	public void setVacante(Vacante vacante) {
		this.vacante = vacante;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Solicitud [id=");
		builder.append(id);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", archivo=");
		builder.append(archivo);
		builder.append(", comentarios=");
		builder.append(comentarios);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", vacante=");
		builder.append(vacante);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
