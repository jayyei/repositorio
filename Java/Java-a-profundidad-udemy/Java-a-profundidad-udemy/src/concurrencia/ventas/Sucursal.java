package concurrencia.ventas;


public class Sucursal implements Runnable {

	Producto prod;
	
	
	public Sucursal(Producto prod) {
		this.prod = prod;
	}

	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			try {
				venderProducto(2);
				if(prod.getExistencia() < 0) {
					System.out.println(""
							+ "Existen inconsistencias en la existencia del producto");
				}
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void venderProducto(int cantidadVendida) {
		/*o mediante 
		 * synchronized(this o Sucursal.class){ solo si no quieres que todo el metodo este sincronizado
		 * }
		 */
		
		if(prod.getExistencia()>= cantidadVendida) {
			System.out.printf("La existencia del producto %s es %d%n",
					prod.getNombreProd(), prod.getExistencia());
			System.out.printf("El cajero que realiza la venta es %s%n",
					Thread.currentThread().getName());
			
			prod.venderProducto(cantidadVendida);
			
			System.out.println("Venta realizada. nueva existencia: " + prod.getExistencia() + "\n\n");
		}
	}
	
}
