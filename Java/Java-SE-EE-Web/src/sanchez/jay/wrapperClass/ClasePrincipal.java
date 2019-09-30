package sanchez.jay.wrapperClass;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasePrincipal ejemplo = new ClasePrincipal();
		ejemplo.xxxValue();
		ejemplo.parseValueOf();
		ejemplo.metodoToString();

	}
	
	public void metodoToString() {
		Double d = new Double(1233);
		
		String prueba = d.toString();
		System.out.println("La prueba de que cualquier clase envolvente tiene el metodo to String " + prueba);
	}
	
	public void parseValueOf() {
		double ejemplo1 = Double.parseDouble("323.233"); //Los metodos parse, reciben como parametro una cadena a ser analizada como
		boolean ejemplo2 = Boolean.parseBoolean("true"); //Por ejemplo, la clase envolvente Boolean al recibir la cadena true regresara el respectivo booleano
		int ejemplo3 = Integer.parseInt("-123"); // En la clase Integer sucede algo parecido
		float ejemplo4 = Float.parseFloat("-12.347"); // y por ultimo en la clase Float tambien se puede parsear una cadena a flotante
		long ejemplo5 = Long.parseLong("323");	//Todos estos datos devuelven valores primitivos
		
		Long ejemplo6 = Long.valueOf(123); //El metodo valueOf actua de una forma muy similar, recibe en parametro el tipo o la cadena a parsear y devuelve el primitivo deseado
		System.out.println("El valor del ejemplo1 " + ejemplo1);
		System.out.println("El valor del ejemplo2 " + ejemplo2);
		System.out.println("El valor del ejemplo3 " + ejemplo3);
		System.out.println("El valor del ejemplo4 " + ejemplo4);
		System.out.println("El valor del ejemplo5 " + ejemplo5);
	}
	
	public void xxxValue() {
		Integer variable = new Integer(3); //Como se puede apreciar en la instancia, el tipo de dato integer
											//Se considera como un objeto, que maneja el dato int que se pasa en el constructor
		byte variable2 = variable.byteValue(); 
		short variable3 = variable.shortValue(); //Una vez que se creo la instancia Integer, esta se puede llamar
		double variable4 = variable.doubleValue(); //y de primera mano hacer llamar a los metodos value(), que su prefijo
		int variable5 = variable.intValue();	// indicará que valor primitivo devolvera, por ejemplo, byteValue(); devuelve
		String variable6 = variable.toString();	// una representacion del dato guardado en la instancia integer pero de tipo primitivo byte
		
		System.out.println("El valor de variable2 es " + variable2);
		System.out.println("El valor de variable3 es " + variable3);
		System.out.println("El valor de variable4 es " + variable4);
		System.out.println("El valor de variable5 es " + variable5);
		System.out.println("El valor de variable6 es " + variable6);
	}

}
