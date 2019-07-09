

var carro = {
    color: "Blanco",
    marca: "Mazda",
    imprimir: function(){
        var salida = this.marca + "-"+ this.color;
        return salida;
    }
 }

 console.log (carro.imprimir ());

 var logCarro = function (arg1, arg2 ){
     console.log("Carro: ", this.imprimir());
     console.log("Argumentos:", arg1, arg2);
 }

var logModeloCarro = logCarro.bind( carro); //Setea el this al objeto mencionado en el argumento del bind para que se pueda hacer referencia a los metodos o atributos de dicho objeto
//logModeloCarro("abc", "xyz");

logCarro.call( carro, "123", "456" ); //Este metodo primero recibe un argumento donde se seteara el this y despues los argumentos del metodo
logCarro.apply( carro, ["ABC", "XYZ"]); //Aqui hacemos referencia al mismo objeto carro, pero los argumentos se reciben como si fuese un arreglo

//Tu puedes usar call/Apply para invocar la funcion inmediatamente, bind devuelve una funcion enlazada que tendra el contexto correcto cuando de la funcion original
//Bind puede ser usada cuando la funcion necesita ser llamada despues en ciertos eventos

//El primer argumento de call/Apply es aquel objeto o contexto a donde se quiere enlazar el metodo 
//La diferencia entre estos dos es que call,recibe los siguientes parametros de manera individual, mientras que apply los recibira como sie se tratase de un arreglo
