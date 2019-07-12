//Con las arrow function no hay creacion de this, super, arguments y new.target
//No puede ser llamado con new
//no tiene prototypes
//No se puede cambiar el valor de this
//No hay objeto "arguments"
// no puede tener parametros duplicados 

//Ejemplos de Funciones de flecha

///Equivalente en ECM5 junto con el de ECM6
var miFuncion2 = function(valor){
    return valor
}

let miFuncion2 = valor => valor


///Equivalente en ECM5 junto con el de ECM6
var sumar2 = function(num1, num2){
    return num1 + num2;
}

let sumar1 = (num1, num2) => num1 + num2


///Equivalente en ECM5 junto con el de ECM6
var saludar = function(){
    return "Hola mundo"
}

let saludar = () => "Hola mundo"


///Equivalente en ECM5 junto con el de ECM6
var saludarPersona = function(nombre){
    var salida = "Hola " + nombre
    return salida
}

let saludarPersona = (nombre) =>{
    let salida = `Hola ${nombre}`
    return salida
}

///Equivalente en ECM5 junto con el de ECM6
var obtenerLibro = function(id){
    return {
        id: id,
        nombre: "Harry Potter"
    }
}

var obtenerLibro = id => ({id:id, nombre:"Harry Potter"}) //Si el contenido esta envuelto en parentesis, lo que se devuelve sera un objeto literal
