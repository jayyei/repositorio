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

const getEmpleado = (id, callback) =>{
    const empleadoDB = empleados.find( empleado => empleado.id === id)
    if (!empleadoDB ){
        callback(`No existe empleado con el id ${id}`);
    } else {
        callback(null, empleadoDB)
    }
}

const getSalario = (empleado, callback) =>{
    const salarioDB = salarios.find( salario => salario.id === empleado.id)
    if(!salarioDB){
        callback(`No existe un salario para el empleado: ${empleado.nombre}`)
    } else {
        callback(null,{
            nombre: empleado.nombre,
            salario: salarioDB.salario,
            id: empleado.id

        })
    }
}

getEmpleado(2, (err, empleado)=>{
    if(err){
        return console.log(err);
    }

    getSalario( empleado, (err, respuesta)=>{
        if (err){
            return console.error(err)
        }
        console.log(`El salario de ${respuesta.nombre} es de ${respuesta.salario}`)
    })
})