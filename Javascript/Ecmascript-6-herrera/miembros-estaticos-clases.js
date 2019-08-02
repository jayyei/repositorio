// Los metodos estaticos no necesitan una instancia de clase para ser llamados
let metodoComputado ="El metodo computado"
class Persona{
    constructor(nombre){
        this.nombre = nombre
    }

    decirNombre(){
        console.log(this.nombre)
    }

    static [metodoComputado](){
        console.log("grito que grito")
    }

    static crear(nombre){ //La palabra static sirve en javascript para definir metodos que no requieran una instancia para ser llamados
        return "Hy hidra"
    }       
}

let cadena = Persona.crear("DF");
console.log(cadena)
