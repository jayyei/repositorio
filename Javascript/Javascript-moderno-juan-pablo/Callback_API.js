

const paises = ['Francia', 'Espana', 'Portugal', 'Australia', 'Inglaterra', 'Irlanda' ];


//Se agrega un pais despues de x tiempo
function nuevoPais(pais, callback){
    setTimeout(function(){
        paises.push(pais)
        callback()
    }, 3000)
}

function mostrarPaises(){
    setTimeout(function(){
        let html = '';
        paises.forEach(function(pais){
            html += `<li>${pais}</li>`
        })
        document.getElementById('app').innerHTML = html
    }, 1500);
}

mostrarPaises();
nuevoPais("Alemania", mostrarPaises)