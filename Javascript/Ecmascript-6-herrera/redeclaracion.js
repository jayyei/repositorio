/* var mensaje = "123"
var mensaje = 123

console.log(mensaje) */

//Let no permite la redeclaracion, aunque fuera y dentro de un scope diferente, quiza funcione

let mensaje = "Hola"
if(true){
    let mensaje = "Que tal";
    console.log(mensaje);
}

console.log(mensaje)