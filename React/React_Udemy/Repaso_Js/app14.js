// Metodos en arreglos

const personas = [
    {nombre : 'Juan', edad: 23, aprendiendo: 'Javascript'},
    {nombre : 'Pablo', edad: 18, aprendiendo: 'PHP'},
    {nombre : 'Alejandra', edad: 21, aprendiendo: 'AdobexD'},
    {nombre : 'Karen', edad: 30, aprendiendo: 'Phyton'},
    {nombre : 'Miguel', edad: 35, aprendiendo: 'ReactJs'},
]

console.log(personas);

//mayores de 28 anos

const mayores = personas.filter(persona => persona.edad > 28);
console.log(mayores);
const alejandras = personas.find(persona => persona.nombre === 'Alejandra');

console.log('Alejandra esta aprendiendo ' + alejandras.aprendiendo);

let total = personas.reduce((edadTotal, persona) => edadTotal + persona.edad, 0);

console.error(total/personas.length);
