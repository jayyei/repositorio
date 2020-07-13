package sanchez.jay.ejercicios2poo;

public class ClasePaquete {

	@Override
	public String toString() {
		return "referencia=" + referencia + ", peso=" + peso + ", DNI=" + DNI + ", prioridad=" + prioridad;
	}

	private String referencia;
	private double peso;
	private int DNI;
	private int prioridad;
	
	public ClasePaquete(String referencia, double peso, int DNI, int prioridad) {
		this.referencia = referencia;
		this.peso = peso;
		this.DNI = DNI;
		this.prioridad = prioridad;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getPrioridad() {
		return this.prioridad;
	}
}

