// Arrow function

// Normal version
let viajando = function(destino){
    return `Viajando a la ciudad de ${destino}`;
}

let viaje = viajando('Paris');

console.log(viaje);

//Arrow version

let viajes = destino => {
    return `Viajando a la ciudad de ${destino}`;
}

vieja = viajes('Londres');
console.info(vieja);

//Arrow version simplificada
let viajecito = destino => `Viajando a la ciudad de ${destino}`;

console.warn(viajecito('Francia'));