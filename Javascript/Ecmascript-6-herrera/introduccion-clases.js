function Persona( nombre ){
    this.nombre = nombre;
    this.gritarNombre = function(){
        console.log( this.nombre.toUpperCase());
    }
}

Persona.prototype.decirNombre = function(){ //Con este metodo se añaden funciones unicas y particulares para la funcion persona 
    console.log(this.nombre);
}

let fernando  =  Persona("Fernando");  //Funcion de primera clase 

//fernando.decirNombre();
//fernando.gritarNombre();

console.log( fernando instanceof Persona );
console.log( fernando instanceof Object );