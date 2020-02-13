let nombre = 'Wolverine';

if (true) {
    nombre = 'Magneto'; //Puedes cambiar la variable let aunque estes en un scoope o ambito diferente, e incluso la puedes leer
}

console.log(nombre);

for (var i = 0; i <= 5; i++) {
    console.log(`i: ${ i }`);
}

console.log(i); // i vale 6 y puedes leer su valor sin problema aunque te encuentres fuera del ambito