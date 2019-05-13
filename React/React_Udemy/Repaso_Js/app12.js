//Arreglos y map

const carrito = ['producto1', 'producto2', 'producto 3'];
console.log(carrito);

const appContenedor = document.querySelector('#app');

// uso del foreach
let html = '';
carrito.forEach(producto => {
    html += `<li>${producto}</li>`;
})

appContenedor.innerHTML = html;

// Ejemplo basico de map
trailer = ['Producto 4', 'Producto 5', 'Producto 6'];
console.info(trailer.map(producto => 'El prodcuto es ' + producto));

const persona = {
    nombre : 'Juan',
    profesion: 'Desarrollador web',
    edad: 500
}

console.error(Object.keys(persona));
