//Object.assign solo copia los parametros de un objeto

function mezclar(objReceptor, objDonador){
    Object.keys(objDonador).forEach( function(key){
        objReceptor[key] = objDonador[key]
    });
    return objReceptor
}

var objReceptor = {}
var objDonador = {
    get nombre(){
        return "mi-archivo.js" 
    }
}

console.log( mezclar( objReceptor, objDonador)) //Cuando el donador tiene get en el receptor estara el nombre, pero no la funcion getNombre

console.log( Object.assign( objReceptor, objDonador)) //Nuevo en el ECM6