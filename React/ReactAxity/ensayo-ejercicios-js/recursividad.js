function factorial (x) {
    if (x === 0) return 1;
    return x * factorial(x-1);
  }
  console.log(factorial(5))


function gcd (number1, number2){
    if(!number2) return number1;
    return gcd(number2, number1 % number2); //Operador binario que devuelve el residuo de una division entera, si por ejemplo, no se logra dividir, devuelve el residuo completo entendiendo que la division a realizar es como resultado entero
}
console.log(gcd(255,5))

function range(start, end){
    if(end-start === 2){
        return [start +1]
    }else{
        let list = range(start, end-1);
        list.push(end-1);
        return list;
    }
}

console.log(range(2,6));

function arraySum(array){
    if(array.length === 1){
        return array[0]
    }else{
        return array.pop() + arraySum(array);
    }
}

console.log(arraySum([2,3,4,5]))

function exponent(a,n){
    if(n === 0){
        return 1;
    }else{
        return a * exponent(a, n-1);
    }
}

console.log(exponent(4,3))

function fibonacci(n){
    if(n ===1) {
        return [0,1]
    }else{
        let serie = fibonacci(n-1);
        serie.push(serie[serie.length-1] + serie[serie.length-2]);
        return serie;
    }
}

console.log(fibonacci(2))

//Busqueda binaria algoritmo para encontrar elementos en una lista ordenada, consiste en siempre dividir a la mitad


function binarySearch(array, target){
    let half = parseInt(array.length/2);
    if(target === array[half]){
        return half
    }
    if(target > array[half]){
        return half + binarySearch(array.slice(half, array.length), target);
    }else{
        return binarySearch(array.slice(0, half), target);
    }
}

console.log(binarySearch([0,1,2,3,4], 4));

