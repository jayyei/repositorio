function etiqueta(){
    console.log(arguments);
    return "Otro texto"
}

let unidades = 5,
costo = 10;

let mensaje = etiqueta`${unidades} lapices cuestan ${unidades*costo} pesos` //Etiqeuta redefinira al valor de mensaje 

console.log(mensaje)