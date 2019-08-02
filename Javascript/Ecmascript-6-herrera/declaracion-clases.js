// Para declarar una clse se utiliza la palabra reservada class

class Persona {
    constructor(nombre){ //Lo primero que se ejecuta en una clase, los parametros que recibe la clase pueden llegar aqui
        this.nombre = nombre;  //El constructor puede o no ir en una clase
    }
    decirNombre(){  // Similar a aun Persona.prototype.decirnombre
        console.log( this.nombre );
    }
}


// Crea una instancia de una clase 
let fernando = new Persona("Fernando"); //No puedes usar una clase sin el new

//Llama a los metodos de la instancia

fernando.decirNombre();

console.log(fernando instanceof Persona );
console.log(fernando instanceof Object );
console.log(typeof fernando );


//Porque usarlas
//Todo el codigo dentro de una clase funciona con el modo estricto
//Las clases tienen metodos estaticos y dinamicos