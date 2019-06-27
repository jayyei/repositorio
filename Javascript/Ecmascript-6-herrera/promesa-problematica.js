function tareaAsincrona(){
    setTimeout(function(){
        console.log("Proceso asíncrono terminado");
        reject();
    }, 1300)
}

tareaAsincrona();
console.log("Codigo Secuencial");

function resolve(){
    console.log("Todo ok");
}

function reject(){
    console.log("Tdoo mal");
}