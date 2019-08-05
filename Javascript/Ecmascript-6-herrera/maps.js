//Es otra coleccion de datos que almacena llave y valors
//De acuerdo a la llave solicitada, nos devolvera el valor relacionado
// Los maps tienen los metodos Has(), delete(), clear(), size() y se puede hacer iteraciones

//Declaracion de un map 
let mapa = new Map();
mapa.set("nombre", "Fernando"); //Para añadir elementos a una coleccion de mapas se utiliza el set(llave, valor)
mapa.set("edad", 31);
console.log(mapa);
console.log(mapa.size);
console.log(mapa.get("nombre")); //Para recuperar un valor de un mapa se accede mediante su llave
console.log(mapa.get("edad"));
console.log(mapa.has("nombre")); //Para determinar si existe esa llave dentro del mapa


//Se pueden añadir elementos par de valores sin definir alguno de los dos

mapa.set("apellido"); //En este caso el valor de la llave "apellido será undefined"
console.log(mapa);

//Y si colocas ambos parametros vacios
mapa.set(); // en este caso tanto llave como valor seran undefined
console.log(mapa);

//Para eliminar pares de valor dentro del map
mapa.delete("nombre"); //Basta con mandar la llave para borrar el par

//Si quieres borrar solo el valor de una llave en el mapa
mapa.set("nombre"); //Esto hara que se borre el valor de la llave "nombre"

//Y para borrar todo el mapa se utiliza el clear()

mapa.clear();

//Inicializacion de los mapas con un arreglo

let mapaDos = new Map([[1, "Hy"], [2, "Hydra"]]); // Para inicializar un mapa se requiere un arreglo de arreglos
console.log(mapaDos); // Tanto llave como valor pueden ser null o undefined

//forEach de los mapas
let mapaIterar = new Map([["nombre", "Fernando"],["edad", 31]]);
mapaIterar.forEach( function(valor, llave, mapa){ //De igual manera con los set, este resuelve a tres valores, el valor, la llave y el mapa que se esta iterando
    console.log(valor, llave, mapa);
});

