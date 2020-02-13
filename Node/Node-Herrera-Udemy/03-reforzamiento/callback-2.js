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
]


let getEmpleado = (id, callback) => {
    let empleadoDB = empleados.find(empleado => empleado.id === id);

    if (!empleadoDB) {
        callback(`No existe un empleado con el id ${id}`)
    } else {
        callback(null, empleadoDB)
    }
}

let getSalario = (empleado, callback) => {

    let salario = salarios.find(salario => salario.id === empleado.id)

    if (!salario) {
        callback(`No se encontro un salario para el usuario ${empleado.nombre}`)
    } else {
        callback(undefined, { nombre: empleado.nombre, salario: salario.id })
    }
}

getEmpleado(3, (error, empleado) => {
    if (error) {
        console.error(error);
    } else {
        console.log(empleado);
        getSalario(empleado, (error, salario) => {
            if (error) {
                console.error(error);
            } else {
                console.log(salario)
            }
        });
    }
})

//El infierno de callbacks