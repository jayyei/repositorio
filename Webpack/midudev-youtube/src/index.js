import React from 'react';
import ReactDOM from 'react-dom';

const obj = {a:1}

//manejo de opcionales avanzado
obj && obj.hola //Esta linea se sustituye por la siguiente
obj?.hola

ReactDOM.render(
    <h1>Hola mundo con React en modo 3</h1>,
    document.getElementById('app'))
