package sanchez.jay.ejerciciosPooInterfaces;

public interface Vehiculos {
	
	public static final int VELOCIDAD_MAXIMA = 120;
	
	
	 String Acelerar(int cantidad);
	 
	 String Frenar(int cantidad);
	 
	 int getVelocidad();
	 
	 int plazas();
}
