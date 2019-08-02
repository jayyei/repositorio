

let miFuncion = function(){
    console.log("Hola mundo")
}

let otraFuncion = miFuncion  //Una funcion puede hacerse expresion
console.log( typeof otraFuncion )
otraFuncion();

let Persona = class{ //Clase como expresion
    constructor(){
        this.nombre = "";
        this.edad = 30
    }

    decirNombre(){
        console.log("Hola mundo")
    }
}

let fernando = new Persona();

console.log(typeof fernando)
console.log( fernando instanceof Persona);