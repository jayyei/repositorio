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

let getEmpleado = async(id) => {
    let empleadoDB = empleados.find(empleado => empleado.id === id);
    if (!empleadoDB) {
        throw new Error(`No existe un empleado con el id ${id}`); //para resolver o rechazar una promesa, solo se puede mandar un parametro ya sea en el resolve o en reject
    } else {
        return empleadoDB;
    }
}

let getSalario = async(empleado) => {
    let salario = salarios.find(salario => salario.id === empleado.id)
    if (!salario) {
        throw new Error(`No se encontro un salario para el usuario ${empleado.nombre}`)
    } else {
        return ({ nombre: empleado.nombre, salario: salario.id })
    }
}

let getInformacion = async(id) => { //Esto resuelve el infierno de los callbacks de una forma tan armoniosa com placentera
    let empleado = await getEmpleado(id);
    let salario = await getSalario(empleado);
    return salario
}

console.log(getInformacion(3).then(res => console.log(res))
    .catch(error => console.error(error)))