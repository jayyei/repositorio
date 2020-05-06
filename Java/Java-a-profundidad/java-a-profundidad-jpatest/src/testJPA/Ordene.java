package testJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ordenes database table.
 * 
 */
@Entity
@Table(name="ordenes")
@NamedQuery(name="Ordene.findAll", query="SELECT o FROM Ordene o")
public class Ordene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordenid;

	private int descuento;

	@Temporal(TemporalType.DATE)
	private Date fechaorden;

	//bi-directional many-to-one association to DetalleOrdene
	@OneToMany(mappedBy="ordene")
	private List<DetalleOrdene> detalleOrdenes;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="CLIENTEID")
	private Cliente cliente;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="EMPLEADOID")
	private Empleado empleado;

	public Ordene() {
	}

	public int getOrdenid() {
		return this.ordenid;
	}

	public void setOrdenid(int ordenid) {
		this.ordenid = ordenid;
	}

	public int getDescuento() {
		return this.descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public Date getFechaorden() {
		return this.fechaorden;
	}

	public void setFechaorden(Date fechaorden) {
		this.fechaorden = fechaorden;
	}

	public List<DetalleOrdene> getDetalleOrdenes() {
		return this.detalleOrdenes;
	}

	public void setDetalleOrdenes(List<DetalleOrdene> detalleOrdenes) {
		this.detalleOrdenes = detalleOrdenes;
	}

	public DetalleOrdene addDetalleOrdene(DetalleOrdene detalleOrdene) {
		getDetalleOrdenes().add(detalleOrdene);
		detalleOrdene.setOrdene(this);

		return detalleOrdene;
	}

	public DetalleOrdene removeDetalleOrdene(DetalleOrdene detalleOrdene) {
		getDetalleOrdenes().remove(detalleOrdene);
		detalleOrdene.setOrdene(null);

		return detalleOrdene;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}