package concurrencia.productor_consumidor;

public class Buffer {
	
	private char contenido;
	private boolean disponible = false;
	
	public synchronized char recoger() {
		
		while(!disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		disponible = false;
		notify();
		return contenido;
		
	}
	
	public synchronized void poner(char c) {
		while(disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.contenido = c;
		disponible = true;
		notify();
	}

}
