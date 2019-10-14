package sanchez.jay.usoDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AjustandoDateTime {
	public void ajustaDateTime() {
		LocalDate fecha1 = LocalDate.of(2017, 10, 16);
		System.out.println("Fecha actual " + fecha1);
		
		fecha1 = fecha1.withDayOfMonth(30); /* Se crea un nuevo objeto de tipo date que devuelve el objeto fecha con ese ajuste de dia*/
		System.out.println("Fecha actual cambiando el dia " + fecha1);
		
		fecha1 = fecha1.withMonth(02); /* de la misma manera genera un objeto date con la alteracion dada, si la fecha de la que se manipula el mes, contiene un dia en el mes que esta excedido en el nuevo mes, este se pondra en el ultimo dia*/ 
		System.out.println("Fecha actual cambiando el mes " + fecha1);
		
		fecha1 = fecha1.withDayOfYear(365); /* cambia la fecha acorde  a un dia del anio, por ejemplo al ser 365 este brinca automaticamente al ultimo mes*/
		System.out.println("Fecha actual cambiando el dia del anio " + fecha1);
		
		LocalTime horaActual = LocalTime.now();
		System.out.println("La hora actual es " + horaActual);
		
		horaActual = horaActual.withHour(23);
		System.out.println("La hora modificada con la hora " + horaActual);
		
		horaActual = horaActual.withMinute(11);
		System.out.println("La hora actual modificando minutos " + horaActual);
	}
	
	public void modificarTiempo() {
		LocalDateTime fechaActual = LocalDateTime.now();
		System.out.println("La fecha actual desde modificarTiempo " + fechaActual);
		
		fechaActual = fechaActual.plus(3, ChronoUnit.WEEKS); /* Con este metodo se puede sumar x cantidad de y unidad que trae consigo el ChronoUnit*/
		System.out.println("Fecha modificada sumandole 3 semanas " + fechaActual);
		
		fechaActual = fechaActual.minus(6, ChronoUnit.YEARS);
		System.out.println("Fecha modificada restandole 6 anios " + fechaActual);
		
		LocalDateTime fechaNueva = LocalDateTime.now();
		System.out.println("La fecha actual desde modificarTiempo fecha nueva " + fechaNueva);
		
		fechaNueva = fechaNueva.plusDays(15); /* tambien existe los plus days, months, hours, etc*/
		System.out.println("La fecha actual desde modificarTiempo fecha nueva con 15 dias de mas  " + fechaNueva);
		
	}
}
