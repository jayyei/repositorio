package testJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity //indica que es una clase de tipo entity
@Table(name="categorias") //Referencia a la tabla de la cual esta mapeada
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int categoriaid;

	private String nombrecat;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="categoria")
	private List<Producto> productos;

	public Categoria() {
	}

	public int getCategoriaid() {
		return this.categoriaid;
	}

	public void setCategoriaid(int categoriaid) {
		this.categoriaid = categoriaid;
	}

	public String getNombrecat() {
		return this.nombrecat;
	}

	public void setNombrecat(String nombrecat) {
		this.nombrecat = nombrecat;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setCategoria(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setCategoria(null);

		return producto;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaid=" + categoriaid + ", nombrecat=" + nombrecat + ", productos=" + productos + "]";
	}

}