function sum(x, y, z) {
    return x + y + z;
}

const numbers = [1, 2, 3];

console.log(sum(...numbers)); /*la sintaxis spread le premite a un iterador como un array ser expandida en lugares donde cero o mas argumentos
(Para las llamadas de un funcion) o elementos (para literales Array) son esperados*/

    //Sintaxis
// myFunction(...iterableObj) para las llamadas de una funcion
// [...iterableObj, 'x', 6] para arrays literales o cadenas
// let objClone { ...obj} para literales de tipo object

// Remplaza apply
var args = [0, 1, 2];
console.info(sum.apply(null, args));
console.error(sum(...args));

// para dar los elementos de un arreglo en un objeto date
var fecha = [1970,1,5];
var d = new Date(...fecha);
console.info(d);

// Copiar un arreglo
var arr = [1, 2, 3];
var arr2 = [...arr];
arr2.push(4);

console.warn(arr);
console.log(arr2);
var a = [[1,1],[2,2],[3,3]];
var b = [...a];
console.warn(a);
console.info(b);
b.shift().shift();
console.warn(b);

// para concatenar arreglos
var arreglo1 = [0, 1, 2];
var arreglo2 = [3, 4, 5];

var total  = arreglo1.concat(arreglo2);
console.info(total);

var total =[ ...arreglo1,...arreglo2];
console.warn(total);

