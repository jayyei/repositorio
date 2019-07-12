var Persona = {}

var apellido = "apellido"

Persona["Primer nombre"] = "Fernando"
Persona[apellido] = "Herrera"

console.log( Persona["Primer nombre"]) //Propiedad computada
console.log( Persona[apellido])
console.log(Persona)

//La propiedad computada permite realizar una insercion con una llave especial o particular
var persona = {
    "primer nombre":"Melissa"
}

console.log( persona["primer nombre"] )

//Utiles para realizar con sufijos

var subFijo = " nombre"

var persona = {
    [ "primer" + subFijo ] : "Melissa",
    [ "segundo" + subFijo ] : "Karen",
}

console.log( persona["primer nombre"]);
console.log( persona["segundo" + subFijo]);
