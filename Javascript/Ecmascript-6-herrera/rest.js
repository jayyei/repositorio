// el operador rest se convierte en un arreglo de todos los parametros pasados a una funcion

function agregar_alumno(arr_alumnos, ...alumnos){
    console.log(alumnos);
    for ( let i = 0; i < arguments.length; i++){
        arr_alumnos.push(alumnos[i]);
    }
    return arr_alumnos
}

let alumnos_arr = ["Fernando", "Lucifer"];

let alumnos_arr2 = agregar_alumno(alumnos_arr, "Maria", "Pedro", "Susana", "Juan", "Becario 1", "Becario 2")

console.log(alumnos_arr2)

//en el ecmascript 5 se utilizaba los arguments para especificar esta tarea a realizar

//El operador rest debe de ir al final de los parametros de una funcion y no puede haber dos parametros de tipo rest en una funcion
//Porque dos arreglos indefinidos no se sabria donde termino el primo y donde empieza el segundo