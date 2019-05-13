// Destructuring de objetos

const aprendiendoJS = {
    version: {
        nueva : 'ES6',
        anterior : 'ES5'
    },
    frameworks: ['React', 'Vuejs', 'Angular']
}

// Destructuring es extraer valores de un objeto

console.log(aprendiendoJS);

// Destructuring forma vieja
let version1 = aprendiendoJS.version;
let framework1 = aprendiendoJS.frameworks[1];

console.error(version1);
console.info(framework1);

// Destructuring forma nueva
let {version, frameworks} = aprendiendoJS;
console.error(version,frameworks);

let {anterior} = aprendiendoJS.version;
console.info(anterior);
