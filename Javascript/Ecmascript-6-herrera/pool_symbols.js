let userID = Symbol.for("userID"); //Con un symbol nomral, se crearian distintos symbolos aunque tuvieran una key igual
let objeto = {};                    // Con symbol.for busca simbolos existentes en el registro global de simbolos con la key enviada y devuelve el symbol si fue encontrada, si no un nuevo simbolo es creado en el registro global con dicha key


objeto[userID] = "12345"

console.log( objeto[userID]);
console.log(userID);

let userID2 = Symbol.for("userID"); //Se hace una especie de copia y referencia al userID original

console.log(userID == userID2 );
console.log(userID === userID2 );
console.log( Object.is(userID, userID2))

console.log(objeto[userID2]); //Con esta copia se puede obtener datos referenciados al userID original
console.log(userID2); // De hecho apuntan a la misma referencia

let id = Symbol.for("id unico");
console.log(Symbol.keyFor(id)); //Recupera la key del simbolo dado como argumento

let id2 = Symbol.for("id unico");
console.log(Symbol.keyFor(id));

console.log( id === id2);

let id3 = Symbol("id unico");
console.log( Symbol.keyFor(id3)) //Como keyfor no encuentra nada en la pool de simbolos, devolvera undefined, ya que al usar Symbol como generador de simbolo este no se registrara en la pool global de simbolos