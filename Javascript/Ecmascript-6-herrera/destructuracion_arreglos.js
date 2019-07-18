let frutas = ["banano", "peras", "uvas"]

// En orden secuencial y el nombre para nada importa 
// sigue el patron de destructuracion
// let [] = arr
let [ fruta1, fruta2 ] = frutas
console.log(fruta1)
console.log(fruta2)

//Si quieres obtener un parametro en particular tienes que acceder a la posicion en particular

let [ , ,frutax ] = frutas
console.log(frutax)

//Puede sustituir el metodo de la burbuja
let a = 1 
b = 2
temp = 0;
temp = a;
a = b;
b = temp;
console.log(a, b);

//Se puede sustituir lo anterior por lo siguiente
[a,b] = [b,a]; //forma rapida de intercambiar valores en diferentes posiciones en los arreglos
console.log(a, b)


