// Creacion de variables

var aprendiendo = 'javascript'; //Variables con var
aprendiendo = true;
const aprendiendoConstante = 'la constante'; // La palabra const se utliliza para constantes
let aprendiendoLet = 'java'; // Le permite la misma funcionalidad que var, pero de forma local 

// Scoope 

/* var musica = 'rock';
if(musica){
    var musica = 'blues';
    console.log('dentro del if: ', musica);
}
console.info('fuera del if :', musica ); */

let musica = 'rock';
if(musica){
    let musica = 'blues';
    console.log('dentro del if: ', musica);
}
console.info('fuera del if :', musica );