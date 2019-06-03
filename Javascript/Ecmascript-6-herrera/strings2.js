let texto = "Hola";

console.log (texto.repeat(2)); //Repeat es nuevo en ecs6

const espacios = 12;

let nombres = [ "Fernando", "Melissa", "Juan"];
let telefonos = ["1224343", "23232323", "23213231"]

for (i in nombres){
    let dif = espacios - nombres[i].length;
    console.log(nombres[i] + " ".repeat(dif) + "|" + telefonos[i])
}