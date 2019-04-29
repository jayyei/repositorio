

var arr = [
    //Bla bla bla
    "Fernando",
    //Bla bla bla
    {
        //Balalala
        nombre: "Fernando",
        apellido: "Herrera",
        getNombre:function () {
            //Bla bla bla
            return this.nombre + " " + this.apellido;
            }
    },

    //Tercera posicion del arreglo
    true,

    //Cuarta posicion
    function () { console.log (this);
    }
//Cierre del arreglo
];

console.warn(arr);
