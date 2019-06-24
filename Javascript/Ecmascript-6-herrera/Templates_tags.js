
//La funcion etiqueta es una etiqueta que va antes del template literal 
//Puede evaluar el template literal e incluso cambiar el template por completo 

function etiqueta(literales, ...substituciones){ //El tag es una funcion que recibe dos parametros, las cadenas que forman el template literal y los argumentos o variables que esta tiene  
    let resultado = ""
    console.log(literales);
    console.log(substituciones);
    for(let i =0; i < substituciones.length; i++){
        resultado += literales[i]
        resultado += substituciones[i]
    }
    return resultado 
}

let unidades = 5,
costo = 10;

let mensaje = etiqueta`${unidades} lapices cuestan ${unidades*costo} pesos` //Etiqeuta redefinira al valor de mensaje 

console.log(mensaje)