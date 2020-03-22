const lugar = require('./lugar/lugar');
const clima = require('./clima/clima');

const argv = require('yargs').options({
    direccion: {
        alias: 'd',
        desc: 'Direccion de la ciudad para obtener el clima'
    }
}).argv;

console.log(argv.direccion);

/* lugar.getLugarLtLng(argv.direccion)
    .then(console.log)
    .catch(console.log);

clima.getClima(40.74, 45.000000).then(console.log)
    .catch(console.log); */

const getInfo = async(direccion) => {
    try {
        const coords = await lugar.getLugarLtLng(direccion);
        const temperatura = await clima.getClima(coords.lat, coords.lng);
        return `El clima de ${direccion} es de ${temperatura}`
    } catch (e) {
        return `No se pudo determinar los datos de ${ direccion}`
    }
}

getInfo(argv.direccion)
    .then(console.log)
    .catch(console.log)