// En javascript existe el ciclo for in para objetos
// forEach para arreglos
// y for of para las nuevas colecciones de hecho aqui trabaja mejor

let numeros = [100,20,30,50,200];

for (let numero of numeros){ // El ciclo for of se trabaja directamente con el valor del arreglo
    console.log(numero);
}

for (let numero in numeros){ //El ciclo for in devuelve el indice del elemento dentro del arreglo
    console.log(numero); // si quieres acceder a las posiciones tendras que colocarte en la posicion numero
}

let personas =[
    {nombre: "Fernando", edad: 30 },
    {nombre: "maria", edad: 10 },
    {nombre: "Susana", edad: 18 },
    {nombre: "victor", edad: 25 },
    {nombre: "juan", edad: 40 }
]

for (persona of personas ){
    console.log(persona.nombre);
    console.log(persona.edad);
}

let personaSet = new Set();
personaSet.add(2);
personaSet.add(3);
personaSet.add(1);

for (set of personaSet ){
    console.log(set)
}

let personaMap = new Map([["nombre", 31],["Edad", 31]]); //Un mapa no puede tener llaves repetidas pero si valores

for (map of personaMap){
    console.log(map);
}

