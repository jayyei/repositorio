//La funcion async o aquella funcion que sea predecida por esa palabra significa que dicha funcion returna una promesa
//Los valores que devuelve son atrapados y devueltos en una promesa
//El await solo funciona dentorde una funcion async
// ASync solo devuelve una promesa
//Procura usar un try catch para manejar errores del async await
//El await solo lo bloquea la ejecucion del async señalado 

//Si a la funcion contiene la palabra reservada async significa que se envuelve en una promesa


const getNombre = async () =>{
    return 'Fernando';
}

console.log( getNombre() );

//Si en teoria el async devuelveuna promesa podemos crealizar una funcion despues de que esta se realice
getNombre().then(( name )=>console.log(name) //Recuerdaque implicitamente lo que devuelve la promesa en este caso el string de fernando puede servir como parametro del callback
)

//Recuerda que el async solo devuelve una sola promesa, incluso aunque esta funcion tenga promesa(s) dentro

//La ventaja del await es que cuando se encuentra dentro de funciones asincronas puede esperarse a que la funcion se ejecute por completo

const saludo = async ()=> {
    const nombre = await getNombre();  //await se espera a que la promesa se resuelva, debe de estar dentro de una funcion async
    return `Hola ${ nombre }`;
}

saludo().then((hy)=>console.log(hy))  //El resultado de saludo solo se vera si esta se termina de ejecutar por completo, es decir cuando se acabe de realizar 
                        // puedes llamar a una funcion callback para poder imprimir el resultado, el resultado no puede ser accedido si solo llamas a la  funcion
