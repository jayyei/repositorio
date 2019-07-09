let persona1 = {
    nombre: "Fernando",
    edad: 33
}

let persona2 = {
    nombre: "Juan",
    edad: 18,
    direccion: "Bla bla",
    conduce: true,
    vegetariano: false
}

persona1 = { ...persona2, ...persona1}
console.log(persona1)
console.log(persona2)

//El operador rest junta los elementos en un arreglo
//El operador spread, esparce los elementos como si fueran enviados de forma separada