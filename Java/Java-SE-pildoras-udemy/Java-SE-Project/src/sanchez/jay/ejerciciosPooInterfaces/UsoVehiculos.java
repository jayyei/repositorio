package sanchez.jay.ejerciciosPooInterfaces;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculos [] vehiculos = new Vehiculos[2];
		
		vehiculos[0] = new Coche(50);
		vehiculos[1] = new Moto(40);
		
		vehiculos[0].Acelerar(12);
		System.out.println(vehiculos[0].plazas());
		System.out.println(vehiculos[0].getVelocidad());
		
	}

}
