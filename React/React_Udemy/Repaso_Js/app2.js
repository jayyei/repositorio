//Templates


//Concatenar javascript
const nombre = 'Jay';
const trabajo = 'Trainee';
console.info('nombre: ' + nombre + ' trabajo: ' + trabajo);
console.warn(`Nombre: ${nombre} Trabajo: ${trabajo}`);

//Concatenar multiples lineas
const contenedorApp = document.querySelector('#app');
let html = '<ul>' + 
                '<li> Nombre: ' + nombre + '</li>' + 
                '<li> Trabajo: ' + trabajo + '</li>' + 
            '</ul>';
contenedorApp.innerHTML = html;

//Nueva forma de concatenar multiples lineas
let html2 = `
            <ul>
                <li> Nombre: ${nombre} </li>
                <li> Trabajo : ${trabajo} </li>
            </ul>
            `;
contenedorApp.innerHTML = html2;
