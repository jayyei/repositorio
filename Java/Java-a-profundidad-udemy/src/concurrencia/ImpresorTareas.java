package concurrencia;

import java.security.SecureRandom;

public class ImpresorTareas implements Runnable{
	//para hacer tareas de multihilos necesitamos dos interfaces runnable y executor
	//Los objetos de tipo runnable son las tareas que se pueden ejecutar de manera concurrente
	//los objetos executor son aquellos que van a ejecutar la tareas concurrentes
	//los objetos runnable pueden ejecutarse de manera concurrente
	
	private static final SecureRandom generador = new SecureRandom();
	private final int sleepTime;
	private final String nombreTarea;
	
	public ImpresorTareas(String nombreTar) {
		this.nombreTarea = nombreTar;
		sleepTime = generador.nextInt(5000);
	}
	
	@Override
	public void run() {
		try {
			System.out.printf("%s se fue a dormir %d milisegundos%n%n", this.nombreTarea, sleepTime);
			Thread.sleep(sleepTime);
		}catch(InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
