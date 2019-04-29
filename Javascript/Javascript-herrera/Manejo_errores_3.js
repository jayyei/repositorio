//nunca realizar un throw al inicio de un programa

try{

    throw 1; //n cualquier numero




    console.info("Esta parte del codigo nunca se ejecuta")
} catch( e ){

    registroError(e);

}
finally{
    console.log("finalmente");
}

function registroError(e){
    var ahora = new Date();
    console.info("Se registro un error ", e ," a las ", ahora.getTime());
}
