
let persona = {
    saludar(){
        return "Hola"
    }
};

let amigo = {
    saludar(){
        /* return Object.getPrototypeOf(this).saludar(this) + ", saluddos!!"; //Version anterior para poder acceder a los metodos de un objeto heredado */
        return super.saludar() + ", saludos" //Nueva forma de acceder a metoods heredados, (Con el setPrototype ya que ahi se establece la relacion)

    }
};

Object.setPrototypeOf(amigo, persona);
console.log(amigo.saludar());
