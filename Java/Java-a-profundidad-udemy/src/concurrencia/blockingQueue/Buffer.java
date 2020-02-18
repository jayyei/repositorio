package concurrencia.blockingQueue;

public interface Buffer {
	
	//coloca valores int dentro del buffer
	public void blockingPut (int value) throws InterruptedException;
	
	//retorna un valor int desde el buffer
	public int blockingGet() throws InterruptedException;
	
	

}
