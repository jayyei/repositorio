

setTimeout(function(){ //El set timeout se ejecuta una sola vez
    console.log("Paaron dos segundos");
}, 2000)


/* setInterval(function(){  // El set interval se ejecuta en intervalos definidos previamente
    console.log("Set interval")
}, 1000) */
/* 
var segundos = 0;

var intervalo = setInterval(function(){
    segundos ++;
    console.log("Seg", segundos)
    if(segundos === 3){
        clearInterval(intervalo)
    }
}, 1000) */

//Truco

var juan = {
    nombre: "Juan",
    edad: 30,
    imprimir: function(){
        var self = this;
        setTimeout(function(){
            console.log(self);
            console.log(self.nombre, self.edad)
        }, 1000)
    }
}

juan.imprimir();