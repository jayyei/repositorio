// La poo en javascript se encontraba basada en prototipos y no en clases (ES6 introduce clases)
//Los prototipos son un conjunto de normas para integrar la poo en javascript pero con los prototipos 
// Nosostros somos capaces de realizar tareas como: HErencia, encapsulamiento, abstraccion y polimorfismo


let gato ={
    sonido(){     //Aqui se omiten las funciones A esto se le llama metodos concisos
        console.log("Miau")
    },
    chillido(){
        console.log("MIAUUU")
    }
}

let perro = {
    sonido() {
        console.log("Guaau!!")
    }
};

let angora = Object.create( gato ); //Pra crear un objeto de tipo gato, tambien se puede con new
console.log( Object.getPrototypeOf(angora) === gato) //Object.getPrototypeOf te trae el prototipo del que esta hecho angora(Esto es todos los metodos que contiene el objeto base gato)
angora.sonido();
angora.chillido();

Object.setPrototypeOf( angora, perro); //NUEVO EN ECM6 el setPrototytpe cambia el prototipo de una instancia de objeto hecha por otro de un objeto, en este caso perro
console.log( Object.getPrototypeOf(angora) === gato) 
angora.sonido();
angora.chillido();