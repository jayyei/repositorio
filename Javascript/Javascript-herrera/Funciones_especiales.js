

var carro = {
    color: "Blanco",
    marca: "Mazda",
    imprimir: function () {
        var salida = this.marca + "-" + this.color;
        return salida;
    }
}

console.info(carro.imprimir());

var logCarro = function( arg1, arg2){
    console.log("Carro ", this.imprimir());
    console.info("Argumentos", arg1, arg2);
}

var logModeloCarro = logCarro.bind( carro ); //para apuntar a un objeto determinado en los parentesis
logModeloCarro("abc", "xyz"); //Bind creara una nueva funcion con el set de la misma ajustado al primer parametro puesto en bind

logModeloCarro.call(carro, 123,456);
//NOTA: VOLVER A HACER EL EJERCICIO
