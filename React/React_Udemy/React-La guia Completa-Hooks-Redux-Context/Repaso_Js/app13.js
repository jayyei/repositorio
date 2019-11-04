//Spread operator

let lenguajes = ['Javascript', 'PHP', 'phyton'];
let frameworks = ['ReactJS', 'Laravel', 'Django'];

//Unir los arreglos en unbo solo

let combinacion = [...lenguajes, ...frameworks];
console.log(combinacion);

// Copiar un arreglo

let copiar = [...lenguajes];

console.log(copiar);

//let [ultimo] = lenguajes.reverse();
//console.log(ultimo);

let [ultimo] = [...lenguajes].reverse(); //Con spread se copia por valor no por referencia
console.log(lenguajes);
console.log(ultimo);

function suma(a,b,c){
    console.log(a+b+c);
}

const numeros = [1,2,3];
console.log(suma(...numeros));


