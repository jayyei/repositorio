const empleados = [{
    id: 1,
    nombre: "Jay"
}, {
    id: 2,
    nombre: "Yei"
}, {
    id: 3,
    nombre: "JayYei"
}]

const salarios = [{
    id: 1,
    salario: 1000
}, {
    id: 2,
    salario: 2000}
]

const getEmpleado = (id) =>{
    return new Promise((resolve, reject)=>{
        const empleadoDB = empleados.find( empleado => empleado.id === id)
        if (!empleadoDB ){
            reject(`No existe empleado con el id ${id}`);
        } else {
            resolve(empleadoDB)
        }

    })
}

const getSalario = (empleado) =>{
    return new Promise((resolve, reject)=>{
        const salarioDB = salarios.find( salario => salario.id === empleado.id)
        if(!salarioDB){
            reject(`No existe un salario para el empleado: ${empleado.nombre}`)
        } else {
            resolve({
                nombre: empleado.nombre,
                salario: salarioDB.salario,
                id: empleado.id
    
            })
        }

    })
}


//En la ultima version, solo se ejecuta el metodo getEmpleado, se entiende que lo que devuelve 
//el resolve es un empleadoDB y lo que se ejecute en el then lo recibira implicitamente como parametro
//Es por ello que getSalario esta sin argumentos
//como getSalario devuelve promesa, entonces la respuesta se maneja en el resolve de dicha promesa

//V3
getEmpleado(1)
    .then( getSalario)
    .then( resp => console.log(resp))
.catch( err => console.log(err));

//En la V2 observamos quesi en el resolve (then) de la primera solucion llamamos una funcion que 
//Devuelve una promesa, entonces ese then puede ser seguido de otro then que resuelva la promesa
//que devuelve el metodo que se llamo en el primer then
/* getEmpleado(1).then( empleado => {  //V2
    return getSalario(empleado);
    })
    .then(resp => console.log( resp))
    .catch( err => console.error(err)) */


    // En la version 1 se observa como es explicitamente el encadenamiento

/*  V1 getEmpleado(1).then( empleado => {
    console.log(`El empleado es ${empleado.nombre}`)
    getSalario(empleado).then( resp => {
        console.log(resp)
    })
}).catch( err => console.error(err)) */


//Este ejemplo va directamente relacionado con callback2-1js siempre compara uno con el otro