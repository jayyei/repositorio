try {
    // throw new Error('Error tipo 1'); //Se puede tirar lo que sea en el throw
    throw {
        nombreError: "Eror tipo 1",
        accion: "Salir corriendo a echarle agua al servidor",
        codeError: 1

    }
    console.warn("Esta parte del codigo nunca se ejecuta");
}

catch(e){ //cuando el error cae en el catch, to do se renombra a e, lo que provenga del throw
    console.error(e);
    console.info(e.nombreError);
    console.info(e.accion);
    console.info(e.codeError);
    //console.error(e.message); //Para identificar el error
}

finally {
    console.warn("Finalmente");
}
