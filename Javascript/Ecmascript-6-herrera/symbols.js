// Los simbolos son un nuevo tipo de dato, ya que anteriormente se tenian solo estos tipos de datos 
// undefined
// null
// boolean
// number
// string 
// object

//Ahora tenemos los simbolos son perfectos para poner nombres de propiedades y que estos no colisionen con otros nombres de propiedades que esten en otras librerias

let primerNombre = Symbol('primer nombre'); //Para realizar la creacion, los simbolos son un dato primitivo por lo tanto no tienen un constructor
let segundoNombre = Symbol();
let persona = {
    [segundoNombre] : "Herrera"
};
persona[primerNombre] = 'Fernando';
console.log(persona[primerNombre]); //Si definiste a una propiedad de un objeto como simbolo entonces debes de acceder a ella con llaves cuadradas o conmutadas
console.log(persona[segundoNombre]);

//A los simbolos se les puede poder un alias
console.log([primerNombre])

//Ejemplo de un simbolo que no es nada mas que un nuevo tipo de dato 
let simbolo1 = Symbol('simbolo')
let simbolo2 = Symbol('simbolo')

console.log(simbolo1 == simbolo2); // Todos los imbolos son diferentes
console.log(simbolo1 === simbolo2);
console.log(Object.is(simbolo1, simbolo2));

console.log(typeof primerNombre)
//console.log("Mi simbolo " + primerNombre) //No se puede convertir el simbolo a un valor string aunque se use los templates literals

console.log( 'primer nombre' in persona);
console.log( persona[primerNombre]);
