


//var reg1 = RegExp("a");
var reg2 = /a/;

var texto = "Hola mundo";

var arr = texto.match( /^H/); //Dentro de // se puede buscar un caracter dentro de una cadena, si este comienza con un sombrerito, lo busca al inicio
var arr2 = texto.match(/o$/); // Señala que la busqueda se realice con el ultimo caracter de la cadena
var arr3 = texto.match(/^.o/); // Señala que la busqueda comienza al principio, pero que el primer caracter no importa lo que sea
var arr4 = texto.match(/[56789]/) // Los corchetes indican un rango de busqueda de la expresion regular [0-9]
var arr5  = texto.match(/[aeiou].$/);
var arr6 = texto.match(/\s/); //Verifica el \s si la cadena esta separa por cualquier separacion, tab, o espacio
var arr7 = texto.match( /\w/); // Busqueda de todos las letras o caracteres ascii pero no incluye la ñ
var arr8 = texto.match(/\d/); //Busqueda de cualquier numero del 0-9;
// Las expresiones regulares tienen tres controladores que nos permiten realizar algunas cosas
// La i significa insensible a las mayusculas
// la g significa todas las apariciones
// la m significa multilinea
var arr9 = texto.match(/m/i);
var arr10 = texto.match(/[aeiou]|é/g); // en este caso el operador | funciona como el operador or
var arr11 = texto.match(/o+/g); // en este caso pregunta por un match de o una o mas veces, o, oo,ooo,oooo
var arr12 = texto.match(/o?/g); // ademas de la o, hace relacion con los demas caracteres, pero los coloca vacio
var arr13 = texto.match(/o*/g); //

console.log( arr );
console.log( arr2);
console.info( arr3);
console.warn( arr4);
console.info( arr5);
console.error( arr6);
console.warn( arr7);
console.error( arr8);
console.warn( arr9);
console.info( arr10);
console.error(arr11);
console.warn( arr12);
console.log ( arr13);