class Rectangulo{
    constructor(alto, largo){
        this.alto = alto;
        this.largo = largo;
    }
    getArea(){
        return this.alto * this.largo;
    }
}

let rectangulo = new Rectangulo(3,2);
console.log(rectangulo.getArea());

class Cuadrado extends Rectangulo{  //LA palabra extends significa que hereda de la clase Rectangulo
    constructor(alto){
        super(alto, alto); //Con super se ejecuta el constructor de la clase padre, si se detalla el metodo con super.metodo() solo ejecutas el metodo señalado 
    }
    getArea(){  //Con esto se sobre escriben metodos del padre
        
        return super.getArea() +" HY hydra" //Con super.metodoAllamar ejecutas cualquie metodo disponible del padre
    }
}

let cuadrado = new Cuadrado ( 3 ); //El cuadrado es una instancia de cuadrado y de rectangulo
console.log(cuadrado.getArea())