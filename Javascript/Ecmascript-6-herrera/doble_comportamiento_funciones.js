//Las funciones pueden ser llamadas con o sin el new
//Con new el valor de this dentro de la funcion es un nuevo objeto y ese nuevo objeto es retornado
// sin el new pues...

function Persona(nombre){

    if( typeof new.target !== "undefined" ) {
        this.nombre = nombre;
    } else {
        throw new Error("Esto no es una Persona")
    }

    this.nombre = nombre;
}

var persona = new Persona("Fernando")
var noEsPersona = Persona.call(Persona,"Fernando")

console.log(persona)
console.log(noEsPersona) //el this de la funcion invocada sin el new, apunta al objeto window

//Se puede hacer una verificacion de como fue llamada una funcion

//new.target es una meta propiedad de un no objeto que provee informacion adicional relacionada con su procedencia (como el new)
// determina si un constructor de una funcion se ejecuto o no (Gran sustitucion del instanceof)
