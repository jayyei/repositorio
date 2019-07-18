
let autoGuardado = {

    archivo: "app.js",
    cursor: {
        linea : 7,
        columna: 16
    },
    ultimoArchivo: {
        archivo: "index.html",
        cursor: {
            linea: 8,
            columna: 20
        }
    }
};

let { cursor:AliasCursor } = autoGuardado  //Despues de la propiedad destructurada, despues de dos puntos se puede colocar un alias
console.log( AliasCursor )

//Destructuraion de objetos anidados

let { ultimoArchivo: { cursora: AliasCursor2 ={linea: undefined, columna: undefined} }} = autoGuardado ///Si no se encuentra definido el atributo, se puede generar el atributo dandole un valor por defecto
console.log(AliasCursor2)

//La destructuracion es el simple patron repetitivo mostrado arriba
