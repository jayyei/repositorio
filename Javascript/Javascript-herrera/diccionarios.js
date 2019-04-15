Personas = new Map(); // funcion para crear un nuevo arreglo vacio
Personas.set("Juan", 12); //Para insertar una llave con su respectivo valor
Personas.set("Maria", 18);
Personas.set("Jose", 24);

console.info(Personas);
console.info(Personas.get("Jose")); //El metodo get devuelve el valor de la llave dada como argumento
console.info(Personas.size); // Devuelve el tamaño del diccionario

var key1 = 'A String', key2 = {}, key3 = function(){};
Personas.set(key1, "Hola sopencos");
Personas.set(key2, {nombre: "Pepito", edad: 22, apellido:"camelo"});
Personas.set(key3, {function(){return true}});

console.info(Personas);

for( var [key, value] of Personas){ // con un ciclo "for of" podemos devolver las llaves y sus valores de un diccionario
    console.error(key + ' = ' + value);
}

for (var key of Personas.keys()){ // o simplemente sus llaves
    console.info(key);
}

for (var value of Personas.values()){ // o sus valores
    console.warn(value);
}

for (var [key, value] of Personas.entries()){ // Podemos devolver de esta manera las llaves y sus valores
    console.info(key + ' = ' + value);
}

Personas.forEach(function (value, key){ // y con el uso de un for each
    console.error(key + '=' + value);
} );

console.log(Personas.keys()); // Devuelve un objeto de llaves
console.error(Personas.values()); // Devuelve un un objeto de valores
