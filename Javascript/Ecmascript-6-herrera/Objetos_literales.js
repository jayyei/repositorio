// Los objetos literales son colecciones de pares

function crearPersona(nombre, apellido, edad){
    return {
        /* nombre: nonbre, ///Antess
        apellido: apellido,
        edad: edad */
        nombre, //Ahora
        edad,
        apellido
    }
}

var melissa = crearPersona("Melissa", "Perez", 30)

console.log(melissa)


//Metodo normal

var Persona = {
    nombre : "Fernando",
    getNombre: function(){
        console.log(this.nombre);
    }
}
//El metodo conciso 

var Persona = {
    nombre : "Fernando",
    getNombre(){
        console.log(this.nombre);
    }
}