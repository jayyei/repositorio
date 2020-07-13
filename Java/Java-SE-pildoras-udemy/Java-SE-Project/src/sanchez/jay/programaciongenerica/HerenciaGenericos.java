package sanchez.jay.programaciongenerica;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado Empleado1;
		
		Jefe Sara = new Jefe("Sara", 27, 3750);
		
		Empleado1 = Sara;*/
		
		VariosTipos<Empleado> Empleado2 = new VariosTipos<Empleado>();
		
		VariosTipos<Jefe> Sara = new VariosTipos<Jefe>();
		
		//Empleado2 = Sara;
		
		VariosTipos.imprimirTrabajador(Sara);
	}

}
