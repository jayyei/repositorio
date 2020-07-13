package sanchez.jay.poo;

public class CadenaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Todas las clases de Java heredan de la clase Object "Es la clase Cosmica"
		//En java no existe la herencia multiple
	}

}

class Clase1 {
	public void metodo(){
		
	}
}

class Clase2 extends Clase1 {
	public void metodo2(){
		
	}
	
}

 class Clase3 extends Clase2 { //Al agregar la palabra reservada final a la clase, indica que ya nadie puede heredar de la clase3
	//Con la clase final se rompe la cadena de herencia
  public void metodo3(){  // Al ser metodo private, este ya no se hereda en las siguientes subclases
		
	}
	
}

class Clase4 extends Clase3 {
public void metodo4(){
		
	}
	
}