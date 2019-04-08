

var hoy = new Date();
var fMili = new Date(0);
var fFija = new Date( 2013, 10, 25, 23,10,15,12)

console.log(hoy);
console.error(fMili);
console.info(fFija);

console.log(hoy.getFullYear() +1);


var inicio = new Date();

for (var i = 0; i < 15000; i++){
    console.warn("Algo...")
}

var fin = new Date();

var duracion = fin.getTime()-inicio.getTime();
console.info(inicio);
console.info(fin);
console.warn(duracion/1000, "Segundos");