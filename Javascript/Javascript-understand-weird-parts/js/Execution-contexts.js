//En el contexto de ejecucion global se crean dos cosas: this y el global object

//Cuando corres js en el navegador lo haces en un entorno global que apunta this, el cual es window, este solo es cuando estas en el navegador

//Global : que no esta dentro de una funcion


//Execution context: es creado en 2 fases
    //fase creacion: se crean el global object, this y outer enviroment y el compilador reconoce en donde creaste variables y funciones asi que prepara espacio de memoria para variables y funciones algo que confusamente se llama hoisting

    //fase Ejecucion del codigo: como se han reservado espacios de memorias para variables y funciones al ejecutar linea por linea se puede acceder a donde sea que se llamen, solo que ocurre algo distinto con las variables, mientras que las funciones en su totalidad son colocadas en espacio de memoria, al momento de ejecutar linea por linea el condigo encontraremos las asignaciones a las variables. Todas las variables en javascript son inicialmente seteadas a undefined




b();

console.log(a);

c();

var a = 'Hello world';


function b(){
    console.log('Called b!');
}

var c = function(){
    console.log('Called c')
}