package sanchez.jay.pooAbstractas;

public interface ParaTrabajadores {
	
	double bonus = 200;  // se sobrentiende como public final static bonus = 200;
	public static final double bobo = 2000; // se puede reducir a double simplemente
	double setBonus( double gratificacion); // en una interfaz se sobreentiende que un metodo implementado es public y abstract
}
