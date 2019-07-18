//La destructuracion de parametros es destructurar un parametro sabiendo lo que contendra y asi evitar asignaciones innecesarias

function crearJugador( nickname, opciones ){
    opciones = opciones || {}
    let hp = opciones.hp;
    let sp = opciones.sp;
    let clase = opciones.clase;

    console.log(nickname, hp, sp, clase)
}

crearJugador("Strider", {hp: 100, sp: 200, clase: "Mago"})

//La funcion sencilla del EC6 es que opciones se  destructure y generar un valor por defecto para esta destructuracion
function crearJugador( nickname, { hp=1, sp=2, clase='??'}={} ){  //en cada parametro destructurado se puede poner su valor por defecto
    

    console.log(nickname, hp, sp, clase);
}

crearJugador("Jay");