

let persona1 = {
    nombre: "Fernando",
    edad: 33
}

let persona2 = { ...persona1} //Utilizando el operador spread puedes tratar todos los parametros del objeto de manera individual

persona2.nombre = "Roberto"

console.log(persona1)
console.log(persona2)

