
var b = "Herrera";
var a = new String("Fernando Herrera de la rosa Roja");

console.log( a );

console.info( a.toUpperCase());
console.warn( a.toLowerCase());

var i = a.indexOf("Herrera");
console.log( "la letra  esta en : ", i );

i = a.lastIndexOf('n');
console.warn(" la ultima posicion de la letra n es en ", i);

var nombre = a.substr( 6 );
console.log(nombre);

var nombre = a.substr( 6, 3 );
console.info(nombre);

var nombre = a.substr( 0, a.indexOf(" ") );
console.info(nombre);

var split = a.split( " ");
console.log(split);

document.write(a.italics());

