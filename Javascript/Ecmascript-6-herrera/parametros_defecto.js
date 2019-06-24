

function saludo (mensaje = "Parametro por defecto ", tiempo = 1600){
    //mensaje = mensaje || "Hola mundo" //Esta es una manera de hacer un defecto en el ECM5
    mensaje = (typeof mensaje !== "undefined")? mensaje : "Este parametro esta vacio" //Aqui se hace mas segura la situacion del parametro 
    setTimeout(function(){
        console.log(mensaje)
    }, tiempo )
}

saludo("Jayson");

function saludar (fn = function(){console.log("No hubo argumento")} ){
    console.log(typeof fn)

    if( typeof fn === "undefined"){
        console.error('No es una funcion');
        return
    }

    fn();
}

saludar(()=>{console.log("Si hubo una funcion")});