

/* const esperando = new Promise(function(resolve, reject){
    setTimeout(function(){
        resolve('Se ejecuto')
    }, 5000);
});

esperando.then(function(mensaje){
    console.log(mensaje)
}) */

const aplicarDescuento = new Promise(function(resolve, reject){
    const descuento = false;
    if(descuento){
        resolve()
    }else {
        reject();
    }
});

aplicarDescuento.then(function(){
    console.log("ORales salio todo chido");
}).catch(function(){
    console.error("SE murio la promesa");
})

// Una promesa es un objeto que representa la terminacion o el fracaso eventual de una operacion asincrona
// Es un objeto devuelto al cual enganchas las funciones callback en vez de pasar funciones callback a una funcion
function exitoCallback(resultado) {
    console.log("Tuvo éxito con " + resultado);
  }
  
  function falloCallback(error) {
    console.log("Falló con " + error);
  }
  
  hazAlgo(exitoCallback, falloCallback);
//La funciones moderna devuelven una promesa a la que puedes enganchar tus funciones de retorno

let promesa = hazAlgo(); 
promesa.then(exitoCallback, falloCallback);

// O simplemente 

hazAlgo().then(exitoCallback, falloCallback);

//Aquí está la magia: la función then devuelve una promesa nueva, diferente de la original:

const promesa = hazAlgo();
const promesa2 = promesa.then(exitoCallback, falloCallback);

//o

let promesa2 = hazAlgo().then(exitoCallback, falloCallback);

// Los argumentos a then son opcionales, y catch(falloCallBack) es un atajo para then(null, falloCallBack). Es posible que vea esto expresado con funciones de flecha en su lugar: