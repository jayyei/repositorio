// El ambito de una variable (scope) es la zona del programa en la que se define la variable
// Javascript define dos ambitos( global y function)

let mensaje = "hola mundo" //Let es nuevo en el ecs6
console.log(mensaje)
//con el let, al trabajar con una variable de este tipo, se tendra que declarar primero

if (1 === 3){
    let mensaje2 = "Hola mundo"
}
// dentro del ciclo es solo donde la vriable de tipo let existe
console.log(mensaje2)

//Let tiene un ciclo de vida, debe de estar declaradas e inicializadas antes de usarlas