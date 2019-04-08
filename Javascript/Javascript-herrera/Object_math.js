var Pi = Math.PI;
var E =  Math.E;

console.error(Pi);
console.error(E);

var num1 = 10.456789;

console.info( num1);
console.warn( Math.round(num1)); //quita todos los decimales con redondeo
console.error(Math.floor(num1)); //quita todos los decimales sin redondeo

var rnd = Math.random();
console.info(rnd);

function randomEntre( min, max){
    return Math.floor( Math.random()*(max-min + 1 ) + min);
}

console.info(randomEntre(1,6));

console.error( Math.abs(-5.566));
console.warn( Math.sqrt( 10));
console.warn( Math.pow( 7, 2));
