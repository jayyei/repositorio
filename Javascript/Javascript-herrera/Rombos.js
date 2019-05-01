
var arreglo1 = [1,1,2,2,2,3,3];
var arreglo2 = [3,4,1,3,5,3,4];
function encontrarRombos(arreglo1, arreglo2) {
    var repetidos_arreglo1 = arreglo1.filter(function(item, index, array) {
        return array.indexOf(item) === index;
    })
    var repetidos_arreglo2 = arreglo2.filter(function(item, index, array) {
        return array.indexOf(item) === index;
    })
    console.info(repetidos_arreglo1);
    console.info(repetidos_arreglo2);
}

encontrarRombos(arreglo1, arreglo2);
