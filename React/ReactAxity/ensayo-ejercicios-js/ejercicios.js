let cadenaS = "ANITA LAVA LA TINA";
let cadena = [...cadenaS];
let repetidos = [];
for(let i = 0; i< (cadena.length-1); i++){
    for(let j = i + 1; j< cadena.length; j++){
        if(cadena[i] === cadena[j]){
            repetidos.push(...cadena.splice(j,1))
            //cadena.splice(j,1)
        }
    }
}

let contador = [];
let initial;
for(let k = 0; k < cadena.length; k++ ){
    initial = 0;
    for(l = 0; l < repetidos.length; l++){
        if(cadena[k] === repetidos[l]){
            initial ++;
        }
    }
    contador.push(`${cadena[k]}: ${initial}`)
}

console.log(contador)

//console.log(cadena, repetidos)
