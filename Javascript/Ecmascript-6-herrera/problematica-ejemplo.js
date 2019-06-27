function tareaAsincrona(){
    let promesa = new Promise( (resolve, reject)=>{    //La promesa recibe como argumento una funcion con dos parametros
                                                        //Estos dos parametros son resolver y reject, que a su vez son funciones definidas en otro lugar
        setTimeout(function(){                        
            console.log("Proceso asíncrono terminado");
            resolve();
        },1300)
    })

    return promesa;
}

tareaAsincrona().then( ()=> console.log("Todo ok"), ()=> console.log("Todo mal")) //Para sbscribirnos a una promesa, con el metodo then, estamos a la espera que la promesa se termine
                                                                                  //Si se termina bien, dentro de ella se puede llamar un resolve o reject, definidos en los parametros de then

console.log("Codigo secuencial")