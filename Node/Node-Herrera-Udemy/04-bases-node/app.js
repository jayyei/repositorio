const { crearArchivo } = require('./multiplicar/multiplicar')

//ahora multiplicar es un modulo exportado que tiene la funcion crearArchivo


//console.log(process.argv);
let parametro = process.argv[2];
let base = parametro.split('=')[1]

crearArchivo(base).then(archivo => console.log(`Archivo creado: ${archivo}`))
    .catch(error => console.log(error))