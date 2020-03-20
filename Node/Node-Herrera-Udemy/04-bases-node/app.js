const { crearArchivo, listar } = require('./multiplicar/multiplicar');
const { argv } = require('./config/yargs');
const colors = require('colors');

let comando = argv._[0];

switch (comando) {
    case 'listar':
        listar(argv.base, argv.limite).then(data => console.log(data.blue))
        break;
    case 'crear':
        crearArchivo(argv.base, argv.limite).then(archivo => console.log(`Archivo creado: ${archivo}`))
            .catch(error => console.log(error))
        break;
    default:
        console.log("Comando no reconocido")

}
console.log("El argv", argv)
    //ahora multiplicar es un modulo exportado que tiene la funcion crearArchivo


//console.log(process.argv);
/* let parametro = process.argv[2];
let base = parametro.split('=')[1] */

/* let argv2 = process.argv; */
/* console.log(argv2); */
/* console.log("Base", argv.base) */


/* crearArchivo(base).then(archivo => console.log(`Archivo creado: ${archivo}`))
    .catch(error => console.log(error)) */