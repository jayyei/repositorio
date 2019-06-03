//callbacks funcioens que corren dentro de otras funciones

const ciudades = ['Londres', 'New York', 'Madrid', 'Estocolmo']

ciudades.forEach((ciudad)=>console.log(ciudad)) //El for each tiene una funcion dentro de sus parametros
//una inline callback es la funcion del argumento sin nombre

ciudades.forEach(callback) //callback definido

//funcion definida
function callback(ciudad){
    console.log(ciudad)
}