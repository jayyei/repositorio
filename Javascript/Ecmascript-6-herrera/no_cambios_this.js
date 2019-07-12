/* 
var manejador = {
    id: "123",
    init: function(){
        document.addEventListener("click", (function(event){
            this.clickEnPagina(event.type)
        }).bind(this), false);
    },
    clickEnPagina: function(type){
        console.log("Manejando ", type, " Para el id: ", this.id)
    }
}

manejador.init(); */

var manejador = {
    id: "123",
    init: function(){
        document.addEventListener("click", event=> this.clickEnPagina(event.type), false)
    },
    clickEnPagina: function(type){
        console.log("Manejando ", type, " Para el id: ", this.id)
    }
}

manejador.init();