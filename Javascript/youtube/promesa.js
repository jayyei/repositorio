var promesa = new Promise(function (resolve, reject) {
    setTimeout(function () {
        console.log("Promesa terminada");
        //Termina bien
        resolve();
        //Termina mal
        reject();
    }, 2000);
});
promesa.then(function () {
    console.log("Ejecutate si estas bien");
}, function () {
    console.error("Ejecutate si salio mal");
});
