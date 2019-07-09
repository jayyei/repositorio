//El paraetro rest permite especificar argumentos independientes que seran combinados en un arreglo
//EL OPERADOR SPREAD permite especificar un arreglo que será separado y cada item enviado sera un argumento independiente a la funcion

//Math es una libreria dejs que incorpora ciertas constantes y funciones para hacer calculos generales

var num1 = 10, num2 = 30;

var max = Math.max(num1, num2);

console.log(max)

var numeros = [1,2,3,4,5,6,7,8,9]

/* var maxx_In_Array = Math.max( numeros ) */
// var maxx_In_Array = Math.max.apply( Math, numeros ) // como se hacia en el ECM5
var maxx_In_Array = Math.max( ...numeros ) // 
console.log(maxx_In_Array)