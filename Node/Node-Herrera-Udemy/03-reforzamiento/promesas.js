let empleados = [{
        id: 1,
        nombre: 'Jay'
    },
    {
        id: 2,
        nombre: 'Melissa'
    },
    {
        id: 3,
        nombre: 'Juan'
    }
];

let salarios = [{
        id: 1,
        salario: 1000
    },
    {
        id: 2,
        salario: 2000
    },
];

let getEmpleado = (id) => {

    return new Promise((resolve, reject) => {
        let empleadoDB = empleados.find(empleado => empleado.id === id);

        if (!empleadoDB) {
            reject(`No existe un empleado con el id ${id}`); //para resolver o rechazar una promesa, solo se puede mandar un parametro ya sea en el resolve o en reject
        } else {
            resolve(empleadoDB);
        }
    })

}

let getSalario = (empleado) => {
    return new Promise((resolve, reject) => {
        let salario = salarios.find(salario => salario.id === empleado.id)
        if (!salario) {
            reject(`No se encontro un salario para el usuario ${empleado.nombre}`)
        } else {
            resolve({ nombre: empleado.nombre, salario: salario.id })
        }
    })

}

//promesas no encadenadas: en cada then se especifican las dos funciones a realizar y de forma separada, cada then tendra sus propias dos funciones
getEmpleado(1).then(empleado => {
    getSalario(empleado).then(salario => console.log(salario), error => console.log(error));
}, error => console.log(error));

//promesas encadenadas: dentro de la funcion resolve del primer then, debe de regresar otra promesa
//la primera funcion debe de devolver otra promesa para su encadenamiento
// esto quiere decir, que debe de regresar una funcion (getSalario()) que devuelva una promesa y asi encadenar los then afuera del llamado de la segunda funcion
getEmpleado(3).then(empleado => getSalario(empleado))
    .then(resp => console.log(resp))
    .catch(error => console.log(error))