package sanchez.jay.usoDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Datetime.usarNow();
		Datetime.usarOf();
	}
	
	public static void usarOf() { //Este metodo of es sobreCargado para todas las clases de time
		LocalDate fechaActual = LocalDate.of(2019, Month.MARCH, 28); //Este metodo te crea el objeto tipo localDate a partir de los parametros dentro del of
		LocalTime horaActual = LocalTime.of(12, 34); //De la misma manera, of creará un objeto de tipo localtime a partir de los parametros de of
		LocalDateTime fechaYHoraActual = LocalDateTime.of(2010, 3, 28, 20, 2, 12, 12); //El metodo statico of de LocalDateTime es mas sobrecargado ya que permite distintas modalidades de los parametros de los cuales se creara la instancia
	
		System.out.println("La fecha actual usando of " + fechaActual );
		System.out.println("La hora actual usando of " + horaActual );
		System.out.println("La fecha y hora actual usando of " + fechaYHoraActual );
	}
	
	public static void usarNow() {
		LocalDate fechaActual = LocalDate.now();
		LocalTime horaActual = LocalTime.now();
		LocalDateTime fechaYHoraActual = LocalDateTime.now();
		
		System.out.println("La fecha actual "+ fechaActual);
		System.out.println("La hora actual "+ horaActual);
		System.out.println("La fecha y hora  actual "+ fechaYHoraActual); //La hora se separa de la fecha con la 
																		  //Letra T y la muestra en minutos segundos y nanosegundos
	}
}
