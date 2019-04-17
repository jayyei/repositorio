var quiobole = [['key1', 'value 1'],['key2', 'value 2'],['key3', 'value 3']];

var quioboleMap = new Map(quiobole); //Puedes crear un diccionario a partir de un arreglo de dos dimensiones

console.info(quioboleMap);
console.info(quioboleMap.get('key1'));

// La funcion Array.from devuelve un arreglo a partir de un diccionario dado como argumento
var returnOfQuiobole = Array.from(quioboleMap); //Creas un arreglo de un diccionario
console.error(returnOfQuiobole);

console.log(Array.from(quioboleMap.keys())); // Creas un arreglo con solo las llaves del diccionario
console.info(Array.from(quioboleMap.values())); // Creas un arreglo con solo los valores del diccionario

console.error([...quioboleMap]); // obtienes el arreglo 2d del diccionario
