

function caso1 (){
    let numero1 = 10, numero2 = 20;
    let resultado = numero1 + numero2;
    return resultado;
}

function caso2 (){
    let numero3 = 30, numero4 = 40;
    let resultado = numero3 + numero4;
    return resultado;
}

console.log(caso2());
console.log(caso1());
console.trace(); // nos sirve para imprimir el call stack
// En js existe el call stack que es en donde se apilan las llamadas a las funciones en el orden que se deben de ejecutar en el codigo
// y el callback queue que es en donde se apilan las llamadas asincronas que seran despachadas por el event loop una vez que el call stack este vacio

