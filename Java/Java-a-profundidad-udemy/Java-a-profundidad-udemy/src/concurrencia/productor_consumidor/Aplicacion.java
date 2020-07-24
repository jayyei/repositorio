package concurrencia.productor_consumidor;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer b = new Buffer();
		Productor prod = new Productor(b);
		Consumidor cons = new Consumidor(b);
		
		Thread tProd = new Thread(prod);
		Thread tCons = new Thread(cons);
		
		tProd.start();
		tCons.start();
		
		
	}

}
