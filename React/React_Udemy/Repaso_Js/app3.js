

//Function Declaration: El llamado de la funcion se puede hacer antes o despues de la delclaracion de la misma

function saludar (nombre){
    console.info(`Bienvenido ${nombre}`);
}

saludar('Juan');

//Function expression: Siempre se declaran las funciones antes de llamarla 

const cliente = function(nombreCliente){
    console.log(`Monstrando datos del cliente: ${nombreCliente}`);
}
cliente('Pedro');