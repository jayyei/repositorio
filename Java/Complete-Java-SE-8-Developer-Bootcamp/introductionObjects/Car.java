package introductionObjects;

public class Car {
	
	String color = "Green";
	String type;
	
	//Este bloque sobrescribe la inicializacion de variables si es que se encuentra despues de estas, si se encuentra antes, la inicializacion lo sobrescribe
	{ //This is the initialization block, is ejecuted before the constructor  and after the initalizaion of class attributes
		color = "Red";
	}// Will always be run for all the constructors
	
	{
		//You can have multiple initialization blocks
		//They will be executed in the order that they are listed from top down to the bottom
	}
	
	Car(){
		//color = "blue";
	}
	
	void start() {
		System.out.println("Get started");
	}
	
	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.printDescription();
	}

}
