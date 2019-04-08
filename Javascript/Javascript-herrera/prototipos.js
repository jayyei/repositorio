


function Persona() {
    this.nombre = "Fernando";
    this.edad = 30;
    this.apellido = "Herrera";
}

Persona.prototype.imprimirInfo = function () {
    console.log( this.nombre + " " + this.apellido  + " (" + this.edad + ")");
}
var fer = new Persona();

Number.prototype.esPositivo = function(){
    return (this > 0 ) ? true: false;
}


