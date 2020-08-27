
/*
function b(){
    console.log(myVar);
    console.log(this);
}

let a(){
    var myVar = 2;
    b();
}


var myVar = 1;
a();
*/
//Every execution context has a reference to its outer enviroment
// it is created at the moment of the execution 
//Cada funcion puede obtener variables del mismo variable enviroment en donde este definida

//Entonces al inciode la ejecucion de un codigo el this, estara referenciando al contexto global del programa, en este caso es window por ser navegador web

//cada contexto de ejecucion tiene una referencia a su entorno exterior

//Tambien podemos decir que la referencia a this y al variable enviroment que una funcion es capaz de adquirir es en donde
//en terminos lexicos esta ubicada (fisicamente escrita en codigo) [lexical enviroment]

let b = () => {  
    console.log(myVar); 
    console.log(this);
}

 let a = () => {
    var myVar = 2;
    b();
} 


var myVar = 1;
a();