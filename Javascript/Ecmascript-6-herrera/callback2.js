

const empleados = [{
    id: 1,
    nombre: "Fernando"
}, {id: 2,
nombre: "Herrera"
},  { id: 3,
nombre: "Jay"
}, ]

const salarios = [{
    id: 1,
    salario: 1000
}, {id: 2,
salario: 2000
}, ]

const getEmpleado = (id, callback) => {
    const empleadoDB = empleados.find( empleado => empleado.id === id)
    if(!empleadoDB){
        callback(`No existe el empleado con el id ${id}`)  //Para que nos sirve los callbacks?? simplemente para ejecutar una funcion despues de realizar otra funcion
    } else {
        callback(null, empleadoDB)
    }
}


//Uso

getEmpleado(2, (err, empleado)=>{
    if(err){
        return console.error(err)
    } else{
        console.log("empleado", empleado)
    }

})

const getSalario= (id, callback) =>{
    const salarioDB = salarios.find( salario => salario.id === id)

    if(!salarioDB){
        callback(`No se encontro el salario para la persona con el id ${id}`, null)
    } else {
        salarioDB.persona = empleados.find( empleado => empleado.id === id).nombre
        callback(null, salarioDB)
    }
}

getSalario(3, (er, empleado)=>{
    if(er){
       return console.error(er)
    } else{
        console.log("El empleado", empleado)
    }
})

