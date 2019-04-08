var Avenger = /** @class */ (function () {
    function Avenger(nombre, equipo, nombreReal) {
        this.nombre = undefined;
        this.equipo = undefined;
        this.nombreReal = undefined;
        this.puedePelear = undefined;
        this.peleasGanadas = undefined;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreReal = nombreReal;
    }
    return Avenger;
}());
var antman = new Avenger("Antman", "El equipo del Cap", "Scott lang");
console.log(antman);
