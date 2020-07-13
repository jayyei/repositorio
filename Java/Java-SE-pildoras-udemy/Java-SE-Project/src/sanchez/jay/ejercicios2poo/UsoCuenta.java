package sanchez.jay.ejercicios2poo;

public class UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cuenta1 = new CuentaCorriente("Jay sanchez", 10000);
		CuentaCorriente cuenta2 = new CuentaCorriente("Vanessa juarez",10000);
		
		CuentaCorriente.tranferencias(cuenta1, cuenta2, 2000);
		
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getDatos());
		System.out.println(cuenta2.getSaldo());
	}

}
