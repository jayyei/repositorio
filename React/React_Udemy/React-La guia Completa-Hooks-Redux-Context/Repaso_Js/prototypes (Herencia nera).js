// Prototipos: Permite atar ciertas funciones a ciertos tipos de objetos

const persona = {
    nombre: 'Jay',
    profesion: 'Desarrolador Web',
    edad: 23
}

console.log(persona);

function Tarea(nombre, urgencia){
    this.nombre = nombre;
    this.urgencia = urgencia;
}

// Agregar un prototype a tarea

Tarea.prototype.mostrarInfoTarea = function(){
    return `La tarea ${this.nombre} tiene una prioridad de ${this.urgencia}`;
}

// Crear una nueva tarea

const tarea1 = new Tarea('Aprender JavaScript y React', 'Urgente');
const tarea2 = new Tarea('Pasear al perro', 'Media')
console.info(tarea1);
console.log(tarea1.mostrarInfoTarea());
console.info(tarea2.mostrarInfoTarea());
