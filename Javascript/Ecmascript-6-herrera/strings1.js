var saludo = "Hola mundo";

console.log( saludo.substr(0,1) === "H");
console.log( saludo.startsWith("H")); //nuevo ecs6
console.log(saludo.endsWith("o")); //nuevo ecs6

console.log(saludo.indexOf("m"));
console.log(saludo.includes("m")); //nuevo ecs6
console.log(saludo.startsWith("mu", 5)); //Se puede dfar un indice para comenzar la busqueda en la cadena
//El indice funciona con el starts, ends e include