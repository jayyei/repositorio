//Una funcion anonima se ejecuta una vez que es definida

var saludo = function(nombre) {
    return "Hola " + nombre;
}("Fernando");

console.log(saludo)

let saludo2 = (nombre => `Hola ${nombre}`)("Melissa") //Para hacer una funcion anonima se tiene que definir toda la funcion en parentesis, despues parentesis con los valores de los argumentos
console.log(saludo2)