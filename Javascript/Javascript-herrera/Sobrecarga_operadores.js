
function creaProducto(nombre, precio) {
    nombre = nombre || "sin nombre";
    precio = precio || 0;
    console.log( "Producto: ", nombre, "precio: ", precio);
}

function creaProducto100(nombre){
    creaProducto(nombre, 100);
}
creaProducto("Lapiz" );
creaProducto100("Corrector");