var original = new Map([[1, 'one'], [2, 'two'], [3, 'three']]); // una forma de definir un diccionario y sus llaves

console.info(original);

var clon = new Map(original); // Forma de clonar un diccionario

console.error(clon)
console.info(clon.get(1));
console.error(original === clon);

var primero = new Map([
    [1, 'one'],
    [2, 'two'],
    [3, 'three']
]);

var segundo = new Map ([
    [1, ' uno'],
    [2, 'dos']
]);

var merged = new Map([...primero,...segundo]); //Forma de hacerle merge a dos diccionarios usando el operador spread
console.log(merged);

var mergedArray =  new Map([...primero,...segundo,[1,'uñas']]); // Tambien se puede hacer merge con dfos diccionario y algun arreglo 2-d
