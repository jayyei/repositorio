// La destructuracion simplemente desfragmenta un objeto de acuerdo a la necesidad planteada

let ajustes = {
    nombre: "Fernando Herrera",
    email: "Fernando_Herrera@gmail.com",
    facebook: "Jay_yei",
    google: "No hay",
    premium: true
}

let nombre = ajustes.nombre,
    email = ajustes.email,
    facebook = ajustes.facebook

let { nombre, email, facebook, google, premium: DePAgo, twitter ="JAYEY"} = ajustes //Caso sencillo de una destructuracion, a la derecha el objeto base y a la izquiera los elementos que se quieren obtener de ella
//Con dos puntos, la propiedad adquiere un alias para que se pueda usar con un nombre diferente
//Se puede inicializar un atributo con valores por defecto con "=" solo si el parametro no tiene un valor 