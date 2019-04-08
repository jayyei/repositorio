

function ejecutarFuncion( fn ) {
    return ( fn () === 1)? true : false;

};



console.log( ejecutarFuncion( function () {
    console.info("Funcion anonima ejecutada");
    return 0;
})
);