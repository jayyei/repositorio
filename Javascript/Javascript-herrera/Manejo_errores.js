

try{                                        //El try necesita al menos de un finally o un catch
    var a = 300;
    if (a === 300){
        throw 'Que mal';
    } else {
        throw 'oh oh!';
    }
    console.log("El valor de a: ", a);
} catch (e) {
    if( e === "Que mal") {
        console.info("Error de tipo 1 ");
    } if ( e === "oh oh!"){
        console.info("Error de tipo 2 ");
    }
}
finally {
    console.info("Finalmente");
}
