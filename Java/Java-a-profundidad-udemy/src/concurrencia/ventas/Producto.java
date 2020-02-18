package concurrencia.ventas;

public class Producto {

	private int existencia;
	private String nombreProd;
	
	public Producto(String nombreProd, int existencia) {
		this.nombreProd = nombreProd;
		this.existencia = existencia;
	}

	public int getExistencia() {
		return existencia;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void venderProducto(int cantidadVendida) {
		existencia -= cantidadVendida;
	}
	
	
}
