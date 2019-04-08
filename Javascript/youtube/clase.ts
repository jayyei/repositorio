class Avenger {
    nombre:string = undefined;
    equipo:string = undefined;
    nombreReal:string = undefined;
    puedePelear:boolean = undefined;
    peleasGanadas:number = undefined;    

    constructor(nombre:string, equipo:string, nombreReal:string){
        this.nombre=nombre;
        this.equipo=equipo;
        this.nombreReal=nombreReal;
    }
}

let antman:Avenger = new Avenger("Antman", "El equipo del Cap", "Scott lang");

console.log(antman);