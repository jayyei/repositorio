


var texto = "Aeropuerto";

console.log( texto);

var arr = texto.match(/[aeiou]{2,2}/ig);

console.log( arr);

var texto2 = " La respuesta es la suma es 45+60=120";

var arr = texto2.match(/\d{1,}/g);
console.info( arr);

var texto3 = " 5 +4 + (25+3) = [0]";
var arr = texto3.match(/ /g);