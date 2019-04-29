//console.log("Hola mundo");

function crearCookie(nombre,valor){
    valor = escape(valor);
    var hoy = new Date();
    hoy.setSeconds(hoy.getSeconds() + 100);
    document.cookie = nombre + "=" + valor + ";expires=" + hoy.toUTCString()+";"; //Para determinar el tiempo de expiracion de las cookies
}

function getCookie(nombre){
    var cookies = document.cookie;
    var cookieArr = cookies.split("; ");
    for (var i = 0; i< cookieArr.length; i++){
        cookieArr[i] = cookieArr[i].split("=");
    if(cookieArr[i][0] === nombre){
        return unescape(cookieArr[i][1]);
    }
    } console.info(cookieArr);

}
// function borrarCookie( nombre ){}

/*
crearCookie("nombre", "Jay");
crearCookie("apellido", "Sanchez");
crearCookie("direccion", "Enrique Segoviano");
*/

/*
var cookies = document.cookie;
console.log(cookies);
*/
console.info(getCookie("apellido"));
