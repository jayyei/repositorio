const descargarUsuarios = cantidad => new Promise((resolve, reject)=> {
    const api = `https://randomuser.me/api/?results=${cantidad}&nat=us`;

    const xhr = new XMLHttpRequest();

    xhr.open('GET', api, true);

    xhr.onload = () => {
        if(xhr.status === 200){
            resolve(JSON.parse(xhr.responseText).results);
        } else {
            reject(Error(xhr.statusText));
        }
    }

    xhr.send();
    xhr.onerror = (error) => reject(error);

});

descargarUsuarios(5)
.then((resultado)=>imprimir(resultado))
.catch((error)=>console.error(error));

function imprimir(usuarios) {
    let HTML = '';
    usuarios.forEach(usuario => {
        HTML += `
                <li>
                    Nombre: ${usuario.name.first} ${usuario.name.last}
                    Pais: ${usuario.nat}
                    Imagen:
                        <img src="${usuario.picture.medium}">
                </li>
        `;
    });

    const contenedorApp = document.querySelector('#app');
    contenedorApp.innerHTML = HTML;
}