


const IMPUESTO_SV = 15.23 // Tienen que inicializarse en el momento que son definidas


if( true ){
    const IMPUESTO_SV = 15.26 
}
console.log( IMPUESTO_SV)

//Se pueden declarar objetos, como constantes

const Persona = {
    nombre: "Fernando",
    apellido: "Herrera"
}

Persona.apellido = "Sanchez"
console.log(Persona)

//Se pueden manipular propiedades individuales de un objeto const, pero no se puede manipular el contenido del cuerpo completo