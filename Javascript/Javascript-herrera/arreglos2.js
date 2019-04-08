var arr = [
    true,
    { nombre: "Jay",
      apellido: "Sanchez"
    },
    function(){
    console.log("Estoy viviendo en un arreglo");
    },
    function(persona){
    console.log( persona.nombre + " " + persona.apellido);
    },
    ["J","A","Y",["S","A","N","C","H","E","Z"]],
    true];

console.info(arr);
console.log( arr[1].nombre + " " + arr[1].apellido);

arr[2]();
arr[3](arr[1]);

console.warn(arr[4][3][1]);

arr[4][3][1] = "á";
console.warn(arr[4][3][1]);
