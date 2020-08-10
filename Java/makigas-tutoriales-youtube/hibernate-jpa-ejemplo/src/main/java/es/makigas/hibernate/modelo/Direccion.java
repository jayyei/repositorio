package es.makigas.hibernate.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DIRECCION")
public class Direccion {
	
	@Id
	@Column(name = "ID_DIRECCION")
	private Long id;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "LOCALIDAD")
	private String Localidad;
	
	@Column(name = "PROVINCIA")
	private String provincia;
	
	@Column(name = "PAIS")
	private String pais;

	@OneToOne(mappedBy = "direccion",  fetch = FetchType.LAZY) //Creamos una relacion inversa, en la que direccion no es propietaria de nada, con mappedby indicamos como se llama el campo en el lado de empleado
	private Empleado empleado; //Fetch es ir a buscar, extraer, y con ese parametro le decimos de que manera lo hara, en este caso sera perezosa
	public Direccion() {
		
	}

	public Direccion(Long id, String direccion, String localidad, String provincia, String pais) {
		this.id = id;
		this.direccion = direccion;
		Localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", direccion=" + direccion + ", Localidad=" + Localidad + ", provincia="
				+ provincia + ", pais=" + pais + ", Empleado =" + empleado.getCodigo() +  " ]";
	}

	
	
}
