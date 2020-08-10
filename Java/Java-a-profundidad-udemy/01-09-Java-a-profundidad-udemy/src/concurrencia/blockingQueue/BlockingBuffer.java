package concurrencia.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer {
	//buffer compartido
	private final ArrayBlockingQueue<Integer> buffer;
	
	
	public BlockingBuffer() {
		this.buffer = new ArrayBlockingQueue<Integer>(1); //esta capacidad del buffer ya no nse puede cambiar
	}

	@Override
	public void blockingPut(int value) throws InterruptedException {
		// TODO Auto-generated method stub
		buffer.put(value);
		System.out.printf("%s%2d\t%s%d%n", "El productor escribe", value,
				"Elementos en el buffer: ", buffer.size());
	}

	@Override
	public int blockingGet() throws InterruptedException {
		int readValue = buffer.take();
		System.out.printf("%s %2d\t%s%d%n", "El consumer lee",
				readValue, "Elementos en el buffer", buffer.size());
		
		return readValue;
	}

}
