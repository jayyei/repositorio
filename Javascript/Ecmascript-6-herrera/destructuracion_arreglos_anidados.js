let colores1 = [ "rojo", ["verde", "amarillo"], "morado", "naranja"];
//Destructuracion de arreglos anidados

let [ elrojo, [, elamarillo]] = colores1;
console.log(elrojo, elamarillo)

//Lo mas importante de la destructuracion de arrays
let colores2 = ["rojo", "verde", "amarillo", "naranja"]
//tu puedes especificar que colores deseas por ejemplo, separar individualmente cuales
//y despues colocar en otro arreglo cuales seran apartados con la destructuracion y el operador rest

let [ elprimero, ...losdemas ] = colores2; //El primero quita solo el primer valor del arreglo y se considerara como una variable aparte
console.log(elprimero);
console.log(losdemas); //Como los demas fueron llamados con el operador rest, entonces se formo un arreglo de los demas valores

let frutasDefecto = ["banano", "pera"]
let [ f1, f2, f3="JAy" ] = frutasDefecto; //si una posicion no esta definida se puede poner un valor por defecto
console.log(f3)