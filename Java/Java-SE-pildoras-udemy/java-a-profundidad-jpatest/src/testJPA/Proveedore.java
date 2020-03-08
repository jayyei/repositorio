package testJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the proveedores database table.
 * 
 */
@Entity
@Table(name="proveedores")
@NamedQuery(name="Proveedore.findAll", query="SELECT p FROM Proveedore p")
public class Proveedore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int proveedorid;

	private String celuprov;

	private String contacto;

	private String fijoprov;

	private String nombreprov;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="proveedore")
	private List<Producto> productos;

	public Proveedore() {
	}

	public int getProveedorid() {
		return this.proveedorid;
	}

	public void setProveedorid(int proveedorid) {
		this.proveedorid = proveedorid;
	}

	public String getCeluprov() {
		return this.celuprov;
	}

	public void setCeluprov(String celuprov) {
		this.celuprov = celuprov;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getFijoprov() {
		return this.fijoprov;
	}

	public void setFijoprov(String fijoprov) {
		this.fijoprov = fijoprov;
	}

	public String getNombreprov() {
		return this.nombreprov;
	}

	public void setNombreprov(String nombreprov) {
		this.nombreprov = nombreprov;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setProveedore(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setProveedore(null);

		return producto;
	}

}