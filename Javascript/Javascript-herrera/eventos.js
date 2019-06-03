function evento(){
    console.log("Me dispare")
}

var objeto = document.getElementById("objDemo");
objeto.addEventListener("click", evento) //Aguado con el script, este debe de ir al final de cualquier declaracion en html que implique id
//Es mas recomendable manejar eventos con id que declarar funciones que los llamen
