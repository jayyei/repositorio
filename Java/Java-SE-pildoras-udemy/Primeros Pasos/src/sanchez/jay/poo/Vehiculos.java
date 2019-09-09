package sanchez.jay.poo;

public class Vehiculos {
	
private int ruedas;  // aqui se encapsulan las propiedades de una clase para que los metodos y atributos se deban manipular como el programador dijo que se tenian que manipular
	
	private String color;
	
	private int largo;
	
	private int ancho;
	
	private int peso;
	
	private boolean aireCondicionado;
	
	private boolean tapiceriaCuero;
	
	private boolean gps;
	// El constructor es un metodo que da estado inicial a nuestros objetos, lleva el mismo nombre de la clase
	public Vehiculos(int ruedas) { //Constructor de la clase
	// aqui se establece el estado inicial tendran los objetos
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "Sin color";
	
	}
	
	public String getExtra() {
		return aireCondicionado? "Tu coche tiene aire acondicionado": 
			"Tu coche no tiene aire aire Acondicionado";
	}
	public void setExtra(boolean aireCondicionado) {
		this.aireCondicionado = aireCondicionado;
	}
	
	public void setExtra(boolean aireCondicionado, boolean gps, boolean tapiceriaCuero) {
		this.aireCondicionado = aireCondicionado;
		this.gps = gps;
		this.tapiceriaCuero = tapiceriaCuero;
	}
	// El metodo que establece el valor para una propiedad se llama SETTER;
	public void setColor(String color) {  //Este es un paso de parametro
		this.color = color;  //La palabra reservada this hace referencia a la clase en donde te encuentras
	}
	
	// El metodo que devuelve el valor de una propiedad
	public String getColor() {
		return color;
	}
	
	public String getDatosVehiculos() {
		return "Tu vehiculo tiene " + ruedas + " ruedas,  Ademas" +
				" tiene " + largo + " m de largo";
	}
	
	// getteres y setters son metodos publicos para acceder y setear la variables privadas de una clase
	
	
	
	
}

		// El encapsulamiento es esconder el procedimiento de como hacer algo dentor de la clase en donde se hace


	// El valor por defecto de un boolean es cero

	// El valor por defecto de un string o un objeto es null;
	
	// El valor por defecto de un int o double o long o  float es cero;