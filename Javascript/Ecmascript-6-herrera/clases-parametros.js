function creadorClases(definicionClase){
    return new definicionClase();  //Si devolveras una clase, instanciarla debes con new
}

let objeto = creadorClases ( class{
    constructor(){
        this.nombre= undefined;
        this.edad= undefined;

    }
    saludar(){
        console.log("Hola!")
    }
})

objeto.saludar();


class Cuadrado{
    constructor(lado){
        this.lado = lado;
    }
    getArea(){
        return this.lado * this.lado
    }
}

function imprimirCuadrado( cuadrado ){  //No recibe una clase, recibe una instancia de una clase
    if(!cuadrado instanceof Cuadrado){
        console.error("El parametro enviado no es una instancia de cuadrado")
    }
    console.log( cuadrado.getArea() );
}

let mesa = new Cuadrado(10)
imprimirCuadrado(mesa)