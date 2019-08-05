// en javascript solia haber un solo tipo de coleccion la cual eran los arreglos
// Los set son una lista ordenada de valores sin duplicados
// Los set tienen funciones nativas en su prototipo


let items = new Set();

items.add(10);  //Con el metodo add( datoAAñadir ) se pueen agregar varios datos a la lista set
items.add(12);
items.add(1);
items.add(-2);

console.log(items.size); //Con items.size devuelve el tamaño de la lista del set
//Para determinar si son iguales o no los items considera una evaluacion de tipo Object.is
console.log(items);


//Se puede inicializar una lista de tipo set añadiendo un arreglo directamente en el constructor del set
let itemsV2 = new Set([5,3,0,1,2,3,4,5,]); //El orden de los datos es como se van ingresando
console.log(itemsV2);

console.log(items.has(7)); //Con el metodo has( elementoAbuscar ) Logra determinar si un elemento se encuentra dentro de una lista de tipo set

let listaSet = new Set([1,2,3,4,5,6,7]);
listaSet.delete(3); //Para borrar un elemento de la lista de set se ocupa el delet( elementoABorrar );

//El volver a repetir un borrado de un item no causaria error, simplemente lo omite
listaSet.clear(); //El metodo clear borra la lista completa del set 
console.log( listaSet );

//Para recorrer una lista Set se puede ocupar un forEach
// La funcion de callback simplemente retorna el valor, la llave y el Set que esta iterando
let listaEjemploAIterar = new Set(["Maria", "Pedro", "Alberto"])
listaEjemploAIterar.forEach( function(valor, llave, set){
    console.log(valor, llave, set); //El valor, y la lalve en los set son los mismos, pero en los maps no
}) // El set es la lista a la cual se esta iterando el callBack

// Convertir un set en un array
let numeros = [1,2,3,4,5,6,7];
let setNumeros = new Set(numeros);
console.log( setNumeros );
let arrayNumeros = [...setNumeros]; //Con el operador de spread a set numeros se puede pasar un set a un arreglo
console.log(arrayNumeros);

//Funcion para eliminar los duplicados en un arreglo
function eliminarDuplicados( items ){
    return [...new Set( items )]
}

let resultado = eliminarDuplicados([1,2,3,4,5,6,7,6,5,4,3,2,1]);
console.log( resultado );

// Los WeakSet trabajan de manera similar a los sets tradicionales, tambien llamados strongSets
// 1.- En un weakSet add(), has(), remove(), dan error si enviamos como parametro algo que no sea un objeto
// 2.- No tiene manera de hacer repeticiones o ciclos for in
// 3.- Los weakSets no tienen keys(), values(), por lo que no hay manera via programacion de saber cuantos elementos hay dentro
// No tienen un forEach 
// No tienen la propiedad size
// Los weakSets solo sirven para almacenar referencias a objetos 