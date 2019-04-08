

function determinaDato(a){
    if (a === undefined){
        console.error(" a es undefined, ayudame!!!");
    }
    if (typeof a === "number"){
        console.info("A es un numero, y puedo hacer operaciones con numeros")
    }
    if (typeof a === "string"){
        console.info("A es una pinche cadena, wey meteme un prototipo de cadena")
    }
    if (typeof a === "object"){
        console.info("A es un objeto pero no se de que pinches tipo")
        if( a instanceof Number){
            console.info("A es un objeto de tipo number, me la rifo")
        }
    }
}

var a = new Number(3);
determinaDato(a);