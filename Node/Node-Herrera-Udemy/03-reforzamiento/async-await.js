let getNombre = async() => {
    //cualquier error que se realice aqui, disparara el catch de su resolucion en la promesa
    //Se puede disparar cualquier error aqui, y se mandara como el parametro al catch
    //throw new Error("JEJEJ")
    return 'Fernando';

}

// let funcion = async(){} :: es lo mismo que devolver una promesa en una funcion
/* let funcion = ()=>{
    return new Promise((resolve, reject)=>{
    } )}*/
let saludo = async() => {
    let nombre = await getNombre(); //el await hace que las funciones que devuelven promesas sean ejecutadas al momento, y se espera hasta obtener resolucion
    // si no responde nada, se quedara pegado ahi para siempre
    return nombre;
}

saludo().then(mensaje => console.log("hola", mensaje))