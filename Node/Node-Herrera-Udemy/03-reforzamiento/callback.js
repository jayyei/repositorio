let getUsuarioById = (id, callback) => {

    let usuario = {
        nombre: 'Fernando',
        id
    }

    if (id === 20) {
        callback(`El usuario con id ${id}, no existe en la base de datos`)
    } else {
        callback(undefined, usuario)
    }
}

getUsuarioById(20, (error, usuario) => { //El primer parametro de un callback suele ser un error
    if (error) {
        return console.error(error);
    }
    console.log('Usuario de base de datos', usuario);
})