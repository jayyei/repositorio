

//Parametros por default: En los parametros de cierta funcion, al igualarlos con cierto valor, cuando se llame
// sin dichos argumentos, la funcion tomara los igualados por default.

function actividad(nombre ='Walter', actividad = 'Hacer metanfetamina'){
    console.log(`La persona ${nombre}, esta realizando la actividad de ${actividad}`);
}

actividad('Jay', 'Rascarse la panza');
actividad('Pedro', 'Sitio web');
actividad();

//Function expression por default

const activity = function(nombre='Walter', actividad = 'Hacer cocas'){
    console.log(`La persona ${nombre}, esta haciendo la actividad de ${actividad}`);
}

activity('Ojos tristes', 'Issues');
activity('Igor');