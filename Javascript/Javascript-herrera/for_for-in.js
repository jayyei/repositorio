

for( var i = 0; i < 10; i+=2 ){
    if(i == 6)
    break
    console.log(i)
}

var Persona = function(){
    this.nombre = "Juan";
    this.apellido = "Pineda";
    this.edad = 10;
};

var juan = new Persona();
Persona.prototype.direccion = "San Jose";

for (prop in juan ){
    console.log(juan.hasOwnProperty(prop))
    if(!juan.hasOwnProperty(prop))
    continue;//hasOwnProperty indica un true o un false si se encuentra una prop dentro del objeto que llama el metodo que no sea propio de el
    console.info(prop, " ", juan[prop]) //Recuerda que existe la notacion de corchetes
}

for ( num in ["a", "b","c"]){
console.log(num) // Aqui se imprime el indice, no el contenido del arreglo
}

[1,2,3,4,5,6,7,true,9].forEach(function(val){ //El ciclo for each recibe una funcion con el index como argumento, para analizar cada elemento del arreglo mediante el indice y hacer lo que corresponda
    console.log(val)
}
);