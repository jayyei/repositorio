
function saludo(){
    alert("Hola mundo");
}

function ejecuta(){
    /*document hace referencia a todo el documento de html*/
    //document.getElementById("primero").onclick=saludo;
    //document.getElementsByTagName("p")[2].onclick=saludo;
    //document.getElementsByClassName("nombreClase")[0].onclick=saludo;
    //document.getElementByName("elname")[0].onclick=saludo;

    /*Nuevas etiquetas html para seleccionar elementos, querySelector y querySelectorAll*/
    document.querySelector("#principal p:last-child").onclick=saludo;
    var array = document.querySelectorAll("#principal p");
    console.log(array);

}
window.onload=ejecuta;
