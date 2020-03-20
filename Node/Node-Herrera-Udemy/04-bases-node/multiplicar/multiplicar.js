//requireds
const fs = require('fs'); //libreria propia de node
//const fs = require('express'); //libreria de terceros
//const fs = require('./express'); //archivos de nosotros, comienzan con ./

let listar = (base, limite = 10) => {
    return new Promise((resolve, reject) => {
        if (!Number(base)) {
            return reject("La base no es un numero");
        }
        let data = '';
        for (let i = 1; i <= limite; i++) {
            data += `${base} * ${i} = ${base * i}\n`;
        }
        return resolve(data);
    })
}

let crearArchivo = (base, limite = 10) => {
    return new Promise((resolve, reject) => {
        if (!Number(base)) {
            return reject("la base no es un numero")
        }
        let data = '';
        for (let i = 1; i <= limite; i++) {
            data += `${base} * ${i} = ${base * i}\n`;
        }

        fs.writeFile(`tablas/tabla_${base}-al-${limite}.txt`, data, (err) => {
            if (err) reject(err);
            else resolve(`tabla-${base}-al-${limite}.txt`)
        });
    });
}

//module es un objeto global en el que se puede acceder en cualquier lado de la aplicacion
// por lo tanto podemos colocar ahi los modulos que se requieran 
module.exports = {
    crearArchivo,
    listar
}

//o en el nombre de la funcion 

// module.export.funcion = ()=>{}