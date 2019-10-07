package sanchez.jay.usoDateTime;

import java.time.LocalDate;
import java.time.Month;

public class ComparaDateTime {

	public void isBefore() {
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2018, Month.AUGUST, 31);
		if(fecha1.isBefore(fecha2)) { /* El metodo is before devuelve true si la fecha 1 esta antes de la fecha 2*/
			System.out.println("La fecha "  + fecha1 + " Si esta antes de la fecha " + fecha2);
		}else {
			System.out.println("La fecha " + fecha1 + " no esta antes de la fecha " + fecha2);
		}
	}
	
	public void isAfter() {
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2018, Month.AUGUST, 31);
		if(fecha1.isAfter(fecha2)) {  /*El metodo is after solo devuelve un true si la fecha 1 esta despues de la fecha 2 */
			System.out.println("La fecha "  + fecha1 + " Si esta despues de la fecha " + fecha2);
		}else {
			System.out.println("La fecha " + fecha1 + " no esta despues de la fecha " + fecha2);
		}
	}
	
	public void compareTo() {
		LocalDate fecha1 = LocalDate.of(2018, Month.AUGUST, 31);
		LocalDate fecha2 = LocalDate.of(2018, Month.AUGUST, 31);
		
		if(fecha1.compareTo(fecha2)<0) { /*compareTo compara dos objetos de tipo fecha si son menores o mayores y devuelve un entero de acuerdo al caso */
			System.out.println("La fecha " + fecha1 + " esta antes de la fecha " + fecha2);
		}else if(fecha1.compareTo(fecha2)>0) {
			System.out.println("La fecha " + fecha1 + " esta despues de la fecha " + fecha2);
		}else {
			System.out.println("La fecha " + fecha1 + " es igual que la fecha " + fecha2);			
		}
	}
	
	
}
