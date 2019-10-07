package sanchez.jay.usoDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Datetime.usarNow();
		//Datetime.usarOf();
		//Datetime.usarParse();
		//Datetime.regresaPartesDateTime();
		ComparaDateTime objeto = new ComparaDateTime();
		//objeto.isBefore();
		//objeto.isAfter();
		objeto.compareTo();
	}
	
	public static void regresaPartesDateTime() {
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println("La fecha y hora actual es " + fechaHora);
		System.out.println("El metodo getYear() regresa un entero anio  " + fechaHora.getYear());
		System.out.println("El metodo getMonth() regresa un objeto (mes)  " + fechaHora.getMonth());
		System.out.println("El metodo getMonthValue() regresa un entero mes  " + fechaHora.getMonthValue());
		System.out.println("El metodo getDayOfMonth() regresa un entero dia  " + fechaHora.getDayOfMonth());
		System.out.println("El metodo getDayOfYear() regresa un entero dia del anio " + fechaHora.getDayOfYear());
		System.out.println("El metodo getDayOfWeek() regresa un objeto que representa el dia de la semana " + fechaHora.getDayOfWeek());
		System.out.println("El metodo getHour() regresa un entero que representa la hora del dia en formato 24hrs " + fechaHora.getHour());
		System.out.println("El metodo getMinute() regresa un entero que representa el minuto " + fechaHora.getMinute());
		System.out.println("El metodo getSecond() regresa un entero que representa el segundo " + fechaHora.getSecond());
		System.out.println("El metodo getNano() regresa un entero que representa el nanosegundo " + fechaHora.getNano());
	}
	
	
	public static void usarParse() {
		LocalDate fecha = LocalDate.parse("2015-10-31");
		System.out.println("Haciendo uso del localdate parseando una cadena "+ fecha); 
		LocalTime tiempo1 = LocalTime.parse("02:32:45");
		System.out.println("Haciendo uso del parse de time " + tiempo1);
		
		LocalDateTime fechayHora = LocalDateTime.parse("2015-12-31T02:32:45.12354");
		System.out.println("Haciendo uso de parse en localdatetime " + fechayHora);
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
