package concurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorTareas {
	public static void main(String[] args) {
		ImpresorTareas tarea1 = new ImpresorTareas("Tarea1");
		ImpresorTareas tarea2 = new ImpresorTareas("Tarea2");
		ImpresorTareas tarea3 = new ImpresorTareas("Tarea3");
		
		System.out.println("Iniciando el executor");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//iniciar las tres tareas
		executorService.execute(tarea1);
		executorService.execute(tarea2);
		executorService.execute(tarea3);
		
		executorService.shutdown(); //realiza un cierrre ordenado, espera a que las tareas que va realizando se terminen y no acepta nuevas tareas
		// executorService.shutdownNow(); //Acaba con todas la tareas
		System.out.printf("Tareas iniciadas, metodo main finalizado %n%n ");
	}
}
