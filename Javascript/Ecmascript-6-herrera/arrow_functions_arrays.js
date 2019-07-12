
var arreglo = [5,10,11,2,1,9,90]

var ordenado = arreglo.sort(function(a,b){
    return a-b;
})

let ordenado2 = arreglo.sort((a,b)=> a-b)

console.log(ordenado2)

//Una funcion de flecha no tiene un constructor
var restar = (a,b) => a-b

console.log(typeof restar)
console.log(restar instanceof Function)

//Argumentos no esta definido dentro de la funcion de flecha

function ejemplo(x,y){
    ((a,b)=>{
        console.log( arguments[0])
    })()
}

ejemplo(10,20)