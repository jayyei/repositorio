package net.itinajero.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="usuarios")
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String email;
	private String username;
	private String password;
	private Integer estatus = 1;
	private Date fechaRegistro = new Date();
	
	/* para comenzar la relacion manytomany se generara una tabla union, que puede vivir definida
	 * en cualquiera de las dos entidades, pero solo en una de ellas, em ambas entidades debe de 
	 * existir un conjunto o coleccion en donde se guarden los objetos,
	 */
	
	@ManyToMany(fetch=FetchType.EAGER) //EAGER : Trae estos elementos de forma inmedianta, FETCH: Es la forma perezosa
	@JoinTable( //El JoinTable Te creara una tabla de union en la base de datos
		name="usuarioPerfil",
		joinColumns = @JoinColumn(name="idUsuario"), //Hace referencia a la llave de esta entidad
		inverseJoinColumns = @JoinColumn(name="idPerfil")) //Hace referencia a la llave de la entidad Perfil
	private List<Perfil> perfiles; 
	
	public void agregar(Perfil tempPerfil) {
		if(perfiles == null) {
			perfiles = new LinkedList<Perfil>();
		}
		perfiles.add(tempPerfil);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getEstatus() {
		return estatus;
	}
	
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", estatus=");
		builder.append(estatus);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
