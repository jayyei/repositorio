package testJPA;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detalle_ordenes database table.
 * 
 */
@Entity
@Table(name="detalle_ordenes")
@NamedQuery(name="DetalleOrdene.findAll", query="SELECT d FROM DetalleOrdene d")
public class DetalleOrdene implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetalleOrdenePK id;

	private int cantidad;

	//bi-directional many-to-one association to Ordene
	@ManyToOne
	@JoinColumn(name="ORDENID")
	private Ordene ordene;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="PRODUCTOID")
	private Producto producto;

	public DetalleOrdene() {
	}

	public DetalleOrdenePK getId() {
		return this.id;
	}

	public void setId(DetalleOrdenePK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Ordene getOrdene() {
		return this.ordene;
	}

	public void setOrdene(Ordene ordene) {
		this.ordene = ordene;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}