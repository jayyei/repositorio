// Object literal enhacement

const band = 'Metallica';
const genero = 'Heavy Metal';
const canciones = ['Master of puppets', 'Seek and Destroy', 'Enter Sandman'];

//La forma anterior de hacerlo

const metallica = {
    band : band,
    genero : genero,
    canciones : canciones
}
console.error(metallica);

// La forma nueva de hacer el enhacement
const metallicaNew = {band, genero, canciones};
console.info(metallicaNew);

