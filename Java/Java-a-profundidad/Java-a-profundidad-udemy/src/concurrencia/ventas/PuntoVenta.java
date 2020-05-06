package concurrencia.ventas;

public class PuntoVenta {

	public static void main (String[] args) {
		Producto producto = new Producto("Jabon", 20);
		
		Sucursal sucursal1 = new Sucursal(producto);
		
		Thread javier = new Thread(sucursal1, "Javier");
		Thread francisco = new Thread(sucursal1, "Francisco");
		Thread alfonso = new Thread(sucursal1, "Alfonso");
		Thread jose = new Thread(sucursal1, "Jose");
		Thread ramiro = new Thread(sucursal1, "Ramiro");
		Thread samuel = new Thread(sucursal1, "Samuel");
		
		javier.start();
		francisco.start();
		alfonso.start();
		jose.start();
		ramiro.start();
		samuel.start();
		
	}
}
