package sanchez.jay.ejercicios2poo;

public class ClaseSucursal {
	
		private int numeroSucursal;
		private String direccion;
		private String ciudad;
		
	public ClaseSucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;  
	}
	
	public double setPrecio(ClasePaquete paquete) {
		double precio;
		precio = paquete.getPeso();
		precio += (paquete.getPrioridad()==1)? 10 : 0;
		precio += (paquete.getPrioridad()==2)? 20 : 0;
		return precio;
	}
	
	@Override
	public String toString() {
		return "numeroSucursal=" + numeroSucursal + ", direccion=" + direccion + ", ciudad=" + ciudad;
	}

	public int getNumeroSucursal() {
		return this.numeroSucursal;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}

}
