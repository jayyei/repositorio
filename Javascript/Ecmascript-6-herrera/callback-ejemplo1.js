

const getUsuarioById = (Id, callback) => {  //Esta definicion de funcion recibe dos parametros, un id y una funcion

    const usuario = {
        nombre: "Jayson",
        Id
    };
    if(Id===20){
        callback(`El usuario con el Id no existe ${Id}`, null);    
    } else 
    callback(null, usuario); //En algun momento de la funcion, esta puede llamar a la funcion que recibio como parametro
};                           //Incluso agregandole atributos que solo existan en esta funcion

getUsuarioById(20, (err, user)=>{  //Cuando se invoca esta funcion, debe de recibir sus dos parametros, aqui definimos cuantos parametros recibe el callback
    if(err)                        //Aquise define lo que hace el callback, todo loque ejecuta, mientras que en la definicion de arriba solo se llama
    console.log(err);
    else 
    console.log("El usuario en la base de datos", user);
})