package sanchez.jay.ejerciciosPooInterfaces;

public class Coche implements Vehiculos{
	private int velocidad;
	private static final int PLAZAS = 5;
	
	public Coche(int inicial) {
		this.velocidad = inicial;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	@Override
	public String Acelerar(int cantidad) {
		// TODO Auto-generated method stub
		if(this.velocidad+cantidad<VELOCIDAD_MAXIMA) {
			this.velocidad += cantidad;
			return "Aumento de velocidad exitoso";
		}
		return  "Ha rebasado la velocidad maxima";
	}

	@Override
	public String Frenar(int cantidad) {
		// TODO Auto-generated method stub
		if(this.velocidad>cantidad) {
			this.velocidad -= cantidad;
			return "Se redujo la velocidad exitosamente";
		}
		return  "Ya estas por detenerte";
	}

	@Override
	public int plazas() {
		// TODO Auto-generated method stub
		return PLAZAS;
	}
	
	

}
