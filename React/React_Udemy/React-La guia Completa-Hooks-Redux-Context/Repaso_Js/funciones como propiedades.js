// Metodos o funciones en un objeto

const persona = {
    nombre: 'Juan',
    trabajo: 'Desarrollador web',
    edad: 23,
    musicaRock : true,
    mostrarInformacion: function() { // o puede ser mostrarInformacion(){...}
        console.log(`${this.nombre} es ${this.trabajo} y su edad es ${this.edad}`)
    }
}

persona.mostrarInformacion();
