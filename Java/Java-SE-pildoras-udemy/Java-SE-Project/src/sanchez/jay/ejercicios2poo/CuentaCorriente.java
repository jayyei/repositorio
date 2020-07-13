package sanchez.jay.ejercicios2poo;

import java.util.Random;

public class CuentaCorriente {
	
	private String nombreTitular;
	private double saldo;
	private long numeroCuenta;
	
	//El metodo constructor siempre debe de ser publico, por lo general sino se contiene, java te crea uno por defecto, pero siempre existe uno
	public CuentaCorriente(String nombreTitular, double saldo) {
		Random numero = new Random();
		numeroCuenta =  Math.abs(numero.nextLong());
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}
	
	public void agregarSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void retirarSaldo(double saldo) {
		if(this.saldo< saldo) {
			System.out.println("No puedes retirar mas dinero del que tienes");
		}else {
			this.saldo -= saldo;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDatos() {
		return "El numero de cuenta es " + this.numeroCuenta + " y el nombre del titular es " + this.nombreTitular;
	}
	
	public static void tranferencias(CuentaCorriente fuente, CuentaCorriente destino, double transferencia) {
		fuente.retirarSaldo(transferencia);
		destino.agregarSaldo(transferencia);
	}

}
