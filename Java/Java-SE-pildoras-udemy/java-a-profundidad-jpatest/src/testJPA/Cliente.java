package testJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int clienteid;

	@Column(name="CEDULA_RUC")
	private String cedulaRuc;

	private String celular;

	private String direccioncli;

	private String email;

	private String fax;

	private String fijo;

	private String nombrecia;

	private String nombrecontacto;

	//bi-directional many-to-one association to Ordene
	@OneToMany(mappedBy="cliente")
	private List<Ordene> ordenes;

	public Cliente() {
	}

	public int getClienteid() {
		return this.clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}

	public String getCedulaRuc() {
		return this.cedulaRuc;
	}

	public void setCedulaRuc(String cedulaRuc) {
		this.cedulaRuc = cedulaRuc;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccioncli() {
		return this.direccioncli;
	}

	public void setDireccioncli(String direccioncli) {
		this.direccioncli = direccioncli;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFijo() {
		return this.fijo;
	}

	public void setFijo(String fijo) {
		this.fijo = fijo;
	}

	public String getNombrecia() {
		return this.nombrecia;
	}

	public void setNombrecia(String nombrecia) {
		this.nombrecia = nombrecia;
	}

	public String getNombrecontacto() {
		return this.nombrecontacto;
	}

	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}

	public List<Ordene> getOrdenes() {
		return this.ordenes;
	}

	public void setOrdenes(List<Ordene> ordenes) {
		this.ordenes = ordenes;
	}

	public Ordene addOrdene(Ordene ordene) {
		getOrdenes().add(ordene);
		ordene.setCliente(this);

		return ordene;
	}

	public Ordene removeOrdene(Ordene ordene) {
		getOrdenes().remove(ordene);
		ordene.setCliente(null);

		return ordene;
	}

}